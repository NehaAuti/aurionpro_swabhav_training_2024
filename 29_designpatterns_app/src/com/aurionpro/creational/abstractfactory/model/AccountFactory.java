package com.aurionpro.creational.abstractfactory.model;

public class AccountFactory {
    public static IAccountFactory getFactory(AccountType accountType, double overdraftLimit) {
        switch (accountType) {
            case SAVING:
                return new SavingAccountFactory();
            case CURRENT:
                return new CurrentAccountFactory(overdraftLimit);
            default:
                throw new IllegalArgumentException("Invalid account type!");
        }
    }
}
