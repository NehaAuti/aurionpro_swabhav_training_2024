package com.aurionpro.stream.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Account> accounts = Arrays.asList(
		               new Account(101, "Neha", 7000),
		               new Account(102, "Sayali", 2500),
		               new Account(103, "Sakshi", 3500),
		               new Account(104, "Namrata", 4500),
		               new Account(105, "Aagya", 5500));
		 
//		    // a. Show Account details of account with minimum Balance
//	        Optional<Account> minimumBalanceAccount = accounts.stream()
//	                                                      .min(Comparator.comparingDouble(Account::getBalance));
//	        minimumBalanceAccount.ifPresent(account -> System.out.println("Account with minimum balance: " + account));
//
//	        // b. Show Account details of account with maximum Balance
//	        Optional<Account> maximumBalanceAccount = accounts.stream()
//	                                                      .max(Comparator.comparingDouble(Account::getBalance));
//	        maximumBalanceAccount.ifPresent(account -> System.out.println("Account with maximum balance: " + account));
//
//	        // c. Show names greater than 6 characters
//	        List<String> namesGreaterThan6Characters = accounts.stream()
//	                                                      .map(Account::getName)
//	                                                      .filter(name -> name.length() > 6)
//	                                                      .collect(Collectors.toList());
//	        System.out.println("Names with more than 6 characters: " + namesGreaterThan6Characters);
//
//	        // d. Find total of balance of all accounts
//	        double totalBalance = accounts.stream()
//	                                      .mapToDouble(Account::getBalance)
//	                                      .sum();
//	        System.out.println("Total balance of all accounts: " + totalBalance);
		 
		  // a. Show Account details of account with minimum Balance
	        accounts.stream()
	            .min((a1, a2) -> Double.compare(a1.getBalance(), a2.getBalance()))
	            .ifPresent(account -> System.out.println("Account with minimum balance: " + account));

	        // b. Show Account details of account with maximum Balance
	        accounts.stream()
	            .max((a1, a2) -> Double.compare(a1.getBalance(), a2.getBalance()))
	            .ifPresent(account -> System.out.println("Account with maximum balance: " + account));

	        // c. Show names greater than 6 characters
	        List<String> namesGreaterThan6Characters = accounts.stream()
	            .map(account -> account.getName())
	            .filter(name -> name.length() > 6)
	            .collect(Collectors.toList());
	        System.out.println("Names with more than 6 characters: " + namesGreaterThan6Characters);

	        // d. Find total of balance of all accounts
	        double totalBalance = accounts.stream()
	            .mapToDouble(account -> account.getBalance())
	            .sum();
	        System.out.println("Total balance of all accounts: " + totalBalance);
	    }

}
