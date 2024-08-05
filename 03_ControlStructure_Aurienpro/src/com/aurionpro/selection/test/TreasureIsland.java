package com.aurionpro.selection.test;
import java.util.Scanner;
public class TreasureIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		    System.out.println("Welcome to Treasure Island.");
	        System.out.println("Your mission is to find the treasure.");
	        System.out.print("left or right? ");
	        String choice1 = scanner.nextLine();
	        if (choice1==("left")) {
	            System.out.print("swim or wait? ");
	            String choice2 = scanner.nextLine();
	            if (choice2.equals("wait"))
	            {
	                System.out.print("Which door? Red, Blue, or Yellow? ");
	                String choice3 = scanner.nextLine();
	                if (choice3.equals("red"))
	                {
	                    System.out.println("Burned by fire. Game Over.");
	                } else if (choice3.equals("blue"))
	                {
	                    System.out.println("Eaten by beasts. Game Over.");
	                } else if (choice3.equals("yellow"))
	                {
	                    System.out.println("You Win!");
	                } else
	                {
	                    System.out.println("Game Over.");}
	            } else 
	                {
	                System.out.println("Attacked by trout. Game Over.");} }
	            else
	            { System.out.println("Fall into a hole. Game Over."); }
		scanner.close(); 
	}
}
