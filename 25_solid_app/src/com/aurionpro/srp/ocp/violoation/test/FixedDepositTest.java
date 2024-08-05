package com.aurionpro.srp.ocp.violoation.test;

import com.aurionpro.srp.ocp.violation.model.FestivalType;
import com.aurionpro.srp.ocp.violation.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        FixedDeposit festivaldeposit1 = new FixedDeposit(101, "Neha", 10000, 2, FestivalType.NEWYEAR);
		        FixedDeposit festivaldeposit2 = new FixedDeposit(102, "Sayali", 15000, 1, FestivalType.DIWALI);
		        FixedDeposit festivaldeposit3 = new FixedDeposit(103, "Sakshi", 20000, 3, FestivalType.HOLI);
		        FixedDeposit festivaldeposit4 = new FixedDeposit(104, "Namrata", 25000, 5, FestivalType.OTHERS);

		        
		        printFixedDepositDetails(festivaldeposit1);
		        printFixedDepositDetails(festivaldeposit2);
		        printFixedDepositDetails(festivaldeposit3);
		        printFixedDepositDetails(festivaldeposit4);
		    }

		    private static void printFixedDepositDetails(FixedDeposit festivaldeposit) {
		        System.out.println("Account Number: " + festivaldeposit.getAccountNumber());
		        System.out.println("Name: " + festivaldeposit.getName());
		        System.out.println("Principle: " + festivaldeposit.getPrinciple());
		        System.out.println("Duration: " + festivaldeposit.getDuration());
		        System.out.println("Festival: " + festivaldeposit.getFestival());
		        System.out.println("Interest Rate: " + festivaldeposit.getInterestRates());
		        System.out.println("Simple Interest: " + festivaldeposit.calculateSimpleInterest());
		        System.out.println(); 
		    }
		}

