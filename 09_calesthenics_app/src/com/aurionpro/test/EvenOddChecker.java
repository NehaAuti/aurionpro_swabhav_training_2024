package com.aurionpro.test;
import java.util.Scanner;
public class EvenOddChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number = scanner.nextInt();
		
		if(number%2==0)
		{
			System.out.println("Number is Even.");
			return;
		}
		
		System.out.println("Number is odd");
			
	}
	}


