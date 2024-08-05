package com.aurionpro.test;

public class CompoundInterest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    double principal = Double.parseDouble(args[0]);
	        double rate = Double.parseDouble(args[1]);
	        double time = Double.parseDouble(args[2]);

	        double amount = principal * Math.pow(1 + rate / 100, time);

	        double interest = amount - principal;

	        System.out.printf("Compound Interest after %.2f years: %.2f\n", time, interest);


	}

}
