package com.aurionpro.test;

public class RelationalOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int number1=Integer.parseInt(args[0]);
		
		int number2=Integer.parseInt(args[1]);

        System.out.println("Equal to : " + (number1 > number2));
        System.out.println("Not Equal to: " + (number1 < number2));
        System.out.println("less than: " + (number1 >= number2));
        System.out.println("less than or equal to: " + (number1 <= number2));
        System.out.println("Greater than: " + (number1 == number2));
        System.out.println("Greater than or equal to: " + (number1 != number2));

	}

}
