package com.aurienpro.model;
import java.util.Random;
import java.util.Scanner;
public class PIGDiceGameCalesthenics {

	private int totalScore = 0;
    private int turnScore = 0;

    public int getTotalScore() {
        return totalScore;
    }

    public void playTurn(Scanner scanner, Random random, int turnCount) {
        turnScore = 0;
        boolean turnActive = true;

        System.out.println("TURN " + turnCount);

        while (turnActive) {
            turnActive = takeTurn(scanner, random);
        }
    }

    private boolean takeTurn(Scanner scanner, Random random) {
        System.out.print("Roll or hold? (r/h): ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("r")) {
            return rollDie(random);
        }

        if (choice.equalsIgnoreCase("h")) {
            holdTurn();
            return false;
        }

        System.out.println("Invalid choice. Please enter 'r' to roll or 'h' to hold.");
        return true;
    }

    private boolean rollDie(Random random) {
        int die = random.nextInt(6) + 1;
        System.out.println("Die: " + die);

        if (die == 1) {
            System.out.println("Turn over. No score.");
            return false;
        }

        turnScore += die;
        System.out.println("Turn score: " + turnScore);

        if (totalScore + turnScore >= 20) {
            totalScore += turnScore;
            System.out.println("You won with a total score of " + totalScore + " in this turn!");
            System.out.println("Game over! Congratulations!");
            System.exit(0);
        }

        return true;
    }

    private void holdTurn() {
        totalScore += turnScore;
        System.out.println("Score for turn: " + turnScore);
        System.out.println("Total score: " + totalScore);
    }

    public void endGame(int turnCount) {
        System.out.println("You won in " + turnCount + " turns!");
        System.out.println("Game over! Congratulations!");
    }
}