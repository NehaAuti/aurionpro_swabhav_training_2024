package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.EmailValidator;
import com.aurionpro.model.PasswordValidator;
import com.aurionpro.model.User;

import com.aurionpro.exceptions.EmailNotValidException;
import com.aurionpro.exceptions.PasswordNotValidException;

public class UserTest {

    public static void main(String[] args) {
    	
    	        Scanner scanner = new Scanner(System.in);

    	        System.out.println("Enter email:");
    	        String email = scanner.nextLine();

    	        System.out.println("Enter password:");
    	        String password = scanner.nextLine();

    	        User user = new User(email, password);

    	        boolean hasEmailError = false;
    	        boolean hasPasswordError = false;

    	        try {
    	            EmailValidator emailValidator = new EmailValidator(email, password);
    	            emailValidator.validateEmail();
    	        } catch (EmailNotValidException e) {
    	            System.out.println("Error: " + e.getMessage());
    	            hasEmailError = true;
    	        }

    	        try {
    	            PasswordValidator passwordValidator = new PasswordValidator(email, password);
    	            passwordValidator.validatePassword();
    	        } catch (PasswordNotValidException e) {
    	            System.out.println("Error: " + e.getMessage());
    	            hasPasswordError = true;
    	        }

    	        if (!hasEmailError && !hasPasswordError) {
    	            user.display();
    	        }

    	        scanner.close();
    	    }
    	}