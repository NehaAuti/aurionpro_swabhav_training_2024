package com.aurionpro.test;

import com.aurionpro.model.IAddition;

public class AdditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        IAddition adder = (int number1,int number2)-> number1+number2;
 
        System.out.println(adder.addition(10,20));
  
	 }
}