package com.aurionpro.dip.violation.model;

public class FileLogger implements ILogger{

	@Override
	public void log(String err) {
		// TODO Auto-generated method stub
		System.out.println("logged into file logger" +err);
		
	}

	

}
