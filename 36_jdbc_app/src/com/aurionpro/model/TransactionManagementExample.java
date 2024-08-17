package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionManagementExample {

    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/emp_details";
        String user = "root";
        String password = "root";

        // SQL statements for transaction
        String insertEmployee1 = "INSERT INTO Employees (id, name, salary) VALUES (?, ?, ?)";
        String insertEmployee2 = "INSERT INTO Employees (id, name, salary) VALUES (?, ?, ?)";
        String checkEmployeeExistence = "SELECT COUNT(*) FROM Employees WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Disable auto-commit mode
            connection.setAutoCommit(false);

            try (PreparedStatement checkStatement = connection.prepareStatement(checkEmployeeExistence);
                 PreparedStatement statement1 = connection.prepareStatement(insertEmployee1);
                 PreparedStatement statement2 = connection.prepareStatement(insertEmployee2)) {

                // Check and insert first employee
                checkStatement.setInt(1, 1);
                ResultSet rs1 = checkStatement.executeQuery();
                rs1.next();
                if (rs1.getInt(1) == 0) { // No existing record
                    statement1.setInt(1, 1);
                    statement1.setString(2, "John Doe");
                    statement1.setBigDecimal(3, new java.math.BigDecimal("50000.00"));
                    statement1.executeUpdate();
                } else {
                    System.out.println("Employee with ID 1 already exists.");
                }

                // Check and insert second employee
                checkStatement.setInt(1, 2);
                ResultSet rs2 = checkStatement.executeQuery();
                rs2.next();
                if (rs2.getInt(1) == 0) { // No existing record
                    statement2.setInt(1, 2);
                    statement2.setString(2, "Jane Smith");
                    statement2.setBigDecimal(3, new java.math.BigDecimal("60000.00"));
                    statement2.executeUpdate();
                } else {
                    System.out.println("Employee with ID 2 already exists.");
                }

                // Commit the transaction
                connection.commit();
                System.out.println("Transaction committed successfully!");

            } catch (SQLException e) {
                // Rollback the transaction in case of an error
                try {
                    connection.rollback();
                    System.out.println("Transaction rolled back due to an error.");
                } catch (SQLException rollbackEx) {
                    rollbackEx.printStackTrace();
                }
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
