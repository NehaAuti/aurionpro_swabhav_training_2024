package com.aurionpro.test;
import java.util.Random;
import java.util.Scanner;

import com.aurienpro.model.PIGDiceGameCalesthenics;

public class PIGDiceBameCalesthenicsTest {

     public static void main(String[] args) {
		// TODO Auto-generated method stub
    	 
    	 PIGDiceGameCalesthenics game = new PIGDiceGameCalesthenics();
    	 PIGDiceBameCalesthenicsTest test = new PIGDiceBameCalesthenicsTest();
         test.startGame(game);
     }

     private void startGame(PIGDiceGameCalesthenics game) {
         Scanner scanner = new Scanner(System.in);
         Random random = new Random();
         int turnCount = 1;

         while (game.getTotalScore() < 20) {
             game.playTurn(scanner, random, turnCount);
             turnCount++;
         }

         game.endGame(turnCount);
         scanner.close();
     }
 }