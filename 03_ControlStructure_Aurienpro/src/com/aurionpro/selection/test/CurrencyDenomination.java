package com.aurionpro.selection.test;
import java.util.Scanner;
public class CurrencyDenomination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	     System.out.print("Enter amount: ");
	     int amount = scanner.nextInt();
	    
	     if (amount % 100 != 0) 
	     {
	            System.out.println("Amount should be a multiple of 100.");
	     } else {
	    	    int count5000 = amount / 5000;
	            amount %= 5000;
	            
	            int count2000 = amount / 2000;
	            amount %= 2000;

	            int count500 = amount / 500;
	            amount %= 500;

	            int count200 = amount / 200;
	            amount %= 200;

	            int count100 = amount / 100;
	            System.out.println("Five Thousand: " + count5000);
	            System.out.println("Two Thousand: " + count2000);
	            System.out.println("Five Hundred: " + count500);
	            System.out.println("Two Hundred: " + count200);
	            System.out.println("One Hundred: " + count100);
	        }
	     scanner.close();  

	}

}
