package com.aurionpro.test;

import java.util.Scanner;

public class Swapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
	
		System.out.println("Enter First No:");
		int number1=scanner.nextInt();
		
		System.out.println("Enter Second No:");
		int number2=scanner.nextInt();
		
		
		System.out.println("Before Swapping:");
		System.out.println("Number1 : "+number1+ "\t Number2: " +number2);
		
		int temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("After Swapping:");
		System.out.println("Number1 : "+number1+ "\t Number2: " +number2);
		
	}
	
}

