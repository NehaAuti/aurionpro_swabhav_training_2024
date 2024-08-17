package com.aurionpro.tictactoe.model;

public class Game {
    private Player currentPlayer;
    private Player[] players;
    private Board board;
    private ResultAnalyzer analyzer;
    private ResultType result = ResultType.PROGRESS;

    public Game(Player[] players, Board board, ResultAnalyzer analyzer) {
        this.players = players;
        this.board = board;
        this.analyzer = analyzer;
        this.currentPlayer = players[0];
    }

    public void play(int loc) {
        if (board.placeMark(loc / 3, loc % 3, currentPlayer.getMark())) {
            result = analyzer.analyzeResult();
            switchCurrentPlayer();
        } else {
            System.out.println("Cell is already marked or invalid location");
        }
    }

    private void switchCurrentPlayer() {
        currentPlayer = (currentPlayer == players[0]) ? players[1] : players[0];
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public ResultType getResult() {
        return result;
    }
}

