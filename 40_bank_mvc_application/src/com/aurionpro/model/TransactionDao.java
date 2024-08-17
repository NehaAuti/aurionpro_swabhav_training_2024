package com.aurionpro.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.entity.Transaction;

public class TransactionDao {
    private Connection connection;

    public TransactionDao() {
        connection = DbUtil.getConnection();
    }

    public List<Transaction> getTransactions(String transactionType, Date startDate, Date endDate, String sortOrder) {
        List<Transaction> transactions = new ArrayList<>();
        StringBuilder sql = new StringBuilder("SELECT * FROM passbook WHERE 1=1");

        if (transactionType != null && !transactionType.isEmpty()) {
            sql.append(" AND transaction_type = ?");
        }
        if (startDate != null) {
            sql.append(" AND transaction_date >= ?");
        }
        if (endDate != null) {
            sql.append(" AND transaction_date <= ?");
        }
        if (sortOrder != null && !sortOrder.isEmpty()) {
            sql.append(" ORDER BY ").append(sortOrder);
        }

        try (PreparedStatement ps = connection.prepareStatement(sql.toString())) {
            int index = 1;
            if (transactionType != null && !transactionType.isEmpty()) {
                ps.setString(index++, transactionType);
            }
            if (startDate != null) {
                ps.setDate(index++, startDate);
            }
            if (endDate != null) {
                ps.setDate(index++, endDate);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Transaction transaction = new Transaction();
                transaction.setId(rs.getInt("id"));
                transaction.setSenderAccno(rs.getString("sender_accno"));
                transaction.setReceiverAccno(rs.getString("receiver_accno"));
                transaction.setTransactionType(rs.getString("transaction_type"));
                transaction.setAmount(rs.getBigDecimal("amount"));
                transaction.setTransactionDate(rs.getDate("transaction_date"));
                transactions.add(transaction);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return transactions;
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
}