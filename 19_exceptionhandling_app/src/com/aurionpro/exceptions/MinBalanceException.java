package com.aurionpro.exceptions;

public class MinBalanceException extends RuntimeException {
	private double balance;
    private double minBalance;

    public MinBalanceException(double balance, double minBalance) {
        super();
        this.balance = balance;
        this.minBalance = minBalance;
    }

    @Override
    public String getMessage() {
        return "Cannot debit: Minimum balance requirement not met. Current balance: $" + balance + ", Minimum balance: $" + minBalance;
    }
}


