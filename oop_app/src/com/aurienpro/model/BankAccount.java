package com.aurienpro.model;
public class BankAccount {
    private int accountNo;
    private String name;
    private double balance;

    public void setAccountNo(int i) {
        accountNo = i;
    }
    public int getAccountNo() {
        return accountNo;
    }
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }

    public void setBalance(double b) {
        balance = b;
    }
    
    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        if (amount <= 0) {
            System.out.println("Credit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Credited: " + amount + ". New balance: " + balance);
    }

    public void debit(double amount) {
        if (amount <= 0) {
            System.out.println("Debit amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance. Debit amount exceeds current balance.");
            return;
        }
        balance -= amount;
        System.out.println("Debited: " + amount + ". New balance: " + balance);
    }

    public void display() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}


