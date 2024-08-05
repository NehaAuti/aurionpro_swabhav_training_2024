package com.aurienpro.iterative.test;

import java.util.Scanner;

public class PrintTableNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The No: ");
        int number = scanner.nextInt();
        int i;
		for(i=1; i <= 10; i++)  
		{
			System.out.println(number*i); 
		}
		scanner.close();
	}

}
