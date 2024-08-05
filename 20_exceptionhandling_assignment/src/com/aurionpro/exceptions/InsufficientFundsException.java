package com.aurionpro.exceptions;

public class InsufficientFundsException extends RuntimeException {
    private double amount;

    public InsufficientFundsException(double amount) {
        super();
        this.amount = amount;
    }

    @Override
    public String getMessage() {
        return "Insufficient funds: Cannot withdraw $" + amount + ".";
    }
}
