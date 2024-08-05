package com.aurionpro.test;

public class Swapper3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1= Integer.parseInt(args[0]);
		
		int number2= Integer.parseInt(args[1]);
		
		System.out.println("Before Swapping:");
		System.out.println("Number1 : "+number1+ "\t Number2: " +number2);
		
		int temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("After Swapping:");
		System.out.println("Number1 : "+number1+ "\t Number2: " +number2);
		
	}

}
