package com.aurionpro.selection.test;
import java.util.Scanner;

public class MaxThreeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
	    int number1 = scanner.nextInt();
		System.out.print("Enter second number: ");
	    int number2 = scanner.nextInt();
	    System.out.print("Enter Third number: ");
	    int number3 = scanner.nextInt();
	    
	    if((number1>number2) && (number1>number2))
	    {
	    	System.out.println("Number1 is Maximun:" +number1);
	    }
	    else if ((number2>number1) && (number2>number3))
	    {
	    	System.out.println("Number2 is Maximun:" +number2);
	    }
	    else
	    {
	    	System.out.println("Number3 is Maximun:" +number3);
	    }
	    scanner.close();

	}

}
