package com.aurionpro.srp.violation.model;

public class InvoicePrinter {
	private Invoice invoice;
	private Taxcalculator taxCalculator;
	
	
	
	public InvoicePrinter(Invoice invoice, Taxcalculator taxCalculator) {
		super();
		this.invoice = invoice;
		this.taxCalculator = taxCalculator;
	}



	public void displayInvoice() {
		  
         System.out.println(invoice.getId());
         System.out.println(invoice.getDescription());
         System.out.println(invoice.getAmount());
         System.out.println(invoice.getTax());
         System.out.println(invoice.getAmount() +taxCalculator.calculateTax());
         
		
	}

}
