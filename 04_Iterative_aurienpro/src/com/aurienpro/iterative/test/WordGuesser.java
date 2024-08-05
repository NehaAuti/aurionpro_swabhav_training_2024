package com.aurienpro.iterative.test;
import java.util.Scanner;
import java.util.Random;
public class WordGuesser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"java", "programming", "code", "computer", "science"};
        Random rand = new Random();
        String word = words[rand.nextInt(words.length)];

        char[] blanks = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            blanks[i] = '_';
        }

        int lives = 5;
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            System.out.print("Word: ");
            for (int i = 0; i < blanks.length; i++) {
                System.out.print(blanks[i] + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = scanner.next().charAt(0);

            boolean found = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    blanks[i] = guess;
                    found = true;
                }
            }

            if (!found) {
                lives--;
                System.out.println("Incorrect guess. Lives remaining: " + lives);
            }

            boolean allFilled = true;
            for (int i = 0; i < blanks.length; i++) {
                if (blanks[i] == '_') {
                    allFilled = false;
                    break;
                }
            }
            if (allFilled) {
                gameOver = true;
                System.out.println("Congratulations! You've guessed the word: " + word);
            } else if (lives == 0) {
                gameOver = true;
                System.out.println("Game over! The word was: " + word);
            }
        }

        scanner.close();
    }


	}


