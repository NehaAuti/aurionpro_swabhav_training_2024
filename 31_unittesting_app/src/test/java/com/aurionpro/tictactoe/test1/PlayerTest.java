package com.aurionpro.tictactoe.test1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.aurionpro.tictactoe.model.test.Player;
import com.aurionpro.tictactoe.model.test.PlayingPiece;
import com.aurionpro.tictactoe.model.test.PlayingPieceO;
import com.aurionpro.tictactoe.model.test.PlayingPieceX;

public class PlayerTest { 
	 @Test
	 void testSetName() {
	  Player player = new Player("Player 'X'", new PlayingPieceX());
	  player.setName("New Player Name");
	  assertEquals("New Player Name", player.getName());
	 }

	 @Test
	 void testSetPlayingPiece() {
	  PlayingPiece piece = new PlayingPieceO();
	  Player player = new Player("Player 'X'", new PlayingPieceX());
	  player.setPlayingPiece(piece);
	  assertEquals(piece, player.getPlayingPiece());
	 }
	}
