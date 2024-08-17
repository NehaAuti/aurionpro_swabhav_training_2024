package com.aurionpro.tictactoe.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.aurionpro.tictactoe.model.Board;
import com.aurionpro.tictactoe.model.MarkType;

public class BoardTest {
    private Board board;

    @BeforeEach
    public void setUp() {
        board = new Board();
    }

    @Test
    public void testPlaceMarkValid() {
        assertTrue(board.placeMark(0, 0, MarkType.X));
        System.out.println("testPlaceMarkValid: Successfully placed mark at (0,0)");
    }

    @Test
    public void testPlaceMarkInvalid() {
        board.placeMark(0, 0, MarkType.X);
        assertFalse(board.placeMark(0, 0, MarkType.O));
        System.out.println("testPlaceMarkInvalid: Cannot place mark at (0,0) again");
    }

    @Test
    public void testCheckWinRow() {
        board.placeMark(0, 0, MarkType.X);
        board.placeMark(0, 1, MarkType.X);
        board.placeMark(0, 2, MarkType.X);
        assertTrue(board.checkWin(MarkType.X));
        System.out.println("testCheckWinRow: Player X wins with a horizontal row");
    }

    @Test
    public void testCheckWinColumn() {
        board.placeMark(0, 0, MarkType.O);
        board.placeMark(1, 0, MarkType.O);
        board.placeMark(2, 0, MarkType.O);
        assertTrue(board.checkWin(MarkType.O));
        System.out.println("testCheckWinColumn: Player O wins with a vertical column");
    }

    @Test
    public void testCheckWinDiagonal() {
        board.placeMark(0, 0, MarkType.X);
        board.placeMark(1, 1, MarkType.X);
        board.placeMark(2, 2, MarkType.X);
        assertTrue(board.checkWin(MarkType.X));
        System.out.println("testCheckWinDiagonal: Player X wins with a diagonal");
    }

    @Test
    public void testCheckDraw() {
        board.placeMark(0, 0, MarkType.X);
        board.placeMark(0, 1, MarkType.O);
        board.placeMark(0, 2, MarkType.X);
        board.placeMark(1, 0, MarkType.O);
        board.placeMark(1, 1, MarkType.X);
        board.placeMark(1, 2, MarkType.O);
        board.placeMark(2, 0, MarkType.O);
        board.placeMark(2, 1, MarkType.X);
        board.placeMark(2, 2, MarkType.O);
        assertTrue(board.isFull());
        assertFalse(board.checkWin(MarkType.X));
        assertFalse(board.checkWin(MarkType.O));
        System.out.println("testCheckDraw: Game ends in a draw");
    }
}
