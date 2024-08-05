package com.aurionpro.model;

import com.aurionpro.exceptions.InsufficientFundsException;
import com.aurionpro.exceptions.MinBalanceException;
import com.aurionpro.exceptions.NegativeAmountException;

public class BankAccountApp {
	private int accountNumber;
    private String name;
    private double balance;
    private String accountType;
    private static final double MIN_BALANCE = 1000.00; // Minimum balance requirement

    public BankAccountApp(int accountNumber, String name, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.accountType = accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new NegativeAmountException(amount);
        }
        balance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new NegativeAmountException(amount);
        }
        if (amount > balance) {
            throw new InsufficientFundsException(amount);
        }
       
        
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ". New balance: " + balance);
    }

    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance
                + ", accountType=" + accountType + "]";
    }
}


