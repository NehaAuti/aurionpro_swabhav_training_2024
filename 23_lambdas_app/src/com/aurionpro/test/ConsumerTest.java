package com.aurionpro.test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> consumer = (Integer number) ->System.out.println("Square of Number :"+number*number);
	    consumer.accept(5);
	    
	    Consumer<Integer> factorialConsumer = (Integer number) ->{
	    	Integer result = 1;
	    	for(int i=2; i<number ;i++) {
	    		result *= i; }
	    	
	    System.out.println("Factorial is :"+result);
	    };
	factorialConsumer.accept(5);
	
	BiConsumer<Integer , Integer> additionConsumer =(Integer number1,Integer number2) ->{
		System.out.println("Addition of Two Numbers:"+(number1+number2));
		
	};
	
	additionConsumer.accept(10,20);
	
	}	
}
