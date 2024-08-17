package com.aurionpro.tictactoe.test1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Deque;
import java.util.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.aurionpro.tictactoe.model.test.Board;
import com.aurionpro.tictactoe.model.test.Player;
import com.aurionpro.tictactoe.model.test.PlayingPieceO;
import com.aurionpro.tictactoe.model.test.PlayingPieceX;
import com.aurionpro.tictactoe.model.test.TicTacToeGame;

public class TicTacToeGameTest {
	private TicTacToeGame game;
	 private Deque<Player> players;

	 @BeforeEach
	 public void setUp() {
	  game = new TicTacToeGame(3);
	  players = new LinkedList<>();
	  PlayingPieceX crossPiece = new PlayingPieceX();
	  Player player1 = new Player("Player 'X' ", crossPiece);

	  PlayingPieceO noughtsPiece = new PlayingPieceO();
	  Player player2 = new Player("Player 'O' ", noughtsPiece);

	  players.add(player1);
	  players.add(player2);
	  
	  game.setGameBoard(new Board(3));
	 }

	 @Test
	 public void testGameInitilization() {
	  assertEquals(2, game.getPlayers().size());
	  assertEquals(3, game.getGameBoard().getSize());
	 }

	 @Test
	 public void testValidMove() {
	  boolean moveSucessful = game.getGameBoard().addPiece(0, 0, game.getPlayers().peek().getPlayingPiece());
	  assertTrue(moveSucessful);
	  assertEquals('X', game.getGameBoard().getBoard()[0][0].getPieceType());
	 }

	 @Test
	 public void testInvalidMoveOutOfBound() {
	  boolean moveSucessful = game.getGameBoard().addPiece(3, 3, game.getPlayers().peek().getPlayingPiece());
	  assertFalse(moveSucessful);
	 }

	 @Test
	 public void testInvalidMoveAlredyTaken() {
	  game.getGameBoard().addPiece(0, 0, game.getPlayers().peek().getPlayingPiece());
	  boolean moveSucessful = game.getGameBoard().addPiece(0, 0, game.getPlayers().peek().getPlayingPiece());
	  assertFalse(moveSucessful);
	 }

	 @Test
	 public void testWinnerRow() {
	  game.getGameBoard().addPiece(0, 0, new PlayingPieceX());
	  game.getGameBoard().addPiece(0, 1, new PlayingPieceX());
	  game.getGameBoard().addPiece(0, 2, new PlayingPieceX());
	  boolean isWinner = game.isThereWinner(0, 2, 'X');
	  assertTrue(isWinner);
	 }

	 @Test
	 public void testWinnerColumn() {
	  game.getGameBoard().addPiece(0, 0, new PlayingPieceX());
	  game.getGameBoard().addPiece(1, 0, new PlayingPieceX());
	  game.getGameBoard().addPiece(2, 0, new PlayingPieceX());
	  boolean isWinner = game.isThereWinner(2, 0, 'X');
	  assertTrue(isWinner);
	 }

	 @Test
	 public void testWinnerDiagonal() {
	  game.getGameBoard().addPiece(0, 0, new PlayingPieceX());
	  game.getGameBoard().addPiece(1, 1, new PlayingPieceX());
	  game.getGameBoard().addPiece(2, 2, new PlayingPieceX());
	  boolean isWinner = game.isThereWinner(2, 2, 'X');
	  assertTrue(isWinner);
	 }

	 @Test
	 public void testWinnerAntiDiagonal() {
	  game.getGameBoard().addPiece(0, 2, new PlayingPieceX());
	  game.getGameBoard().addPiece(1, 1, new PlayingPieceX());
	  game.getGameBoard().addPiece(2, 0, new PlayingPieceX());
	  boolean isWinner = game.isThereWinner(2, 0, 'X');
	  assertTrue(isWinner);
	 }

	 @Test
	 public void testTie() {
	  game.getGameBoard().addPiece(0, 0, new PlayingPieceX());
	  game.getGameBoard().addPiece(0, 1, new PlayingPieceO());
	  game.getGameBoard().addPiece(0, 2, new PlayingPieceX());
	  game.getGameBoard().addPiece(1, 0, new PlayingPieceO());
	  game.getGameBoard().addPiece(1, 1, new PlayingPieceX());
	  game.getGameBoard().addPiece(1, 2, new PlayingPieceO());
	  game.getGameBoard().addPiece(2, 0, new PlayingPieceX());
	  game.getGameBoard().addPiece(2, 1, new PlayingPieceO());
	  game.getGameBoard().addPiece(2, 2, new PlayingPieceX());
	  assertEquals("tie", game.startGame());
	 }

	}