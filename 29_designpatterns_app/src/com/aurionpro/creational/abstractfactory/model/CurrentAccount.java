package com.aurionpro.creational.abstractfactory.model;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String name, double balance, double overdraftLimit) {
        super(accountNumber, name, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void debit(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Debited " + amount + ". New balance: " + balance);
            checkOverdraftBalance();
        } else {
            System.out.println("You have exceeded your overdraft limit!");
        }
    }

    public void checkOverdraftBalance() {
        if (balance < 0 && Math.abs(balance) > overdraftLimit) {
            System.out.println("You have exceeded your overdraft limit!");
        } else if (balance < 0) {
            System.out.println("You are using overdraft protection.");
        } else {
            System.out.println("Your balance is positive.");
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Current Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}
