package com.aurionpro.test;

import com.aurionpro.model.DbConnection2;

public class DBTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbConnection2 connection = new DbConnection2(); 
		connection.connectToDb();
		 connection.getDepartmentDetails();
		 connection.addDepartment();

	}

}
