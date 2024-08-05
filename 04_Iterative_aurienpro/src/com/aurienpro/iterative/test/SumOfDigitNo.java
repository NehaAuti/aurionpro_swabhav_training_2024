package com.aurienpro.iterative.test;
import java.util.Scanner;
public class SumOfDigitNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter The No: ");
	        int number = scanner.nextInt();
	        int sum =0;
	        int i;
	        while(number>0)
	        {
	        	i = number % 10;
	        	sum = i + sum;
	        	number = number/10;
	        }
	        System.out.println("Sum is:"+sum);
	        scanner.close();  	

	}

}
