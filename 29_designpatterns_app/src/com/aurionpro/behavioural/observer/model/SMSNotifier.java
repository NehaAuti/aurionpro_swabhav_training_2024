package com.aurionpro.behavioural.observer.model;

public class SMSNotifier implements INotifier {
    @Override
    public void notify(Account account, String action, double amount) {
        switch (action) {
            case "deposit":
                System.out.println("SMS: Amount " + amount + " has been deposited to account " + account.getAccountNumber());
                break;
            case "withdraw":
                System.out.println("SMS: Amount " + amount + " has been withdrawn from account " + account.getAccountNumber());
                break;
        }
    }
}
