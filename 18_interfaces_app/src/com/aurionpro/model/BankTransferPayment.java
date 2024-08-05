package com.aurionpro.model;

public class BankTransferPayment implements Payment{

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Process Payment through Bank Transfer Payment");
		
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("Refund through Bank Transfer Payment");
		
	}

}
