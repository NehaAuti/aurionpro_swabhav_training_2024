package com.aurionpro.test;

import com.aurionpro.model.BankTransferPayment;
import com.aurionpro.model.CreditCardPayment;
import com.aurionpro.model.PayPalPayment;
import com.aurionpro.model.Payment;

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment payment;
		System.out.println("Credit Card Payment:");
		payment = new CreditCardPayment();
		payment.processPayment();
		payment.refund();
		
		System.out.println("PayPal Paymet:");
		payment = new PayPalPayment();
		payment.processPayment();
		payment.refund();
		
		System.out.println("Bank Tranfer Payment:");
		payment = new BankTransferPayment();
		payment.processPayment();
		payment.refund();


	}

}
