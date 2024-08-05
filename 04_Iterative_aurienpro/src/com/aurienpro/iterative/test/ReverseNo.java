package com.aurienpro.iterative.test;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter The No: ");
	        int number = scanner.nextInt();
	        int rev = 0;  
	        int rem; 
	  
	        while (number > 0) { 
	            rem = number % 10; 
	            rev = (rev * 10) + rem; 
	            number = number / 10; }
	        System.out.println("Reverse No:"+rev);
	        scanner.close();  
	}

}
