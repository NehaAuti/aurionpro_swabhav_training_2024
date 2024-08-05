package com.aurionpro.test;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first boolean value (true/false): ");
        boolean firstValue = scanner.nextBoolean();

        System.out.print("Enter the second boolean value (true/false): ");
        boolean secondValue = scanner.nextBoolean();

        System.out.println("First value: " + firstValue);
        System.out.println("Second value: " + secondValue);

        boolean andResult = firstValue && secondValue;
        System.out.println("Result of '&&' operator: " + andResult);

        boolean orResult = firstValue || secondValue;
        System.out.println("Result of '||' operator: " + orResult);
        
        boolean notFirstValue = !firstValue;
        boolean notSecondValue = !secondValue;
        System.out.println("Result of '!' operator on first value: " + notFirstValue);
        System.out.println("Result of '!' operator on second value: " + notSecondValue);

        scanner.close();

	}

}
