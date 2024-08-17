package com.aurionpro.test;

import com.aurionpro.model.DbConnection;

public class DbTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         DbConnection  connection = new DbConnection();
         connection.connectToDb();
         connection.getOrganizationDetails();
         connection.addOrganizationDetails();
         connection.getOrganizationDetails();

	     
	}

}
