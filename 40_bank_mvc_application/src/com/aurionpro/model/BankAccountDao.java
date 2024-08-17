package com.aurionpro.model;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class BankAccountDao {

    private static final BigDecimal MIN_BALANCE = new BigDecimal("5000.00");

    public String addBankAccount(int customerId, String accountType, String balance) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String accountNumber = generateAccountNumber();
        BigDecimal balanceAmount;

        try {
            // Validate and convert the balance
            balanceAmount = new BigDecimal(balance);

            if (balanceAmount.compareTo(MIN_BALANCE) < 0) {
                throw new IllegalArgumentException("Initial deposit must be at least 5000.");
            }

            if (balanceAmount.signum() == -1) {
                throw new IllegalArgumentException("Balance cannot be negative.");
            }

            // Establish database connection and execute insert statement
            connection = DbUtil.getConnection();
            String sql = "INSERT INTO bank_account (customer_id, account_number, account_type, balance) VALUES (?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, customerId);
            preparedStatement.setString(2, accountNumber);
            preparedStatement.setString(3, accountType);
            preparedStatement.setBigDecimal(4, balanceAmount);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error while adding bank account.", e);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage(), e);
        } finally {
            closeResources(preparedStatement, connection);
        }

        return accountNumber;
    }

    private String generateAccountNumber() {
        // Ensure account number format is consistent and unique
        return "ACC" + String.format("%06d", new Random().nextInt(1000000));
    }
    
    public BigDecimal getAccountBalance(String accountNumber) {
        BigDecimal balance = BigDecimal.ZERO;
        Connection connection = null;
        PreparedStatement ps = null;
        String sql = "SELECT balance FROM bank_account WHERE account_number = ?";
        try {
            connection = DbUtil.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1, accountNumber);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    balance = rs.getBigDecimal("balance"); // Use BigDecimal
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(ps, connection);
        }
        return balance;
    }

    private void closeResources(PreparedStatement preparedStatement, Connection connection) {
        try {
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}