package com.aurionpro.creational.abstractfactory.model;

public class SavingAccount extends Account {
    private static final double MINIMUM_BALANCE = 500.00;

    public SavingAccount(String accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    @Override
    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Debited " + amount + ". New balance: " + balance);
            checkMinimumBalance();
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void checkMinimumBalance() {
        if (balance < MINIMUM_BALANCE) {
            System.out.println("Your balance is below the minimum balance. Please deposit more funds.");
        } else {
            System.out.println("Your balance meets the minimum requirement.");
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Saving Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Minimum Balance Requirement: " + MINIMUM_BALANCE);
    }
}