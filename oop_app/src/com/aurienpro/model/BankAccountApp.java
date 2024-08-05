package com.aurienpro.model;

public class BankAccountApp {
	 private int accountNumber;
	    private String name;
	    private double balance;
	    private String accountType;

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

	    @Override
	    public String toString() {
	        return "BankAccountApp [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance
	                + ", accountType=" + accountType + "]";
	    }
	}