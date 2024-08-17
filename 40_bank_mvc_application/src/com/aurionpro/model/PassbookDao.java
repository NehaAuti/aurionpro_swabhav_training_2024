package com.aurionpro.model;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.entity.Passbook;
import com.aurionpro.entity.Transaction;


public class PassbookDao {
    private Connection connection;

    public PassbookDao() {
        connection = DbUtil.getConnection();
    }

    public List<String> getAccountNumbersByCustomerId(int customerId) {
        List<String> accountNumbers = new ArrayList<>();
        String sql = "SELECT account_number FROM bank_account WHERE customer_id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, customerId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    accountNumbers.add(rs.getString("account_number"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accountNumbers;
    }

    public List<Passbook> getTransactionsByAccounts(List<String> accountNumbers, String receiverAccountNumber, Date startDate, Date endDate, String sortOrder, String accountStatus) {
        List<Passbook> passbookEntries = new ArrayList<>();
        StringBuilder sql = new StringBuilder("SELECT p.*, b.status FROM passbook p JOIN bank_account b ON p.sender_accno = b.account_number WHERE ");

        // Building SQL query for account numbers
        if (accountNumbers != null && !accountNumbers.isEmpty()) {
            sql.append("(");
            for (int i = 0; i < accountNumbers.size(); i++) {
                sql.append("p.sender_accno = ? ");
                if (i < accountNumbers.size() - 1) {
                    sql.append("OR ");
                }
            }
            sql.append(")");
            if (receiverAccountNumber != null && !receiverAccountNumber.isEmpty()) {
                sql.append(" OR p.receiver_accno = ?");
            }
        } else if (receiverAccountNumber != null && !receiverAccountNumber.isEmpty()) {
            sql.append("p.receiver_accno = ?");
        } else {
            sql.append("1=1"); // Default to no filter if nothing is provided
        }

        // Adding date filters
        if (startDate != null) {
            sql.append(" AND p.transaction_date >= ?");
        }
        if (endDate != null) {
            sql.append(" AND p.transaction_date <= ?");
        }

        // Adding account status filter
        if (accountStatus != null && !accountStatus.isEmpty()) {
            sql.append(" AND b.status = ?");
        }

        // Adding sort order
        if ("desc".equalsIgnoreCase(sortOrder)) {
            sql.append(" ORDER BY p.transaction_date DESC");
        } else {
            sql.append(" ORDER BY p.transaction_date ASC");
        }

        try (PreparedStatement ps = connection.prepareStatement(sql.toString())) {
            int index = 1;
            // Setting account numbers
            if (accountNumbers != null) {
                for (String accNo : accountNumbers) {
                    ps.setString(index++, accNo);
                }
            }
            // Setting receiver account number
            if (receiverAccountNumber != null && !receiverAccountNumber.isEmpty()) {
                ps.setString(index++, receiverAccountNumber);
            }
            // Setting date filters
            if (startDate != null) {
                ps.setDate(index++, startDate);
            }
            if (endDate != null) {
                ps.setDate(index++, endDate);
            }
            // Setting account status
            if (accountStatus != null && !accountStatus.isEmpty()) {
                ps.setString(index++, accountStatus);
            }

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Passbook passbook = new Passbook();
                    passbook.setId(rs.getInt("id"));
                    passbook.setSenderAccno(rs.getString("sender_accno"));
                    passbook.setReceiverAccno(rs.getString("receiver_accno"));
                    passbook.setTransactionType(rs.getString("transaction_type"));
                    passbook.setAmount(rs.getBigDecimal("amount")); // Use BigDecimal here
                    passbook.setTransactionDate(rs.getDate("transaction_date"));
                    passbook.setStatus(rs.getString("status")); // Set status
                    passbookEntries.add(passbook);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return passbookEntries;
    }

    public void saveTransaction(Transaction transaction) {
        String sql = "INSERT INTO passbook (sender_accno, receiver_accno, transaction_type, amount, transaction_date) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, transaction.getSenderAccno());
            ps.setString(2, transaction.getReceiverAccno());
            ps.setString(3, transaction.getTransactionType());
            ps.setBigDecimal(4, transaction.getAmount());
            ps.setDate(5, transaction.getTransactionDate());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public BigDecimal getBalanceByAccountNumber(String accountNumber) {
        BigDecimal balance = BigDecimal.ZERO; // Initialize with BigDecimal.ZERO for better clarity
        String sql = "SELECT balance FROM bank_account WHERE account_number = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, accountNumber);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    balance = rs.getBigDecimal("balance");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return balance;
    }
}