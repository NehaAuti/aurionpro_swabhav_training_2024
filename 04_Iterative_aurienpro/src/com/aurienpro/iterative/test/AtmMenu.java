package com.aurienpro.iterative.test;
import java.util.Scanner;
public class AtmMenu {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        double balance = 1000.00;
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("ATM Menu:");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit Money");
	            System.out.println("3. Withdraw Money");
	            System.out.println("4. Exit");
	            System.out.print("Please choose an option: ");
	            
	            int choice = scanner.nextInt();
	            
	            switch (choice) {
	                case 1:
	                    System.out.printf("Your current balance is: $%.2f%n", balance);
	                    break;
	                case 2:
	                    System.out.print("Enter amount to deposit: ");
	                    double deposit = scanner.nextDouble();
	                    if (deposit > 0) {
	                        balance += deposit;
	                        System.out.printf("You have deposited $%.2f. Your new balance is $%.2f%n", deposit, balance);
	                    } 
	                    break;
	                case 3:
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdraw = scanner.nextDouble();
	                    if (withdraw > 0 && withdraw <= balance) {
	                        balance -= withdraw;
	                        System.out.printf("You have withdrawn $%.2f. Your new balance is $%.2f%n", withdraw, balance);
	                    } 
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    exit = true;
	                    break;
	                default:
	                    System.out.println("Invalid input. Please select a correct option.");
	            }
	            System.out.println();
	        }
	        
	        scanner.close();
	}
}
