package com.aurionpro.model;

public class TicTacToeFacade {
    private Board board;
    private GameLogic gameLogic;
    private Player playerX;
    private Player playerO;
    private Player currentPlayer;

    public TicTacToeFacade() {
        board = new Board();
        gameLogic = new GameLogic(board);
        playerX = new Player('X');
        playerO = new Player('O');
        currentPlayer = playerX;
    }

    public void startGame() {
        board.initializeBoard();
        board.printBoard();
    }

    public boolean makeMove(int row, int col) {
        if (board.makeMove(row, col, currentPlayer.getSymbol())) {
            board.printBoard();
            if (gameLogic.checkWin(currentPlayer.getSymbol())) {
                System.out.println("Player " + currentPlayer.getSymbol() + " wins!");
                return true; // Game over
            }
            if (board.isFull()) {
                System.out.println("It's a draw!");
                return true; // Game over
            }
            switchPlayer();
            return false; // Not game over
        } else {
            System.out.println("Invalid move. Try again.");
            return false; // Not game over
        }
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }
}

