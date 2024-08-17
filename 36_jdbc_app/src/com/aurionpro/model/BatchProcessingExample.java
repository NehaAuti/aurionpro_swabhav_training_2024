package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchProcessingExample {

    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/emp_details";
        String user = "root";
        String password = "root";

        // SQL statement for batch processing
        String sql = "INSERT INTO employees (id,name,salary) VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            // Add multiple insert statements to the batch
            statement.setInt(1, 1);
            statement.setString(2, "John Doe");
            statement.setBigDecimal(3, new java.math.BigDecimal("50000.00"));
            statement.addBatch();

            statement.setInt(1, 2);
            statement.setString(2, "Jane Smith");
            statement.setBigDecimal(3, new java.math.BigDecimal("60000.00"));
            statement.addBatch();

            statement.setInt(1, 3);
            statement.setString(2, "Alice Johnson");
            statement.setBigDecimal(3, new java.math.BigDecimal("70000.00"));
            statement.addBatch();

            // Execute the batch
            int[] result = statement.executeBatch();

            // Print the results
            System.out.println("Batch processed. Number of rows affected: " + result.length);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}