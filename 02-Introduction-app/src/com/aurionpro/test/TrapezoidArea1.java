package com.aurionpro.test;

public class TrapezoidArea1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    double base1 = Double.parseDouble(args[0]);
	        double base2 = Double.parseDouble(args[1]);
	        double height = Double.parseDouble(args[2]);

	        // Calculate the area of the trapezoid
	        double area = (base1 + base2) * height / 2.0;

	        // Display the calculated area
	        System.out.println("The area of the trapezoid is: " + area);

	}

}
