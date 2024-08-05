package com.aurionpro.test;

public class ArithmeticOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=Integer.parseInt(args[0]);
		
		int number2=Integer.parseInt(args[1]);
		
		int add = number1 + number2;
	    int sub = number1 - number2;
	    int mul = number1 * number2;
	    int div = number1 / number2;
	    int mod = number1 % number2;
	        
	    System.out.println("Addition: " + add);
	    System.out.println("Subtraction: " + sub);
	    System.out.println("Multiplication: " + mul);
	    System.out.println("Division: " + div);
	    System.out.println("Modulo: " + mod);
         
	}

}
