package com.aurienpro.test;
import java.util.Random;
import java.util.Scanner;
import com.aurienpro.model.BankAccount;
public class BankAccountTest {
	 
	private static int generateAccountNumber() {
        Random random = new Random();
        int accountNumber = 1000000000 + random.nextInt(900000000);
        return accountNumber;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        Scanner scanner = new Scanner(System.in);
        int accountNo = generateAccountNumber();
        bankAccount.setAccountNo(accountNo);

        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();
        bankAccount.setName(name);

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        bankAccount.setBalance(balance);

        System.out.println("Account created successfully. Account Number: " + bankAccount.getAccountNo());

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Credit");
            System.out.println("2. Debit");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to credit: ");
                    double creditAmount = scanner.nextDouble();
                    bankAccount.credit(creditAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to debit: ");
                    double debitAmount = scanner.nextDouble();
                    bankAccount.debit(debitAmount);
                    break;
                case 3:
                    System.out.println("Current balance: " + bankAccount.getBalance());
                    break;
                case 4:
                    System.out.println("Exiting.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    
                bankAccount.display();
            }
        }
    }
}