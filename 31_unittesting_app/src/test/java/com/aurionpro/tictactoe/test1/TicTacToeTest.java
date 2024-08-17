package com.aurionpro.tictactoe.test1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.aurionpro.tictactoe.model.test.TicTacToe;

public class TicTacToeTest {
	 private TicTacToe game;

     @BeforeEach
     public void setUp() {
         game = new TicTacToe();
     }

     @Test
     public void testInitialBoardState() {
         char[][] board = game.getBoard();
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 assertEquals(' ', board[i][j], "Board cell should be empty at the start");
             }
         }
     }

     @Test
     public void testMakeValidMove() {
         assertTrue(game.makeMove(0, 0), "Move should be valid");
         assertEquals('X', game.getBoard()[0][0], "Cell should contain X");
     }

     @Test
     public void testMakeInvalidMove() {
         game.makeMove(0, 0);
         assertFalse(game.makeMove(0, 0), "Move should be invalid as cell is already occupied");
         assertFalse(game.makeMove(3, 3), "Move should be invalid as coordinates are out of bounds");
     }

     @Test
     public void testSwitchPlayer() {
         assertEquals('X', game.getCurrentPlayer(), "Initial player should be X");
         game.switchPlayer();
         assertEquals('O', game.getCurrentPlayer(), "Player should switch to O");
         game.switchPlayer();
         assertEquals('X', game.getCurrentPlayer(), "Player should switch back to X");
     }

     @Test
     public void testWinConditionRows() {
         game.makeMove(0, 0);
         game.makeMove(0, 1);
         game.makeMove(0, 2);
         assertTrue(game.checkWin(), "Player X should win with a row completion");
     }

     @Test
     public void testWinConditionColumns() {
         game.makeMove(0, 0);
         game.makeMove(1, 0);
         game.makeMove(2, 0);
         assertTrue(game.checkWin(), "Player X should win with a column completion");
     }

     @Test
     public void testWinConditionDiagonals() {
         game.makeMove(0, 0);
         game.makeMove(1, 1);
         game.makeMove(2, 2);
         assertTrue(game.checkWin(), "Player X should win with a diagonal completion");
     }

     @Test
     public void testBoardFull() {
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 game.makeMove(i, j);
                 game.switchPlayer();
             }
         }
         assertTrue(game.isBoardFull(), "Board should be full");
     }

     @Test
     public void testGameNotFull() {
         game.makeMove(0, 0);
         assertFalse(game.isBoardFull(), "Board should not be full");
     }

}