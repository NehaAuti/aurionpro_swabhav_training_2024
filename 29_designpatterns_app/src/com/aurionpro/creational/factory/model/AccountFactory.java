package com.aurionpro.creational.factory.model;

public class AccountFactory {
	
	public static IAccount makeAccount(AccountType accountType) {
		IAccount account=null;
		if(accountType==AccountType.SAVINGACCOUNT)
			account = new SavingAccount(2000);
		if(accountType==AccountType.CURRENTACCOUNT)
			account = new CurrentAccount(5000);
			return account;
	}
 
}