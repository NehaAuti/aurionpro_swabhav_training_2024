package com.aurionpro.tictactoe.test1;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.aurionpro.tictactoe.model.test.Board;
import com.aurionpro.tictactoe.model.test.PlayingPiece;




public class BoardTest {
	private Board board;
	private PlayingPiece playingPiece;
	
	@BeforeEach
	public void setUp() {
		board = new Board(3);
		playingPiece = new PlayingPiece('X');
	}
	
	@Test
	public void testAddPieceValid() {
		assertTrue(board.addPiece(2, 2, playingPiece));
		assertEquals(playingPiece.getPieceType(), board.getBoard()[2][2].getPieceType());
	}
	
	@Test
	public void testAddPieceInvalid() {
		board.addPiece(2, 2, playingPiece);
		playingPiece.setPieceType('O');
		assertFalse(board.addPiece(2, 2, playingPiece));
	}
	
	@Test
	public void testAddPieceOutOfBound() {
		assertFalse(board.addPiece(-1, 0, playingPiece));
		assertFalse(board.addPiece(-3, 0, playingPiece));
		assertFalse(board.addPiece(-5, 0, playingPiece));
		assertFalse(board.addPiece(0, -1, playingPiece));
		assertFalse(board.addPiece(-1, -9, playingPiece));
	}

}