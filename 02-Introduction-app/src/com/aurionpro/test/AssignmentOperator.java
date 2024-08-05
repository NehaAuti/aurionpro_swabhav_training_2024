package com.aurionpro.test;
import java.util.Scanner;
public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter the Value: ");
		        int value = scanner.nextInt();

		        System.out.print("Enter the value to use in assignment operations: ");
		        int operand = scanner.nextInt();

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
		        scanner.close();


	}

}
