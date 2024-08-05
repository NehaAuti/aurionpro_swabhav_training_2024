package com.aurionpro.model;

public class GameLogic {
    private Board board;

    public GameLogic(Board board) {
        this.board = board;
    }

    public boolean checkWin(char player) {
        char[][] b = board.getBoard();
        int size = b.length;

        // Check rows
        for (int i = 0; i < size; i++) {
            if (checkRow(b, i, player)) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < size; i++) {
            if (checkColumn(b, i, player)) {
                return true;
            }
        }

        // Check diagonals
        return checkDiagonal(b, player) || checkAntiDiagonal(b, player);
    }

    private boolean checkRow(char[][] board, int row, char player) {
        for (int col = 0; col < board.length; col++) {
            if (board[row][col] != player) {
                return false;
            }
        }
        return true;
    }

    private boolean checkColumn(char[][] board, int col, char player) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][col] != player) {
                return false;
            }
        }
        return true;
    }

    private boolean checkDiagonal(char[][] board, char player) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] != player) {
                return false;
            }
        }
        return true;
    }

    private boolean checkAntiDiagonal(char[][] board, char player) {
        int size = board.length;
        for (int i = 0; i < size; i++) {
            if (board[i][size - 1 - i] != player) {
                return false;
            }
        }
        return true;
    }
}


