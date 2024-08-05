package com.aurionpro.srp.violation.test;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import com.aurionpro.srp.violation.model.Invoice;
import com.aurionpro.srp.violation.model.Taxcalculator;
import com.aurionpro.srp.violation.model.InvoicePrinter;

public class InvoiceTest {
    	    public static void main(String[] args) {
    	    	Scanner scanner = new Scanner(System.in);
    	        List<Invoice> invoices = new ArrayList<>();
    	        Taxcalculator taxCalculator;

    	        System.out.print("Enter the number of invoices: ");
    	        int numInvoices = scanner.nextInt();
    	      

    	        for (int i = 0; i < numInvoices; i++) {
    	            System.out.println("Enter details for invoice " + (i + 1) + ":");

    	            System.out.print("Enter id: ");
    	            String id = scanner.next();
    	            scanner.nextLine(); 
    	            System.out.print("Enter description: ");
    	            String description = scanner.nextLine();

    	            System.out.print("Enter amount: ");
    	            double amount = scanner.nextDouble();

    	            System.out.print("Enter tax rate (as percentage): ");
    	            double tax = scanner.nextDouble();
    	           

    	            Invoice invoice = new Invoice(id, description, amount, tax);
    	            invoices.add(invoice);
    	      
    	        }

    	        
    	        for (Invoice invoice : invoices) {
    	            taxCalculator = new Taxcalculator(invoice); 
    	            taxCalculator.calculateTax();

    	            InvoicePrinter invoicePrinter = new InvoicePrinter(invoice, taxCalculator);
    	            invoicePrinter.displayInvoice();
    	            System.out.println(); 
    	        }

    	        scanner.close(); 
    	    }
    	}

        // Create a list of invoices
//        List<Invoice> invoices = Arrays.asList(
//            new Invoice("1", "Laptop", 40000.00, 1000),
//            new Invoice("2", "Smartphone", 20000.00, 500),
//            new Invoice("3", "Headphones", 1500.00, 250)
//        );
//
//
//        Taxcalculator taxCalculator = new Taxcalculator(null);
//        double taxRate = 10; // 10% tax rate
//
//    
//        for (Invoice invoice : invoices) {
//            
//            InvoicePrinter invoicePrinter = new InvoicePrinter(invoice, taxCalculator);
//         
//            invoicePrinter.displayInvoice();
//            System.out.println(); 
//		Invoice invoice=new Invoice("10abc", "Neha", 2157, 0.10);        
//        Taxcalculator taxCalculator = new Taxcalculator(invoice);
//        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice, taxCalculator);
//                
//        invoicePrinter.displayInvoice();
//    }
//}