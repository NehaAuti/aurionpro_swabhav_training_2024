package com.aurionpro.tictactoe.model;

public class ResultAnalyzer {
    private Board board;
    private ResultType result;

    public ResultAnalyzer(Board board) {
        this.board = board;
        this.result = ResultType.PROGRESS;
    }

    private void horizontalWinCheck() {
        // Check all rows for win
    }

    private void verticalWinCheck() {
        // Check all columns for win
    }

    private void diagonalWinCheck() {
        // Check both diagonals for win
    }

    public ResultType analyzeResult() {
        horizontalWinCheck();
        verticalWinCheck();
        diagonalWinCheck();
        return result;
    }

    public ResultType getResult() {
        return result;
    }

    public Board getBoard() {
        return board;
    }
}
