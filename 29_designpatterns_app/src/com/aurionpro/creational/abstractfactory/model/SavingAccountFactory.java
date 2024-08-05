package com.aurionpro.creational.abstractfactory.model;

public class SavingAccountFactory implements IAccountFactory {
    @Override
    public Account createAccount(String accountNumber, String name, double balance) {
        return new SavingAccount(accountNumber, name, balance);
    }
}
