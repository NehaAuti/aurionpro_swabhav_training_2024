package com.aurionpro.behavioural.observer.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Account {
    private String accountNumber;
    private String name;
    private double balance;
    private List<INotifier> notifiers;

    public Account(String name, double balance) {
        this.accountNumber = generateRandomAccountNumber();
        this.name = name;
        this.balance = balance;
        this.notifiers = new ArrayList<>();
    }

    private String generateRandomAccountNumber() {
        Random random = new Random();
        StringBuilder accountNumber = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            accountNumber.append(random.nextInt(10)); // Append a random digit (0-9)
        }
        return accountNumber.toString();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        notifyAllNotifiers("deposit", amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for account " + accountNumber);
        }
        this.balance -= amount;
        notifyAllNotifiers("withdraw", amount);
    }

    public void registerNotifier(INotifier notifier) {
        this.notifiers.add(notifier);
    }

    private void notifyAllNotifiers(String action, double amount) {
        for (INotifier notifier : notifiers) {
            notifier.notify(this, action, amount);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
