package com.aurionpro.behavioural.observer.test;

import java.util.Scanner;

import com.aurionpro.behavioural.observer.model.Account;
import com.aurionpro.behavioural.observer.model.AppNotifier;
import com.aurionpro.behavioural.observer.model.EmailNotifier;
import com.aurionpro.behavioural.observer.model.InsufficientFundsException;
import com.aurionpro.behavioural.observer.model.SMSNotifier;
import com.aurionpro.behavioural.observer.model.WhatsappNotifier;

public class AccountNotifierTest {
    public static void main(String[] args) {
    	
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter account holder name: ");
            String name = scanner.nextLine();

            System.out.print("Enter initial balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine(); 

            Account account = new Account(name, balance);

            System.out.println("Generated Account Number: " + account.getAccountNumber());

            System.out.println("Which notifications do you want to register? (1: SMS, 2: Email, 3: WhatsApp, 4: Done)");
            boolean notifiersRegistrationDone = false;
            while (!notifiersRegistrationDone) {
                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        account.registerNotifier(new SMSNotifier());
                        System.out.println("SMS Notifier registered.");
                        break;
                    case 2:
                        account.registerNotifier(new EmailNotifier());
                        System.out.println("Email Notifier registered.");
                        break;
                    case 3:
                        account.registerNotifier(new WhatsappNotifier());
                        System.out.println("WhatsApp Notifier registered.");
                        break;
                    case 4:
                        account.registerNotifier(new AppNotifier());
                        System.out.println("App Notifier registered.");
                        break;
                    case 5:
                        System.out.println("Notifiers registration done.");
                        notifiersRegistrationDone = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                        break;
                }
            }

            boolean exit = false;
            while (!exit) {
                System.out.println("Select operation: (1: Deposit, 2: Withdraw, 3: Exit)");
                System.out.print("Enter choice: ");
                int operation = scanner.nextInt();

                if (operation == 3) {
                    exit = true;
                    continue;
                }

                System.out.print("Enter amount: ");
                double amount = scanner.nextDouble();

                try {
                    switch (operation) {
                        case 1:
                            account.deposit(amount);
                            System.out.println("Amount deposited.");
                            break;
                        case 2:
                            account.withdraw(amount);
                            System.out.println("Amount withdrawn.");
                            break;
                        default:
                            System.out.println("Invalid operation. Try again.");
                            break;
                    }
                } catch (InsufficientFundsException e) {
                    System.out.println(e.getMessage());
                }

                System.out.println(account);
            }

            scanner.close();
        }
    }