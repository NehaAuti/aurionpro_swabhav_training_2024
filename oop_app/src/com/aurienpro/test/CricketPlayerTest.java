package com.aurienpro.test;
import java.util.Scanner;

import com.aurienpro.model.CricketPlayer;
import com.aurienpro.model.Student;
public class CricketPlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		CricketPlayer cricketplayer = new CricketPlayer();
//		System.out.println(cricketplayer);
//		
//		System.out.println("Player Id:"+cricketplayer.getPlayerId());
//	    System.out.println("Player Name:"+cricketplayer.getName());
//	    System.out.println("Number of Matches:"+cricketplayer.getNumberOfMatches());
//	    System.out.println("Runs:"+cricketplayer.getRuns());
//	    System.out.println("Wicket:"+cricketplayer.getWicket());
//	    cricketplayer.display();
//	    cricketplayer.calculateAverge();
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    CricketPlayer players[]=new CricketPlayer[3];
	    System.out.println("Enter the details of player:");
	    
	    for(int i =0;i<players.length;i++)
	    {
	    
	    
	    System.out.println("Enter the Player Id:");
	    int playerId=scanner.nextInt();
	   
	    System.out.println("Enter the Player Name:");
	    String name =scanner.next();
	 
	    System.out.println("Enter the Number of Matches:");
	    int numberOfMatches=scanner.nextInt();
	  
	    System.out.println("Enter the Runs:");
	    int runs=scanner.nextInt();
	    
	    System.out.println("Enter the Wicket:");
	    int wicket=scanner.nextInt();
	    
	    players[i]=new CricketPlayer(playerId,name,numberOfMatches,runs,wicket);
	    }
	    for(int i=0;i<players.length;i++)
	    {
	    	players[i].display();
	    	
	    	players[i].calculateAverage();
	    }
	
	    

	}

}
