package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exceptions.AgeNotValidException;
import com.aurionpro.model.Voter;

public class VoterTest {

	public static void main(String[] args) throws AgeNotValidException {
		// TODO Auto-generated method stub
		Voter voter= null;
		try {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Voter Id:");
		int voterId = scanner.nextInt();
		System.out.println("Enter First Name:");
	    String firstName = scanner.next();
		System.out.println("Enter Last Name:");
		String lastName = scanner.next();
		System.out.println("Enter Age:");
		int age = scanner.nextInt();
		
		voter = new Voter(voterId,firstName,lastName,age);
		
		}
		catch (AgeNotValidException exception)
		{
			System.out.println(exception.getMessage());
		}
		System.out.println(voter);

	}

}
