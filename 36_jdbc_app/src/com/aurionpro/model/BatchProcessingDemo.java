package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BatchProcessingDemo 
{
	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null; 
	public void connectToDb() {  
		try {   // Load Oracle JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");   
   // Establish connection 
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization", "root", "root");
			System.out.println("Connection Successfull!!");   
   // Prepare the SQL statement  
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO department VALUES(?, ?, ?)");
			Scanner scanner = new Scanner(System.in);
			while(true) {
				System.out.println("Enter Department No: ");    
				int department_no = scanner.nextInt();
				System.out.println("Enter Department name: ");
				String department_name = scanner.next();
				System.out.println("Enter location: ");
				String location = scanner.next();
                    // Set the parameters
				preparedStatement.setInt(1, department_no);
				preparedStatement.setString(2, department_name);
				preparedStatement.setString(3, location);
				preparedStatement.addBatch();        // for executing the batch
				System.out.println("Do you want to continue?: y/n");
				String answer = scanner.next();
				if(answer.startsWith("n")) 
				{
					break;          
				}
             }
			preparedStatement.executeBatch();
            System.out.println("Record Inserted");
            } catch (ClassNotFoundException e) {  
            	System.out.println("JDBC Driver not found.");
            	e.printStackTrace(); 
            	} catch (SQLException e) {
            		System.out.println("Error connecting to the database.");
                    e.printStackTrace();  }
    }
}