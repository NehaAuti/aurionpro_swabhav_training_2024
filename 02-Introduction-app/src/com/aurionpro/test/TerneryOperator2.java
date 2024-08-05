package com.aurionpro.test;

public class TerneryOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstValue=Integer.parseInt(args[0]);
		int secondValue=Integer.parseInt(args[1]);
		int max;
        System.out.println("First number: " + firstValue);
        System.out.println("Second number: " + secondValue);

        max = (firstValue > secondValue) ? firstValue : secondValue;
        System.out.println("Maximum number is = " + max);
	}

}
