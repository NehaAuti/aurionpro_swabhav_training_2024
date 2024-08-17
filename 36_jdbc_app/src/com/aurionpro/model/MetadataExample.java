package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

public class MetadataExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/organization";
        String user = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Get DatabaseMetaData
            DatabaseMetaData dbMetaData = connection.getMetaData();

            // Get ResultSet from a query
            String query = "SELECT * FROM employee";
            
           
            try (Statement statement = connection.createStatement(); 
            	ResultSet resultset = statement.executeQuery(query)) {
                // Get ResultSetMetaData
                ResultSetMetaData resultsetMetaData = resultset.getMetaData();
                
                // Number of columns
                int columnCount = resultsetMetaData.getColumnCount();
                System.out.println("Number of columns: " + columnCount);
                
                // Column details
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = resultsetMetaData.getColumnName(i);
                    String columnType = resultsetMetaData.getColumnTypeName(i);
                    System.out.println("Column " + i + ": " + columnName + " (" + columnType + ")");
                }

                // Counting rows
                int rowCount = 0;
                while (resultset.next()) {
                    rowCount++;
                }
                System.out.println("Number of rows: " + rowCount);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
