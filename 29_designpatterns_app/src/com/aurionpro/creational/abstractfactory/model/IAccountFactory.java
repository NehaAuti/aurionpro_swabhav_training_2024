package com.aurionpro.creational.abstractfactory.model;

public interface IAccountFactory {
    Account createAccount(String accountNumber, String name, double balance);
}