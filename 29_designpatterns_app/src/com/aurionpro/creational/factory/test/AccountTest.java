package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.AccountFactory;
import com.aurionpro.creational.factory.model.AccountType;
import com.aurionpro.creational.factory.model.CurrentAccount;
import com.aurionpro.creational.factory.model.IAccount;
import com.aurionpro.creational.factory.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
        IAccount savingAccount = AccountFactory.makeAccount(AccountType.SAVINGACCOUNT);
        System.out.println("SavingAccount:");
        savingAccount.credit(500);  
        savingAccount.debit(300);   
        System.out.println("Final balance in SavingAccount: " + ((SavingAccount) savingAccount).getBalance());

        
        IAccount currentAccount = AccountFactory.makeAccount(AccountType.CURRENTACCOUNT);
        System.out.println("\nCurrentAccount:");
        currentAccount.credit(200);  
        currentAccount.debit(100);   
        System.out.println("Final balance in CurrentAccount: " + ((CurrentAccount) currentAccount).getBalance());
    }
}