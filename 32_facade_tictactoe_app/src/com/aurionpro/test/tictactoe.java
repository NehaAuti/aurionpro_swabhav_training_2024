package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.TicTacToeFacade;

public class tictactoe {

	public static void main(String[] args) {
		 TicTacToeFacade game = new TicTacToeFacade();
	        Scanner scanner = new Scanner(System.in);

	        game.startGame();
	        boolean gameOver = false;

	        while (!gameOver) {
	            System.out.println("Enter row and column (0, 1, or 2) for player " + game.getCurrentPlayer().getSymbol() + ":");
	            int row = scanner.nextInt();
	            int col = scanner.nextInt();
	            gameOver = game.makeMove(row, col);
	        }

	        scanner.close();
	    }
	}