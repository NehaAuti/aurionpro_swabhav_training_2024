package com.aurionpro.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnection {

	 private Connection connection = null;
	 private Statement statement = null;
	 private PreparedStatement preparedStatement= null;
	 
	 public void connectToDb() {
	  try {
	   
	   //1. Register Driver
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   
	   
	   //2. Create Connection
	   connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization", "root","root");
	   System.out.println("Connection Succesfull");
	      
	  } catch (ClassNotFoundException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	  catch (SQLException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	  
	 }
	 
	 public void getOrganizationDetails() {
	  
	  //3. Create Statement
	  
	  try {
	   statement = connection.createStatement();
	   //4. Execute query and store it in a ResultSet
	   ResultSet dbOrganizationData = statement.executeQuery("select * from employee");
	   
	   while(dbOrganizationData.next()) {
	    System.out.println(dbOrganizationData.getInt(1)+"\t"+dbOrganizationData.getString(2)+"\t"+dbOrganizationData.getString(3));
	   }
	  } catch (SQLException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	  
	  
	 }
	 
	 public void addOrganizationDetails() {

	  try {
	   statement = connection.createStatement();
	   //5. Add a record into the data
	   
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter your employee no:");
	   int employee_no=scanner.nextInt();
	   System.out.println("Enter your employee name:");
	   String employee_name=scanner.next();
	   System.out.println("Enter your Job:");
	   String job=scanner.next();
	   
	   
	    preparedStatement= connection.prepareStatement("insert into department values(?,?,?)");
	    preparedStatement.setInt(1, employee_no);
	    preparedStatement.setString(2, employee_name);
	    preparedStatement.setString(3, job);
	    preparedStatement.executeUpdate();
	    
	    
	     //statement.executeUpdate("Insert into department values"+departmentNumber+",'"+departmentName+"',"+"'"+location+"'");
	   
	  } catch (SQLException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  } 
	  
	 }
	 

	}
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Scanner;
//
//public class DbConnection {
//	
//	private Connection connection = null;
//	private Statement statement = null;
//    private preparedStatement = null;
//    
//	public void connectoDb()
//	{
//		try {
//			
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","root");
//			System.out.println("Connection Successfull");
//			statement = connection.createStatement();
//		}
//			
//	    public void getOrganizationDetails() {
//			
//		 try { 
//			 Statement statement = connection.createStatement();
//		 
//			 ResultSet dbOrganizationData = statement.executeQuery("Select * from employee");
//		     
//		    
//		    while (dbOrganizationData.next())
//		    {
//		    	System.out.println(dbOrganizationData.getInt("employee_no")+"\t" +dbOrganizationData.getString("employee_name")+"\t"+
//		    			dbOrganizationData.getDouble("salary"));
//		    
//		    //System.out.println("Connection Successfull");
//		        
//		}
//		    }
//		
//		catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//			}
//		public void addOrganization() {
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("Enter EmployeeNo:");
//			int employeeno = scanner.nextInt();
//			
//			System.out.println("Enter EmployeeName:");
//		    String employeename = scanner.next();
//			
//			System.out.println("Enter EmployeeSalary:");
//			double salary = scanner.nextInt();
//			try {
//			
//				//statement.executeUpdate("insert into employee values("+employeeno+","+employeename+","+salary+")");		
//			    System.out.println("Record inserted successfully");
//			  //  statement.executeUpdate(" insert into employee values(101,'Neha',40000)");
//		
//			}
//			
//			catch(SQLException e)
//			{
//			e.printStackTrace();
//			}	
//	}
//}
//	
////	preparedStatement = connection.prepareStatement("insert into employee values(?,?,?)");
////	
////	prepareStatement.SetInt(1, employeeno);
////	prepareStatement.SetString(2, employeename);
////	prepareStatement.SetDouble(3, salary);
////	
////	prepareedStatement.executeUpdate();
//
