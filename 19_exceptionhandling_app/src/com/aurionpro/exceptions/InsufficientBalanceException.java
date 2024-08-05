package com.aurionpro.exceptions;

import com.aurionpro.model.Account;

public class InsufficientBalanceException extends Exception {
    private double balance;

    public InsufficientBalanceException(double balance) {
        super("Insufficient balance: " + balance);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}