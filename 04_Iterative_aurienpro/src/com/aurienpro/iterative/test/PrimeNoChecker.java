package com.aurienpro.iterative.test;

import java.util.Scanner;

public class PrimeNoChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The No: ");
        int number = scanner.nextInt();
        int i = 2; 
        while(i<=number)
        {
        	 if (number % i == 0) {
        	 break;
        }
        i++;
	}
        if(i>=number)
        
        	System.out.println("Prime No");
        
        else
        	System.out.println("Not a Prime No");
        scanner.close();
	}

}
