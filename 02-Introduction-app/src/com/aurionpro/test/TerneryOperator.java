package com.aurionpro.test;

import java.util.Scanner;
import java.util.Scanner;

public class TerneryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner scanner = new Scanner(System.in);
		
		    System.out.print("Enter the first value: ");
	        int firstValue = scanner.nextInt();

	        System.out.print("Enter the second value: ");
	        int secondValue = scanner.nextInt();
	      
	        int max;
	        
	        System.out.println("First number: " + firstValue);
	        System.out.println("Second number: " + secondValue);

	        max = (firstValue > secondValue) ? firstValue : secondValue;
	        System.out.println("Maximum number is = " + max);
	       

	}

}
