package com.aurionpro.tictactoe.model;

public class Board {
    private final Cell[][] board;
    private final int size;

    public Board(int size) {
        this.size = size;
        board = new Cell[size][size];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = new Cell();
            }
        }
    }

    public boolean placeMark(int row, int col, char mark) {
        if (isCellEmpty(row, col)) {
            board[row][col].setMark(mark);
            return true;
        }
        return false;
    }

    private boolean isCellEmpty(int row, int col) {
        return board[row][col].getMark() == ' ';
    }

    public boolean checkWin(char mark) {
        return checkRows(mark) || checkCols(mark) || checkDiagonals(mark);
    }

    private boolean checkRows(char mark) {
        for (int i = 0; i < size; i++) {
            if (checkRow(i, mark)) return true;
        }
        return false;
    }

    private boolean checkRow(int row, char mark) {
        for (int i = 0; i < size; i++) {
            if (board[row][i].getMark() != mark) return false;
        }
        return true;
    }

    private boolean checkCols(char mark) {
        for (int i = 0; i < size; i++) {
            if (checkCol(i, mark)) return true;
        }
        return false;
    }

    private boolean checkCol(int col, char mark) {
        for (int i = 0; i < size; i++) {
            if (board[i][col].getMark() != mark) return false;
        }
        return true;
    }

    private boolean checkDiagonals(char mark) {
        return checkMainDiagonal(mark) || checkAntiDiagonal(mark);
    }

    private boolean checkMainDiagonal(char mark) {
        for (int i = 0; i < size; i++) {
            if (board[i][i].getMark() != mark) return false;
        }
        return true;
    }

    private boolean checkAntiDiagonal(char mark) {
        for (int i = 0; i < size; i++) {
            if (board[i][size - i - 1].getMark() != mark) return false;
        }
        return true;
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j].getMark() == ' ') return false;
            }
        }
        return true;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j].getMark());
                if (j < size - 1) System.out.print(" | ");
            }
            System.out.println();
            if (i < size - 1) System.out.println("-----------");
        }
    }
}
