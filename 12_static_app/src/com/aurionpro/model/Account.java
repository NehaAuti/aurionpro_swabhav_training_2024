package com.aurionpro.model;

public class Account {

	private static int count = 0;
    private String accountNumber;
    private double balance;
    
    
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        count++;
    }
    
 
    public static int getCount() {
        return count;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
}