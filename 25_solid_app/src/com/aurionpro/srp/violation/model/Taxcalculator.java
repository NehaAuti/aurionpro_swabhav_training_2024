package com.aurionpro.srp.violation.model;

public class Taxcalculator {
	private Invoice invoice;
	
	
	public Taxcalculator(Invoice invoice) {
		super();
		this.invoice = invoice;
	}


	public double calculateTax() 
	{

		//return amount * (taxRate / 100);
		return invoice.getAmount() * invoice.getTax()/100;
  }

}
