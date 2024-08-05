package com.aurionpro.creational.singleton.test;

import com.aurionpro.creational.singleton.model.DatabaseCreation;

public class DatabaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseCreation databse1 = DatabaseCreation.getDatabseCreation();
		databse1.status();
	        
	    System.out.println(databse1.hashCode());
	        
	    DatabaseCreation database2 = DatabaseCreation.getDatabseCreation();
	    database2.status();
	        
	    System.out.println(database2.hashCode());

	}

}
