package com.aurionpro.tictactoe.test1;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.aurionpro.tictactoe.model.test.TicTacToeFacade;

public class TicTacToeFacadeTest {
	private TicTacToeFacade facade;

	 @BeforeEach
	 void setUp() {
	  facade = new TicTacToeFacade(3);
	 }

	 @Test
	 void TestInitialization() {
	  facade.initializeGame();
	  assertNotNull(facade);
	 }

	 @Test
	 void testStartGame() {
	  facade.initializeGame();
	  String result = facade.startGame();
	  assertNotNull(result);
	 }

	}
