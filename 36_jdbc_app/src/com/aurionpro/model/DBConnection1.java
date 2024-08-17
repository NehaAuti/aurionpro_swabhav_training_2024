package com.aurionpro.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBConnection1 {

 private Connection connection = null;
 private Statement statement = null; 
 private PreparedStatement preparedStatements = null;
 
 public void connectToDb() {
  try {
   //1. Register Driver
   Class.forName("com.mysql.cj.jdbc.Driver");
   
   //2. Create Connection
   connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root","root");
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
 
 public void getSupplierDetails() {
  
  //3. Create Statement
  
  try {
   statement = connection.createStatement();
   //4. Exexute query and store it in a ResultSet
   ResultSet dbSupplierData = statement.executeQuery("select * from suppliers");
   
   while(dbSupplierData.next()) {
    System.out.println(dbSupplierData.getInt("supplier_id") + "\t" 
         + dbSupplierData.getString("supplier_name") + "\t"
         + dbSupplierData.getString("contact_info") + "\t"
         + dbSupplierData.getString("address"));
   }
  } catch (SQLException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  
  
 }
 
 public void addSupplierDetails() {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the Supplier id:");
  int supplier_id = sc.nextInt();
  
  System.out.println("Enter the Name:");
  String supplier_name = sc.next();
 
  System.out.println("Enter the ContactInfo:");
  String contact_info = sc.next();
  
  System.out.println("Enter the Address:");
  String address = sc.next();
  
  
  
  try {
   //statement = connection.createStatement();
   //4. Exexute query and store it in a ResultSet
      //statement.executeUpdate("insert into suppliers values("+SupplierID+",'" +name+",'" + contact+ "', '"+address+ "')");
   
   preparedStatements = connection.prepareStatement("insert into suppliers values(?,?,?,?)");
   preparedStatements.setInt(1, supplier_id);
   preparedStatements.setString(2, supplier_name);
   preparedStatements.setString(3, contact_info);
   preparedStatements.setString(4, address);
   preparedStatements.executeUpdate();
   System.out.println("Record inserted successfully");
  } catch (SQLException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  
 }
 

}