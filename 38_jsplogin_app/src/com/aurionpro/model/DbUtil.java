package com.aurionpro.model;

import java.sql.Connection;



import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DbUtil {

	private Connection connection=null ;
	private Statement statement=null;
	private static DbUtil dbUtil = null;
			private DbUtil()
			{
		
			}
	
			public static DbUtil getDbUtil()
			{
				if(dbUtil==null)
					dbUtil = new DbUtil();
				return dbUtil;
			}
	
	public void connectToDb() 
	{
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
	
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root","root");
		
	        System.out.println("Connection Successful");
	
		statement = connection.createStatement();
	}
	   catch (SQLException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		   System.out.println("error connecting to database"+e);
	} 
		 catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println(e);
	}
}
	
	public ResultSet getAllUsers()
	{
		ResultSet dbUsers= null;
		try {
			dbUsers=statement.executeQuery("select * from users");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dbUsers;
	}
	   
	
	public boolean validateCredentials(String username, String password) {
	    ResultSet dbUsers = getAllUsers();
	    try {
	        while (dbUsers.next()) {
	            // Retrieve the username and password from the current row
	            String dbUsername = dbUsers.getString("username");
	            String dbPassword = dbUsers.getString("password");

	            // Check if both username and password match
	            if (dbUsername.equals(username) && dbPassword.equals(password)) {
	                return true;
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return false;
	}	
}
