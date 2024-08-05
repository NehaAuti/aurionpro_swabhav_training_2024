package com.aurionpro.creational.singleton.model;

public class DatabaseCreation {
	
private static DatabaseCreation  database; //reference of login
	
	private DatabaseCreation() 
	{
		System.out.println("Database is successfully Created");   
	}
	
	public static DatabaseCreation getDatabseCreation()
	{
		if(database == null)
	 database = new DatabaseCreation();
		return database;
	}
	
	public void status() 
	{
		System.out.println("Databse is successfully Connected");   
	}

}


