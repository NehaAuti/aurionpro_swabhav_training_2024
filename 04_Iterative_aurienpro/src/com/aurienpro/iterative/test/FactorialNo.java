package com.aurienpro.iterative.test;

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The No: ");
        int number = scanner.nextInt();
        
		int fac = 1, i; 
        for (i = 2; i <= number; i++) 
        fac *= i; 
        System.out.println("Factorial is:"+fac);
        scanner.close();
	}

}
