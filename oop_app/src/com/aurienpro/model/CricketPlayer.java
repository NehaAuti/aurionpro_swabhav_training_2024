package com.aurienpro.model;

public class CricketPlayer {
	
		private int  playerId;
		private String name;
		private int numberOfMatches;
		private int runs;
		private int wicket;
		
		public CricketPlayer(){
			this.playerId=1;
			this.name="rohit";
			this.numberOfMatches=200;
			this.runs=5000;
			this.wicket=20;
		}
		
		public CricketPlayer(int playerId,String name,int numberOfmatches,int runs,int wicket){
			this.playerId=playerId;
			this.name=name;
			this.numberOfMatches=numberOfmatches;
			this.runs=runs;
			this.wicket=wicket;
		}
		
		public void setPlayerId(int playerId)
		{
			this.playerId = playerId;
		}

		public int getPlayerId()
		{
			return this.playerId;
		}

		public void setName(String name)
		{
			this.name = name;
		}

		public String getName()
		{
			return this.name;
		}
		
		public void setNumberOfMatches(int numberOfMatches)
		{
			this.numberOfMatches = numberOfMatches;
		}

		public int getNumberOfMatches()
		{
			return this.numberOfMatches;
		}
		public void setRuns(int runs)
		{
			this.runs= runs;
		}

		public int getRuns()
		{
			return this.runs;
		}
		public void setWicket(int wicket)
		{
			this.wicket= wicket;
		}

		public int getWicket()
		{
			return this.wicket;
		}
		
		public void display()
		{
			System.out.println("Player Id:"+playerId);
			System.out.println("Player Name:"+name);
			System.out.println("Number of Matches:"+numberOfMatches);
			System.out.println("Runs:"+runs);
			System.out.println("Wicket:"+wicket);

		}
		public void calculateAverage()
		{
			double result = runs/numberOfMatches;
			System.out.println("Averge:"+result);
		}


}
