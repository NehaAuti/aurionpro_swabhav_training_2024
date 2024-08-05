package com.aurionpro.model;

import com.aurionpro.exceptions.MinBalanceException;

public class SavingAccount extends Account {
    private double minBalance;

    public SavingAccount(long accountNo, String name, double balance, double minBalance) {
        super(accountNo, name, balance);
        this.minBalance = minBalance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    @Override
    public void debit(double amount) {
        // Handle the case where the balance after debit is within the minimum balance requirement
        if (getBalance() - amount >= minBalance) {
            setBalance(getBalance() - amount);
            System.out.println("Debited: $" + amount);
            return; // Exit the method early if the operation is successful
        }

        // Handle the case where the minimum balance requirement would be violated
        System.out.println("Cannot debit $" + amount + ". Minimum balance of $" + minBalance + " must be maintained.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Minimum Balance: $" + minBalance);
    }
}