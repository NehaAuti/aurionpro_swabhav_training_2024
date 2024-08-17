package com.aurionpro.tictactoe.test1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.aurionpro.tictactoe.model.test.PlayingPieceO;

public class PlayingPieceOTest {


	 @Test
	 void testPlayingPieceOConstructor() {
	  PlayingPieceO piece = new PlayingPieceO();
	  assertEquals('O', piece.getPieceType());
	 }
	}
