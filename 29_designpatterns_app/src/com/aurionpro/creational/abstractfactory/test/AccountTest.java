package com.aurionpro.creational.abstractfactory.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.aurionpro.creational.abstractfactory.model.Account;
import com.aurionpro.creational.abstractfactory.model.AccountFactory;
import com.aurionpro.creational.abstractfactory.model.AccountType;
import com.aurionpro.creational.abstractfactory.model.IAccountFactory;

public class AccountTest {

		    private static Map<String, Account> accounts = new HashMap<>();

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println("\n1. Create Account");
		            System.out.println("2. Credit");
		            System.out.println("3. Debit");
		            System.out.println("4. Check Balance");
		            System.out.println("5. Display Account Details");
		            System.out.println("6. Exit");
		            System.out.print("Enter your choice: ");
		            int choice = scanner.nextInt();
		            scanner.nextLine(); 

		            switch (choice) {
		                case 1:
		                    createAccount(scanner);
		                    break;
		                case 2:
		                    credit(scanner);
		                    break;
		                case 3:
		                    debit(scanner);
		                    break;
		                case 4:
		                    checkBalance(scanner);
		                    break;
		                case 5:
		                    displayAccountDetails(scanner);
		                    break;
		                case 6:
		                    System.out.println("Exiting...");
		                    scanner.close();
		                    System.exit(0);
		                    break;
		                default:
		                    System.out.println("Invalid choice! Please try again.");
		            }
		        }
		    }

		    private static void createAccount(Scanner scanner) {
		        System.out.print("Enter account type (Saving/Current): ");
		        String type = scanner.nextLine();
		        AccountType accountType = AccountType.valueOf(type.toUpperCase());

		        System.out.print("Enter account number: ");
		        String accountNumber = scanner.nextLine();
		        System.out.print("Enter name: ");
		        String name = scanner.nextLine();
		        System.out.print("Enter initial balance: ");
		        double balance = scanner.nextDouble();
		        scanner.nextLine(); 

		        double overdraftLimit = 0.0;
		        if (accountType == AccountType.CURRENT) {
		            System.out.print("Enter overdraft limit: ");
		            overdraftLimit = scanner.nextDouble();
		            scanner.nextLine(); 
		        }

		        IAccountFactory factory = AccountFactory.getFactory(accountType, overdraftLimit);
		        Account account = factory.createAccount(accountNumber, name, balance);
		        accounts.put(accountNumber, account);
		        System.out.println(accountType + " account created successfully!");
		    }

		    private static void credit(Scanner scanner) {
		        Account account = getAccountFromUser(scanner);
		        if (account != null) {
		            System.out.print("Enter amount to credit: ");
		            double amount = scanner.nextDouble();
		            scanner.nextLine(); 
		            account.credit(amount);
		        }
		    }

		    private static void debit(Scanner scanner) {
		        Account account = getAccountFromUser(scanner);
		        if (account != null) {
		            System.out.print("Enter amount to debit: ");
		            double amount = scanner.nextDouble();
		            scanner.nextLine(); 
		            account.debit(amount);
		        }
		    }

		    private static void checkBalance(Scanner scanner) {
		        Account account = getAccountFromUser(scanner);
		        if (account != null) {
		            System.out.println("Account Balance: " + account.getBalance());
		        }
		    }

		    private static void displayAccountDetails(Scanner scanner) {
		        Account account = getAccountFromUser(scanner);
		        if (account != null) {
		            account.displayDetails();
		        }
		    }

		    private static Account getAccountFromUser(Scanner scanner) {
		        System.out.print("Enter account number: ");
		        String accountNumber = scanner.nextLine();
		        Account account = accounts.get(accountNumber);
		        if (account == null) {
		            System.out.println("Account not found!");
		        }
		        return account;
		    }
		}
