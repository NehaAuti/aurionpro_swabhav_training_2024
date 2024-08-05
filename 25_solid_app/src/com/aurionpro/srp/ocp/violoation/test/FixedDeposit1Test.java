package com.aurionpro.srp.ocp.violoation.test;

import com.aurionpro.srp.ocp.violation.model.DiwaliInterest;
import com.aurionpro.srp.ocp.violation.model.FixedDeposit1;
import com.aurionpro.srp.ocp.violation.model.HoliInterest;
import com.aurionpro.srp.ocp.violation.model.NewYearInterest;
import com.aurionpro.srp.ocp.violation.model.OthersInterest;
//OCP Solution
public class FixedDeposit1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    FixedDeposit1 festivaldeposit1 = new FixedDeposit1(101, "Neha", 10000, 2, new NewYearInterest());
	        FixedDeposit1 festivaldeposit2 = new FixedDeposit1(102, "sayali", 15000, 1, new DiwaliInterest());
	        FixedDeposit1 festivaldeposit3 = new FixedDeposit1(103, "Sakshi", 20000, 3, new HoliInterest());
	        FixedDeposit1 festivaldeposit4 = new FixedDeposit1(104, "Namrata", 25000, 5, new OthersInterest());
	        
            System.out.println(festivaldeposit1.calculateSimpleInterest());
            System.out.println(festivaldeposit2.calculateSimpleInterest());
            System.out.println(festivaldeposit3.calculateSimpleInterest());
            System.out.println(festivaldeposit4.calculateSimpleInterest());
            System.out.println(); 
	        
            printFixedDepositDetails(festivaldeposit1);
	        printFixedDepositDetails(festivaldeposit2);
	        printFixedDepositDetails(festivaldeposit3);
	        printFixedDepositDetails(festivaldeposit4);
	    }

	    private static void printFixedDepositDetails(FixedDeposit1 festivaldeposit) {
	        System.out.println("Account Number: " + festivaldeposit.getAccountNumber());
	        System.out.println("Name: " + festivaldeposit.getName());
	        System.out.println("Principle: " + festivaldeposit.getPrinciple());
	        System.out.println("Duration: " + festivaldeposit.getDuration());
	        System.out.println("Interest Rate: " + festivaldeposit.getInterestRates());
	        System.out.println("Simple Interest: " + festivaldeposit.calculateSimpleInterest());
	        System.out.println(); 
	    }
	}


