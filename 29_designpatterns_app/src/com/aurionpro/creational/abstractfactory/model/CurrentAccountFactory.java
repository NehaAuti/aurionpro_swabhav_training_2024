package com.aurionpro.creational.abstractfactory.model;

public class CurrentAccountFactory implements IAccountFactory {
    private double overdraftLimit;

    public CurrentAccountFactory(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public Account createAccount(String accountNumber, String name, double balance) {
        return new CurrentAccount(accountNumber, name, balance, overdraftLimit);
    }
}
