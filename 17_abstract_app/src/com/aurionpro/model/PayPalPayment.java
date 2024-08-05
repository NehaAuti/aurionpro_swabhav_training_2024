package com.aurionpro.model;

public class PayPalPayment extends Payment {

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Process Payment through PayPal Payment");
		
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("Refund through PayPal Payment");
		
	}
	

}
