package com.aurionpro.test;
import java.util.Scanner;

import com.aurienpro.model.InputValidator;

public class InputValidatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        InputValidator validator = new InputValidator();

        System.out.println("Enter username:");
        String username = scanner.nextLine();
        
        boolean isUsernameValid = validator.validateUsername(username);
        if (!isUsernameValid) {
            System.out.println("Username is invalid");
        } else {
            System.out.println("Username is valid");
        }

        System.out.println("Enter password:");
        String password = scanner.nextLine();
        boolean isPasswordValid = validator.validatePassword(password);
        if (!isPasswordValid) {
            System.out.println("Password is invalid");
        } else {
            System.out.println("Password is valid");
        }

        System.out.println("Enter email:");
        String email = scanner.nextLine();
        
        boolean isEmailValid = validator.validateEmail(email);
        if (!isEmailValid) {
            System.out.println("Email is invalid");
        } else {
            System.out.println("Email is valid");
        }

        scanner.close();
    }
}
