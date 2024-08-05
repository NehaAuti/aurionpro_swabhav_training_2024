package com.aurionpro.model;

public class CreditCardPayment implements Payment{

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Process Payment throught Credit Card");
		
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("Refund through Credit Card");
		
	}

}
