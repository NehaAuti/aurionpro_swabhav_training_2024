package com.aurionpro.test;

public class BitwiseOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int firstValue=Integer.parseInt(args[0]);
		
		int secondValue=Integer.parseInt(args[1]);

        System.out.println("First value: " + firstValue);
        System.out.println("Second value: " + secondValue);

        int andResult = firstValue & secondValue;
        System.out.println("Result of '&' operator: " + andResult);

        int orResult = firstValue | secondValue;
        System.out.println("Result of '|' operator: " + orResult);

        int xorResult = firstValue ^ secondValue;
        System.out.println("Result of '^' operator: " + xorResult);

	}

}
