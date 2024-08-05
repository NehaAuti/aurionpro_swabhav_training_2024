package com.aurionpro.list.test;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.aurionpro.list.model.BankApp;

public class BankAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        List<BankApp> accounts = new ArrayList<>();

        System.out.print("Enter the number of accounts to create: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for account " + (i + 1) + ":");

            long accountNumber = generateRandomAccountNumber();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Initial Balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine();  

            System.out.print("Enter Account Type (saving/current): ");
            String accountType = scanner.nextLine();

            accounts.add(new BankApp(accountNumber, name, balance, accountType));
        }

        System.out.println("\nDisplaying all accounts:");
        displayAccounts(accounts);

        System.out.println("\nDisplaying all accounts in descending order of balance:");
        sortAccountsByBalanceDescending(accounts);
        displayAccounts(accounts);

        BankApp maxBalanceAccount = getMaximumBalanceAccount(accounts);
        if (maxBalanceAccount != null) {
            System.out.println("\nAccount with the maximum balance:");
            System.out.println(maxBalanceAccount);
        } else {
            System.out.println("No accounts found.");
        }

        scanner.close();
    }

    public static long generateRandomAccountNumber() {
        Random random = new Random();
        return 1000000000L + (long) (random.nextDouble() * 9000000000L);
    }

    public static void displayAccounts(List<BankApp> accounts) {
        for (BankApp account : accounts) {
            System.out.println(account);
        }
    }

    public static void sortAccountsByBalanceDescending(List<BankApp> accounts) {
        for (int i = 0; i < accounts.size() - 1; i++) {
            for (int j = 0; j < accounts.size() - i - 1; j++) {
                if (accounts.get(j).getBalance() < accounts.get(j + 1).getBalance()) {
                	BankApp temp = accounts.get(j);
                    accounts.set(j, accounts.get(j + 1));
                    accounts.set(j + 1, temp);
                }
            }
        }
    }

    public static BankApp getMaximumBalanceAccount(List<BankApp> accounts) {
        if (accounts == null || accounts.isEmpty()) {
            return null;
        }

        BankApp maxBalanceAccount = accounts.get(0);
        for (BankApp account : accounts) {
            if (account.getBalance() > maxBalanceAccount.getBalance()) {
                maxBalanceAccount = account;
            }
        }
        return maxBalanceAccount;
    }
}
		    
