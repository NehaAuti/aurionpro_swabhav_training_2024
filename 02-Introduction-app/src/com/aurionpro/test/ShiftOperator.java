package com.aurionpro.test;
import java.util.Scanner;
public class ShiftOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the value: ");
	        int a = scanner.nextInt();
	        
	        System.out.println("Left Shift Operator : " + (a << 1));
	        
	        System.out.println("Right Shift Operator : " + (a >> 1));


	}

}
