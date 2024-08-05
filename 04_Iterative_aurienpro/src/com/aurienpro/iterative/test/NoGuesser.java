package com.aurienpro.iterative.test;
import java.util.Scanner;
import java.util.Random;
public class NoGuesser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        boolean play = true;

	        while (play) {
	            int randomNumber = random.nextInt(100) + 1;
	            int attempts = 0;
	            boolean hasWon = false;
	            System.out.println("Random number generated!");

	            while (attempts < 5 && !hasWon) {
	                System.out.print("Guess a number: ");
	                int guess = scanner.nextInt();
	                attempts++;

	                if (guess < randomNumber) {
	                    System.out.println("Sorry, too low.");
	                } else if (guess > randomNumber) {
	                    System.out.println("Sorry, too high.");
	                } else {
	                    System.out.println("You won in " + attempts + " attempts!");
	                    hasWon = true;
	                }
	            }

	            if (!hasWon) {
	                System.out.println("You've reached the maximum attempts. The correct number was " + randomNumber);
	            }

	            System.out.print("Do you want to play the game again? (yes/no): ");
	            String response = scanner.next();
	            play = response.equalsIgnoreCase("yes");
	        }

	        System.out.println("Thank you for playing!");
	        scanner.close();

	}

}
