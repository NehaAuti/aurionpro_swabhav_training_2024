package com.aurionpro.model;

public class Rectangle extends Shape {
	private int length;
	private int breadth;
	public void area() {
		System.out.println("Area of Rectangle is:"+(length*breadth));
		
	}
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	

}
