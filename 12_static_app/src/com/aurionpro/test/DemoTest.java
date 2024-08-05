package com.aurionpro.test;

import com.aurionpro.model.Demo;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("For Demo1:");
		Demo demo1 = new Demo();
		System.out.println("For Demo1:");
		demo1.display();
		demo1.increment();
		demo1.display();
		
		System.out.println("For Demo2:");
		Demo demo2 = new Demo();
		demo2.display();
		demo2.increment();
		demo2.display();
		
		System.out.println("For Demo3:");
		Demo demo3 = new Demo();
		demo3.display();
		demo3.increment();
		demo3.display();
		
	}
	
	static {
		System.out.println("Magiccccccc2");
	}
	
	

}
