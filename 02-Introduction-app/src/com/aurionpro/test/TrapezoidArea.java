package com.aurionpro.test;
import java.util.Scanner;

public class TrapezoidArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 
	        System.out.print("Enter the length of the first base: ");
	        double base1 = scanner.nextDouble();

	        System.out.print("Enter the length of the second base: ");
	        double base2 = scanner.nextDouble();

	        System.out.print("Enter the height of the trapezoid: ");
	        double height = scanner.nextDouble();

	        double area = (base1 + base2) * height / 2.0;

	        System.out.println("The area of the trapezoid is: " + area);

	        scanner.close();

	}

}
