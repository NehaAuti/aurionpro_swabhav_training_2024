package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exceptions.InsufficientFundsException;
import com.aurionpro.exceptions.NegativeAmountException;
import com.aurionpro.model.BankAccountApp;

public class BankAccountAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Account Number: ");
	        int accountNumber = scanner.nextInt();
	        scanner.nextLine();  // Consume newline

	        System.out.print("Enter Name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter Initial Balance: ");
	        double balance = scanner.nextDouble();
	        scanner.nextLine();  // Consume newline

	        System.out.print("Enter Account Type (saving/current): ");
	        String accountType = scanner.nextLine();

	        BankAccountApp account = new BankAccountApp(accountNumber, name, balance, accountType);

	        try {
	            System.out.print("Enter amount to deposit: ");
	            double depositAmount = scanner.nextDouble();
	            account.deposit(depositAmount);
	        } catch (NegativeAmountException e) {
	            System.err.println(e.getMessage());
	        }

	        try {
	            System.out.print("Enter amount to withdraw: ");
	            double withdrawAmount = scanner.nextDouble();
	            account.withdraw(withdrawAmount);
	        } catch (NegativeAmountException | InsufficientFundsException  e) {
	            System.err.println(e.getMessage());
	        }

	        System.out.println("Final Account Details: " + account);

	        scanner.close();
	    }
	}

