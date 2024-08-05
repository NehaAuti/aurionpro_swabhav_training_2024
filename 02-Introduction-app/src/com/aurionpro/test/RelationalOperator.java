package com.aurionpro.test;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
		
		System.out.println("Equal to : " + (number1 > number2));
	    System.out.println("Not Equal to: " + (number1 < number2));
	    System.out.println("less than: " + (number1 >= number2));
	    System.out.println("less than or equal to: " + (number1 <= number2));
	    System.out.println("Greater than: " + (number1 == number2));
	    System.out.println("Greater than or equal to: " + (number1 != number2));
	        
	    scanner.close();


	}

}
