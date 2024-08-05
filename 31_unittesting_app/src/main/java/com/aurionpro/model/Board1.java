package com.aurionpro.model;

public class Board1 {
	    private char[][] board;
	    private final int size;

	    public Board1(int size) {
	        this.size = size;
	        board = new char[size][size];
	        initializeBoard();
	    }

	    public void initializeBoard() {
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                board[i][j] = '-';
	            }
	        }
	    }

	    public boolean isFull() {
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                if (board[i][j] == '-') {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

	    public boolean placeMark(int row, int col, char player) {
	        if (board[row][col] == '-') {
	            board[row][col] = player;
	            return true;
	        }
	        return false;
	    }

	    public boolean checkWin(char player) {
	        // Implement check win logic here
	        return false;
	    }

	    public void printBoard() {
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                System.out.print(board[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public char[][] getBoard() {
	        return board;
	    }
	}


