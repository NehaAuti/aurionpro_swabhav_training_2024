package com.aurionpro.creational.abstractfactory.model;

public abstract class Account {
    protected String accountNumber;
    protected String name;
    protected double balance;

    public Account(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void credit(double amount) {
        balance += amount;
        System.out.println("Credited " + amount + ". New balance: " + balance);
    }

    public abstract void debit(double amount);

    public abstract void displayDetails();

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}