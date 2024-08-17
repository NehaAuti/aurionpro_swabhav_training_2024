package com.aurionpro.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Computer computer = context.getBean(Computer.class);
		System.out.println(computer);
	}

}
