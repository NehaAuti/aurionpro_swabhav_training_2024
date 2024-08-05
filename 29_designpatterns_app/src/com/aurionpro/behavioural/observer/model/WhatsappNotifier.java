package com.aurionpro.behavioural.observer.model;

public class WhatsappNotifier implements INotifier {
    @Override
    public void notify(Account account, String action, double amount) {
        switch (action) {
            case "deposit":
                System.out.println("WhatsApp: Amount " + amount + " has been deposited to account " + account.getAccountNumber());
                break;
            case "withdraw":
                System.out.println("WhatsApp: Amount " + amount + " has been withdrawn from account " + account.getAccountNumber());
                break;
        }
    }
}
