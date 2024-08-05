package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoardTest {
    private Board1 board;

    @BeforeEach
    public void setUp() {
        board = new Board1(3);
    }

    @Test
    public void testPlaceMarkValid() {
        boolean result = board.placeMark(0, 0, 'X');
        board.printBoard();
        System.out.println("Test Place Mark Valid: Expected true, got " + result);
        assertTrue(result);
    }

    @Test
    public void testPlaceMarkInvalid() {
        board.placeMark(0, 0, 'X');
        boolean result = board.placeMark(0, 0, 'O');
        board.printBoard();
        System.out.println("Test Place Mark Invalid: Expected false, got " + result);
        assertFalse(result);
    }

    @Test
    public void testCheckWinRow() {
        board.placeMark(0, 0, 'X');
        board.placeMark(0, 1, 'X');
        board.placeMark(0, 2, 'X');
        boolean result = board.checkWin('X');
        board.printBoard();
        System.out.println("Test Check Win Row: Expected true, got " + result);
        assertTrue(result);
    }

    @Test
    public void testCheckWinColumn() {
        board.placeMark(0, 0, 'O');
        board.placeMark(1, 0, 'O');
        board.placeMark(2, 0, 'O');
        boolean result = board.checkWin('O');
        board.printBoard();
        System.out.println("Test Check Win Column: Expected true, got " + result);
        assertTrue(result);
    }

    @Test
    public void testCheckWinDiagonal() {
        board.placeMark(0, 0, 'X');
        board.placeMark(1, 1, 'X');
        board.placeMark(2, 2, 'X');
        boolean result = board.checkWin('X');
        board.printBoard();
        System.out.println("Test Check Win Diagonal: Expected true, got " + result);
        assertTrue(result);
    }

    @Test
    public void testCheckDraw() {
        board.placeMark(0, 0, 'X');
        board.placeMark(0, 1, 'O');
        board.placeMark(0, 2, 'X');
        board.placeMark(1, 0, 'O');
        board.placeMark(1, 1, 'X');
        board.placeMark(1, 2, 'O');
        board.placeMark(2, 0, 'O');
        board.placeMark(2, 1, 'X');
        board.placeMark(2, 2, 'O');
        boolean isFull = board.isFull();
        boolean xWin = board.checkWin('X');
        boolean oWin = board.checkWin('O');
        board.printBoard();
        System.out.println("Test Check Draw: Expected full board true, got " + isFull);
        System.out.println("Test Check Draw: Expected X win false, got " + xWin);
        System.out.println("Test Check Draw: Expected O win false, got " + oWin);
        assertTrue(isFull);
        assertFalse(xWin);
        assertFalse(oWin);
    }
}


//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//public class BoardTest {
//    private Board board;
//
//    @BeforeEach
//    public void setUp() {
//        board = new Board(3);
//    }
//
//    @Test
//    public void testPlaceMarkValid() {
//        assertTrue(board.placeMark(0, 0, 'X'));
//    }
//
//    @Test
//    public void testPlaceMarkInvalid() {
//        board.placeMark(0, 0, 'X');
//        assertFalse(board.placeMark(0, 0, 'O'));
//    }
//
//    @Test
//    public void testCheckWinRow() {
//        board.placeMark(0, 0, 'X');
//        board.placeMark(0, 1, 'X');
//        board.placeMark(0, 2, 'X');
//        assertTrue(board.checkWin('X'));
//    }
//
//    @Test
//    public void testCheckWinColumn() {
//        board.placeMark(0, 0, 'O');
//        board.placeMark(1, 0, 'O');
//        board.placeMark(2, 0, 'O');
//        assertTrue(board.checkWin('O'));
//    }
//
//    @Test
//    public void testCheckWinDiagonal() {
//        board.placeMark(0, 0, 'X');
//        board.placeMark(1, 1, 'X');
//        board.placeMark(2, 2, 'X');
//        assertTrue(board.checkWin('X'));
//    }
//
//    @Test
//    public void testCheckDraw() {
//        board.placeMark(0, 0, 'X');
//        board.placeMark(0, 1, 'O');
//        board.placeMark(0, 2, 'X');
//        board.placeMark(1, 0, 'O');
//        board.placeMark(1, 1, 'X');
//        board.placeMark(1, 2, 'O');
//        board.placeMark(2, 0, 'O');
//        board.placeMark(2, 1, 'X');
//        board.placeMark(2, 2, 'O');
//        assertTrue(board.isFull());
//        assertFalse(board.checkWin('X'));
//        assertFalse(board.checkWin('O'));
//    }
//}
