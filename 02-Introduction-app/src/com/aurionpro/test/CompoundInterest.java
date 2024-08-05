package com.aurionpro.test;
import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the principal amount: ");
	        double principal = scanner.nextDouble();

	        System.out.print("Enter the annual interest rate: ");
	        double rate = scanner.nextDouble();

	        System.out.print("Enter the time period: ");
	        double time = scanner.nextDouble();

	        double amount = principal * Math.pow(1 + rate / 100, time);

	        double interest = amount - principal;

	     
	        System.out.printf("Compound Interest after %.2f years: %.2f\n", time, interest);

	        scanner.close();

	}

}
