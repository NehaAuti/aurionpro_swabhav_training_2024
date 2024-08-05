package com.aurionpro.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    private final Board board;
    private final Player[] players;
    private int currentPlayerIndex;

    public Game(int boardSize, Player player1, Player player2) {
        board = new Board(boardSize);
        players = new Player[]{player1, player2};
        currentPlayerIndex = 0;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean gameEnded = false;

        while (!gameEnded) {
            board.display();
            Player currentPlayer = players[currentPlayerIndex];
            System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getMark() + "). Enter row and column (1-3): ");

            int row = -1;
            int col = -1;
            boolean validInput = false;

            while (!validInput) {
                try {
                    row = scanner.nextInt() - 1;
                    col = scanner.nextInt() - 1;
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter numeric values for row and column.");
                    scanner.next(); // Clear the invalid input
                }
            }

            boolean markPlaced = board.placeMark(row, col, currentPlayer.getMark());
            gameEnded = processGameEndConditions(markPlaced, currentPlayer);

            if (!gameEnded) {
                switchPlayer();
            }
        }

        scanner.close();
    }

    private boolean processGameEndConditions(boolean markPlaced, Player currentPlayer) {
        if (!markPlaced) {
            System.out.println("This move at (" + (currentPlayerIndex + 1) + "," + (currentPlayerIndex + 1) + ") is not valid. Try again...");
            return false;
        }

        if (board.checkWin(currentPlayer.getMark())) {
            board.display();
            System.out.println("Player '" + currentPlayer.getMark() + "' won!");
            return true;
        }

        if (board.isFull()) {
            board.display();
            System.out.println("It's a draw!");
            return true;
        }

        return false;
    }

    private void switchPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % 2;
    }
}
