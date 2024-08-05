package com.aurionpro.test;

public class AssignmentOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        
	        int value=Integer.parseInt(args[0]);
			
			int operand=Integer.parseInt(args[1]);
			

	        System.out.println("Value: " + value);

	        // the assignment operator '='
	        value = operand;
	        System.out.println("After '=' operator: " + value);

	        // the addition assignment operator '+='
	        value += operand;
	        System.out.println("After '+=' operator: " + value);

	        // the subtraction assignment operator '-='
	        value -= operand;
	        System.out.println("After '-=' operator: " + value);

	        // the multiplication assignment operator '*='
	        value *= operand;
	        System.out.println("After '*=' operator: " + value);

	        // the division assignment operator '/='
	        if (operand != 0) {
	            value /= operand;
	            System.out.println("After '/=' operator: " + value);
	        } else {
	            System.out.println("Cannot perform '/=' operation: division by zero.");
	        }

	        // the modulus assignment operator '%='
	        if (operand != 0) {
	            value %= operand;
	            System.out.println("After '%=' operator: " + value);
	        } else {
	            System.out.println("Cannot perform '%=' operation: division by zero.");
	        }

	}

}
