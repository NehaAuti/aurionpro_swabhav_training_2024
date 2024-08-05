package com.aurionpro.model;
import java.util.Scanner;

public class Calculator {
	 public static void main(String[] args)
	 { 
		 
		 Scanner scanner=new Scanner(System.in);
		 
	        System.out.print("Enter the First Number: ");
	        int firstNumber = scanner.nextInt();
	        System.out.print("Enter the Second Number: ");
	        int secondNumber = scanner.nextInt();
	 
	        System.out.print("Enter the type of operation(+, -, *, /): ");
	        String operation = scanner.next();
	        int result = performOperation(firstNumber, secondNumber, operation);
	        System.out.println("Answer: " + result);
	    }
	 
	    public static int performOperation(int firstNumber, int secondNumber, String operation)
	    {
	        int result = 0;
	        switch (operation) {
	            case "+":
	                result = firstNumber + secondNumber;
	                break;
	            case "-":
	                result = firstNumber - secondNumber;
	                break;
	            case "*":
	                result = firstNumber * secondNumber;
	                break;
	            case "/":
	                result = firstNumber / secondNumber;
	                break;
	            default:
	                System.out.println("Invalid operation");
	                break;
	        }
	        return result;
	}
	
}
