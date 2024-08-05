package com.aurionpro.dip.violation.model;

public class DBLogger1 implements ILogger {

	 @Override
	 public void log(String err) {
	  System.out.println("logged into database" +err);
	  
	 }

}
