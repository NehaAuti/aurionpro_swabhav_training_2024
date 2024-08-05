package com.aurionpro.test;

import com.aurionpro.model.Isayable;
//import com.aurionpro.model.SayableImpl;

public class SayableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Using Middle class
		
//         Isayable sayable = new SayableImpl();
//         sayable.say();
		
		// Without middel class 
		
//         Isayable sayable = new Isayable(){
//
//			@Override
//			public void say() {
//			System.out.println("I am inside Sayable");
//			}   	 
//         };
//         sayable.say();
		
		
		
		// Lambada Expression
		Isayable sayable = () -> System.out.println("I am inside Sayable");
		sayHello(sayable);
		// sayable.say();
         
	}
	
	private static void sayHello(Isayable sayable)
	{
		 sayable.say();
	}

}
