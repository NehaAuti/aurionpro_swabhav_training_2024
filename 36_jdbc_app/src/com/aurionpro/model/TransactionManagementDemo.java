package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TransactionManagementDemo { 
	private Connection connection = null;
	private PreparedStatement preparedStatement = null; 
	
	public void connectToDb() 
 {
		Scanner scanner = new Scanner(System.in);
		
		try {
        // Load MySQL JDBC Driver  
    	Class.forName("com.mysql.cj.jdbc.Driver");
      // Establish connection
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization", "root", "root"); 
      System.out.println("Connection Successful!!");
      connection.setAutoCommit(false);   
      // Prepare the SQL statement  
      preparedStatement = connection.prepareStatement("INSERT INTO department VALUES(?, ?, ?)");
      while(true) {
      System.out.println("Enter Department No: ");  
      int department_no = scanner.nextInt();
      scanner.nextLine();     
      System.out.println("Enter Department name: ");       
      String department_name = scanner.nextLine();
      System.out.println("Enter location: ");
      String location = scanner.nextLine();          
          
      preparedStatement.setInt(1, department_no);    // Set the parameters
      preparedStatement.setString(2, department_name);         
      preparedStatement.setString(3, location);
      preparedStatement.executeUpdate();   
      System.out.println("commit/rollback");
      String answer1 = scanner.nextLine();          
          
      if(answer1.equalsIgnoreCase("commit")) {       
      connection.commit();
      System.out.println("Transaction committed.");    
           
      }
        
      else if(answer1.equalsIgnoreCase("rollback"))
          
      {
           
    	  connection.rollback();         
          System.out.println("Transaction rolled back.");
      }          
          
      System.out.println("Do you want to continue? (y/n): ");      
      String answer2 = scanner.nextLine();
      if(answer2.equalsIgnoreCase("n")) {
      break;       
          
      }
      
   }
      connection.commit(); // Final commit after all transactions  
      System.out.println("Record Saved Successfully!");
 }
		catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver not found."); 
			e.printStackTrace();
       }catch (SQLException e) { 
    	   try {
    		   if (connection != null) {  
    			   connection.rollback();
    			   System.out.println("Transaction rolled back due to an error.");    }
    		   } catch (SQLException rollbackEx) {
    			   rollbackEx.printStackTrace();
    			   }System.out.println("Error connecting to the database.");
    			   e.printStackTrace();  }
		finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();    
					}
				if (connection != null) {
					connection.close();
    }
				scanner.close();
   } 
			catch (SQLException e) {  
	           e.printStackTrace();
         }  
			
	}
 
 }
	

}