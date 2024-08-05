package com.aurionpro.test;

public class BmiCalculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double height = Double.parseDouble(args[0]);
	     double weight = Double.parseDouble(args[1]);
		
        // Calculate BMI
        double bmi = weight / (height * height);

        System.out.printf("Body Mass Index (BMI) is: %.2f\n", bmi);


	}

}
