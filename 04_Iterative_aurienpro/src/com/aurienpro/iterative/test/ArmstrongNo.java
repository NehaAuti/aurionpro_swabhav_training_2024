package com.aurienpro.iterative.test;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter The No: ");
	        int number = scanner.nextInt();
	     
		int pow=0;
			 while(number>0)
		        {   pow++;
		        	number = number /10;
		        }
			 int temp = number;
			 int sum =0;
			 temp=number;
			 while(number>0) 
			 {
				    int rem = number%10;
		        	sum = sum+(int)(Math.pow(rem,pow));
		        	number = number/10;
		     }
		    
		if(temp==sum) {
			System.out.println("It is Armstrong No");
		}
		else
			System.out.println("It is not Armstrong No");
		scanner.close();  
	}

}
