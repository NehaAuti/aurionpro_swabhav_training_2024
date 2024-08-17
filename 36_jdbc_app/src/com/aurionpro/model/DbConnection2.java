package com.aurionpro.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class DbConnection2 {    
	private Connection connection = null;
    private Statement statement = null;   
    private PreparedStatement preparedStatement = null;
    public void connectToDb() {
        try {            
        	// Load the MySQL JDBC driver
            
        	Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection           
        	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization", "root", "root");
            System.out.println("Connection Successful");            
            // Get and display data
            getDepartmentDetails();
        } 
        catch (ClassNotFoundException e)
        {
        	System.out.println("JDBC Driver not found.");
            e.printStackTrace();
            } catch (SQLException e) {
            System.out.println("Error connecting to the database.");          
            e.printStackTrace();
        }    
        }
    public void getDepartmentDetails() {
        ResultSet resultSet = null;     
        try {
            // Create a statement   
        	statement = connection.createStatement();
            // Execute a query
            resultSet = statement.executeQuery("SELECT * FROM department");
            // Process the result set        
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("department_no") + " " + resultSet.getString("department_name") + " " + resultSet.getString("location"));            }
        } catch (SQLException e) {
            System.out.println("Error retrieving data.");           
            e.printStackTrace();
        }    
        }
    public void addDepartment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Department No: ");     
        int department_no = scanner.nextInt();
        System.out.println("Enter Department name: ");
        String department_name = scanner.next();     
        System.out.println("Enter location: ");     
        String location = scanner.next();
             try {
            // Use PreparedStatement to execute the insert            
            preparedStatement = connection.prepareStatement("INSERT INTO department VALUES (?, ?, ?)");
            preparedStatement.setInt(1, department_no);         
            preparedStatement.setString(2, department_name);
            preparedStatement.setString(3, location);            
            preparedStatement.executeUpdate();
                     System.out.println("Record Inserted");
                 } catch(SQLException e) {
            e.printStackTrace();        } 
    }}

