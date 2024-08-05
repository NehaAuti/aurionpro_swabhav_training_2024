package com.aurienpro.test;
import com.aurienpro.model.AccountType;
import com.aurienpro.model.BankAccountApp;

import java.util.Random;
import java.util.Scanner;
public class BankAccountAppTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of accounts to create: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        BankAccountApp[] accounts = new BankAccountApp[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for account " + (i + 1) + ":");

            int accountNumber = generateRandomAccountNumber();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Initial Balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine();  // Consume newline

            System.out.print("Enter Account Type (saving/current): ");
            String accountType = scanner.nextLine();

            accounts[i] = new BankAccountApp(accountNumber, name, balance, accountType);
        }

        BankAccountApp maxBalanceAccount = getMaximumBalanceAccount(accounts);
        if (maxBalanceAccount != null) {
            System.out.println("Account with the maximum balance:");
            System.out.println("Account Number: " + maxBalanceAccount.getAccountNumber());
            System.out.println("Name: " + maxBalanceAccount.getName());
            System.out.println("Balance: " + maxBalanceAccount.getBalance());
            System.out.println("Account Type: " + maxBalanceAccount.getAccountType());
        } else {
            System.out.println("No accounts found.");
        }

        scanner.close();
    }

    private static int generateRandomAccountNumber() {
        Random random = new Random();
        return 1000000000 + random.nextInt(900000000);  // Ensure 10 digits
    }

    public static BankAccountApp getMaximumBalanceAccount(BankAccountApp[] accounts) {
        if (accounts == null || accounts.length == 0) {
            return null;
        }

        BankAccountApp maxBalanceAccount = accounts[0];
        for (int i = 1; i < accounts.length; i++) {
            if (accounts[i].getBalance() > maxBalanceAccount.getBalance()) {
                maxBalanceAccount = accounts[i];
            }
        }
        return maxBalanceAccount;
    }
}