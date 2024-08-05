package com.aurionpro.test;

public class UnaryOperator2 {
	public static void main(String[] args) {
        
		int number1=Integer.parseInt(args[0]);
		
		int number2=Integer.parseInt(args[1]);
		
		System.out.println("Postincrement : " + (number1++));
		System.out.println("Preincrement : " + (++number2));
		
		System.out.println("Postdecrement : " + (number1--));
		System.out.println("Predecrement : " + (--number2));
	     
      }
   }
