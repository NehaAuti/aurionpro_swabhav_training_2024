package com.aurionpro.exceptions;

public class OverdraftLimitExceededException extends RuntimeException {
	private double balance;
    private double overDraftLimit;

    public OverdraftLimitExceededException(double balance, double overDraftLimit, double overDraftLimit2) {
        super();
        this.balance = balance;
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public String getMessage() {
        return "Debit amount exceeds overdraft limit. Current balance: $" + balance + ", Overdraft limit: $" + overDraftLimit;
    }
}

