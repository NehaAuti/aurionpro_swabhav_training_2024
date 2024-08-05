package com.aurionpro.test;

import com.aurionpro.model.IFactorial;

public class FactorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        IFactorial factor = (number1) ->  {
        	int fact = 1;
        	for (int i = 2; i <= number1; i++) 
        		fact = fact * i;
        	return fact;
        	 };
        System.out.println(factor.factorial(5));
	}

}
