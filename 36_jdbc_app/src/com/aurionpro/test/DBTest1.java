package com.aurionpro.test;

import com.aurionpro.model.DBConnection1;

public class DBTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConnection1 connection = new DBConnection1();
		  connection.connectToDb();
		  connection.getSupplierDetails();
		  connection.addSupplierDetails();
		  connection.getSupplierDetails();

	}

}
