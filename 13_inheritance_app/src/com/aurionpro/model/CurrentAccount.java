package com.aurionpro.model;

public class CurrentAccount extends Account {
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
            System.out.println("Debit amount exceeds overdraft limit.");
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Overdraft Limit: $" + overDraftLimit);
    }
}
    
//    public void debitWithOverdraft(double amount,double balance) {
//        if (amount <= 0) {
//            System.out.println("Debit amount must be positive.");
//        } else if (amount > balance + overDraftLimit) {
//            System.out.println("Insufficient balance. Current balance is: " + balance);
//        } else {
//            balance = balance - amount;
//            System.out.println("Amount debited successfully. New balance is: " + balance);
//        }
//    }   
//}

    