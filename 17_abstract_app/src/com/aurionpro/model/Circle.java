package com.aurionpro.model;

public class Circle extends Shape {
	private int radius;
	public void area() {
		System.out.println("Area of Circle is:"+(3.14*radius*radius));
		
	}
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

}
