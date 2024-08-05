package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exceptions.InsufficientBalanceException;
import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        Account account = new Account(accountNumber, name, balance);
        System.out.println("Initial Balance: " + account.getBalance());

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Credit");
            System.out.println("2. Debit");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to credit: ");
                    double creditAmount = scanner.nextDouble();
                    try {
                        account.credit(creditAmount);
                        System.out.println("Balance after crediting " + creditAmount + ": " + account.getBalance());
                    } catch (InsufficientBalanceException e) {
                        System.out.println("Attempted to credit " + creditAmount + " but " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to debit: ");
                    double debitAmount = scanner.nextDouble();
                    try {
                        account.debit(debitAmount);
                        System.out.println("Balance after debiting " + debitAmount + ": " + account.getBalance());
                    } catch (InsufficientBalanceException e) {
                        System.out.println("Attempted to debit " + debitAmount + " but " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}