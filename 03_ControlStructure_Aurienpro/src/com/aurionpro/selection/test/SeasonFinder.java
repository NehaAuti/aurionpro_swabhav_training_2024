package com.aurionpro.selection.test;

import java.util.Scanner;

public class SeasonFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the no of Month: ");
	    int monthNo = scanner.nextInt();
	    
	    switch (monthNo)
	    {
	    case 1:
	    case 2:
	    case 11:
	    case 12:
	    System.out.println("Winter Season");
	    break;
	    
	    case 3:
	    case 4:
	    case 5:
	    case 6:
	    System.out.println("Summer Season");
	    break;
	    
	    case 7:
	    case 8:
	    case 9:
	    case 10:
	    System.out.println("Rainy Season");
	    break;
	    
	    default: System.out.println("Invalid No");
	    }
	    scanner.close();
	    

	}

}
