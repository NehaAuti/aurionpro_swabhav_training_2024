package com.aurionpro.test;
import java.util.Scanner;
public class BmiCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter weight in kilograms: ");
	        Double weight = scanner.nextDouble();

	        System.out.print("Enter height in meters: ");
	        Double height = scanner.nextDouble();

	        // Calculate BMI
	        double bmi = weight / (height * height);

	        System.out.printf("Body Mass Index (BMI) is: %.2f\n", bmi);

	        scanner.close();

	}

}
