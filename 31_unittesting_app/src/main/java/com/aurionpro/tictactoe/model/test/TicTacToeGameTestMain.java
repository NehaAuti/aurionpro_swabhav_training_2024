package com.aurionpro.tictactoe.model.test;

import java.util.Scanner;

public class TicTacToeGameTestMain {

	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  System.out.println("Enter the size of grid : ");
	  Scanner scanner = new Scanner(System.in);
	  int sizeOfGrid = scanner.nextInt();
	  TicTacToeFacade game = new TicTacToeFacade(sizeOfGrid);
	  System.out.println(game.startGame());
	 }
	}