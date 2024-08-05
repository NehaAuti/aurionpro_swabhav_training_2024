package com.aurionpro.selection.test;
import java.util.Scanner;

public class MaxTwoNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
	    int number1 = scanner.nextInt();
		System.out.print("Enter second number: ");
	    int number2 = scanner.nextInt();
	  
	    
	    if(number1>number2)
	    {
	    	System.out.println("Number1 is Maximum:" +number1);
	    }
	    else
	    {
	    	System.out.println("Number2 is Maximum:" +number2);
	    }

	    scanner.close();
	}

}
