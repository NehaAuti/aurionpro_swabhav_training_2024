package com.aurionpro.creational.factory.model;

public class CurrentAccount implements IAccount {
	private int balance;

    public CurrentAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void credit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid credit amount: " + amount);
            return;
        }
        balance += amount;
        System.out.println("Credited: " + amount + ". New balance: " + balance);
    }

    @Override
    public void debit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid debit amount: " + amount);
            return;
        }
        if (balance < amount) {
            System.out.println("Insufficient balance. Current balance: " + balance);
            return;
        }
        balance -= amount;
        System.out.println("Debited: " + amount + ". New balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}