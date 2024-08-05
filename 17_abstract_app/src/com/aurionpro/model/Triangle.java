package com.aurionpro.model;

public class Triangle extends Shape {
	private int base;
	private int height;
	public void area() {
		System.out.println("Area of triangle is:"+(0.5*base*height));
		
	}
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	

}
