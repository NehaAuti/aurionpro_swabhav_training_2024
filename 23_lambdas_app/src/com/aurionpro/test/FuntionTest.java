package com.aurionpro.test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FuntionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Function<Integer , Integer> squareFunction = (Integer number)-> number*number;
        System.out.println("Square of No:"+squareFunction.apply(5));
	    
        BiFunction<Integer,Integer,Double> additionFunction = (Integer number1, Integer number2) ->(double)number1+number2;
        System.out.println("Addition of Two No:"+additionFunction.apply(10, 20));
	}

}
