package com.aurionpro.model;

import com.aurionpro.exceptions.OverdraftLimitExceededException;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(long accountNo, String name, double balance, double overdraftLimit) {
        super(accountNo, name, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void debit(double amount) {
        // Handle the case where the balance after debit is within the overdraft limit
        if (getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Debited: $" + amount);
            return; // Exit the method early if the operation is successful
        }

        // Handle the case where the overdraft limit is exceeded
        System.out.println("Cannot debit $" + amount + ". Overdraft limit of $" + overdraftLimit + " exceeded.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }
}