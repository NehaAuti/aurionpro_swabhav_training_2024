package com.aurionpro.test;

public class LogicalOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean firstValue = Boolean.parseBoolean(args[0]);
        boolean secondValue = Boolean.parseBoolean(args[1]);

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


	}

}
