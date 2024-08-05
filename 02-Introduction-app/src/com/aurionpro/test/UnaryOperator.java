package com.aurionpro.test;

import java.util.Scanner;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
	     System.out.print("Enter first number: ");
	     int number1 = scanner.nextInt();
	        
	     System.out.print("Enter second number: ");
	     int number2 = scanner.nextInt();
	     
	     System.out.println("Postincrement : " + (number1++));
	     System.out.println("Preincrement : " + (++number2));

	     System.out.println("Postdecrement : " + (number1--));
	     System.out.println("Predecrement : " + (--number2));
	     
	     scanner.close();

	}

}
