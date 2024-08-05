package com.aurionpro.test;
import java.util.Scanner;

public class MinToHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int totalMinutes = scanner.nextInt();
        
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println(totalMinutes + " minutes is " + hours + " hours and " + minutes + " minutes.");

        scanner.close();

	}

}
