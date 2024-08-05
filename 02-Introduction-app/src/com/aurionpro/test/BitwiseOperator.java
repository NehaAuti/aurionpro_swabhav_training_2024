package com.aurionpro.test;
import java.util.Scanner;
public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first value: ");
	        int firstValue = scanner.nextInt();

	        System.out.print("Enter the second value: ");
	        int secondValue = scanner.nextInt();

	        System.out.println("First value: " + firstValue);
	        System.out.println("Second value: " + secondValue);

	        int andResult = firstValue & secondValue;
	        System.out.println("Result of '&' operator: " + andResult);

	        int orResult = firstValue | secondValue;
	        System.out.println("Result of '|' operator: " + orResult);

	        int xorResult = firstValue ^ secondValue;
	        System.out.println("Result of '^' operator: " + xorResult);

	        scanner.close();

	}

}
