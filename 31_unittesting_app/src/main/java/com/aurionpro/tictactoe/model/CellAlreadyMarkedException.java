package com.aurionpro.tictactoe.model;

public class CellAlreadyMarkedException extends Exception {
    public CellAlreadyMarkedException(String message) {
        super(message);
    }
}
