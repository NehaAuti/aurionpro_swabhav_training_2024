package com.aurionpro.exceptions;

public class NegativeAmountException extends RuntimeException {
    private double amount;

    public NegativeAmountException(double amount) {
        super();
        this.amount = amount;
    }

    @Override
    public String getMessage() {
        return "Invalid amount: $" + amount + " is not a positive value.";
    }
}