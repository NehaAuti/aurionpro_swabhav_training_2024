package com.aurionpro.selection.test;
import java.util.Scanner;
public class HeightBillCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your height in cm: ");
	        int height = scanner.nextInt();
	        if (height < 120)
	        {System.out.println("Can not ride");
	        } 
	        else {
                System.out.println("Can ride");
	            System.out.print("Enter your age: ");
	            int age = scanner.nextInt();
	            int cost = 0;
	            if (age < 12) {
	                cost = 5;
	            } else if (age >= 12 && age < 18) {
	                cost = 7;}
	            else if (age >= 18 && age < 45) {
	                cost = 12;}
	            else if (age >= 45 && age < 55) {
	                cost = 0;}
	            else {
	                cost = 12;}
	            System.out.print("Do you want photos?");
	            String photos = scanner.next();
	            if (photos.equals("yes")) {
	                cost += 3;}
	            System.out.println("The total bill is $" + cost);
	        }
	        scanner.close(); 
	}

}
