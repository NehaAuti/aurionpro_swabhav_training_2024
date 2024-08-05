package com.aurionpro.model;

import com.aurionpro.exceptions.OverdraftLimitExceededException;

public class CurrentAccount extends Account1 {
    private double overDraftLimit;

    public CurrentAccount(long accountNo, String name, double balance, double overDraftLimit) {
        super(accountNo, name, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void debit(double amount) {
        if (getBalance() - amount >= -overDraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Debited: $" + amount);
        } else {
            throw new OverdraftLimitExceededException(amount, getBalance(), overDraftLimit);
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Overdraft Limit: $" + overDraftLimit);
    }
}


