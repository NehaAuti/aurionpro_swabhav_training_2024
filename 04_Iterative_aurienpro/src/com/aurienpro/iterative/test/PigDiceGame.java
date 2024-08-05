package com.aurienpro.iterative.test;
import java.util.Random;
import java.util.Scanner;
public class PigDiceGame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();
		        int totalScore = 0;
		        int turn = 1;

		        while (totalScore < 20) {
		            int turnScore = 0;
		            boolean turnActive = true;
		            System.out.println("TURN " + turn);

		            while (turnActive) {
		                System.out.print("Roll or hold? (r/h): ");
		                String choice = scanner.next();

		                if (choice.equalsIgnoreCase("r")) {
		                    int die = random.nextInt(6) + 1;
		                    System.out.println("Die: " + die);

		                    if (die == 1) {
		                        System.out.println("Turn over. No score.");
		                        turnActive = false;
		                    } else {
		                        turnScore += die;
		                    }
		                } else if (choice.equalsIgnoreCase("h")) {
		                    totalScore += turnScore;
		                    System.out.println("Score for turn: " + turnScore);
		                    System.out.println("Total score: " + totalScore);
		                    turnActive = false;
		                    
		                    if (totalScore <= 20) {
		                        System.out.println("You Win the Game");
		                } else {
		                    System.out.println("Invalid choice. Please enter 'r' to roll or 'h' to hold.");
		                }
		            }
		            turn++;
		        }

		        System.out.println("You finished in " + (turn - 1) + " turns!");
		        System.out.println("Game over!");
		        scanner.close();

	}

}
}
