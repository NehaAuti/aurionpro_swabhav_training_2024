package com.aurienpro.test;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import com.aurienpro.model.CricketPlayerApp;
public class CricketPlayerAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players to create: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        CricketPlayerApp[] players = new CricketPlayerApp[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for player " + (i + 1) + ":");

            System.out.print("Enter Player ID: ");
            int playerId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Matches Played: ");
            int matches = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Runs Scored: ");
            int runs = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Wickets Taken: ");
            int wickets = scanner.nextInt();
            scanner.nextLine();

            players[i] = new CricketPlayerApp(playerId, name, matches, runs, wickets);
        }

        displayPlayers(players);

        // Find and display the player with the maximum average
        CricketPlayerApp maxAveragePlayer = getMaximumAveragePlayer(players);
        if (maxAveragePlayer != null) {
            System.out.println("\nPlayer with the maximum average:");
            maxAveragePlayer.display();
        } else {
            System.out.println("No players found.");
        }

        // Display players sorted by average in ascending order
        System.out.println("\nPlayers sorted by average in ascending order:");
        displayPlayersSortedByAverage(players);

        scanner.close();
    }

    // Method to get the player with the maximum average
    public static CricketPlayerApp getMaximumAveragePlayer(CricketPlayerApp[] players) {
        if (players == null || players.length == 0) {
            return null;
        }

        CricketPlayerApp maxAveragePlayer = players[0];
        for (int i = 1; i < players.length; i++) {
            if (players[i].calculateAverage() > maxAveragePlayer.calculateAverage()) {
                maxAveragePlayer = players[i];
            }
        }
        return maxAveragePlayer;
    }

    public static void displayPlayers(CricketPlayerApp[] players) {
        if (players == null || players.length == 0) {
            System.out.println("No players found.");
            return;
        }

        System.out.println("\nList of players:");
        for (int i = 0; i < players.length; i++) {
            players[i].display();
        }
    }

    public static void displayPlayersSortedByAverage(CricketPlayerApp[] players) {
        if (players == null || players.length == 0) {
            System.out.println("No players found.");
            return;
        }

        Arrays.sort(players, Comparator.comparingDouble(CricketPlayerApp::calculateAverage));

        for (int i = 0; i < players.length; i++) {
            players[i].display();
        }
   }
}
