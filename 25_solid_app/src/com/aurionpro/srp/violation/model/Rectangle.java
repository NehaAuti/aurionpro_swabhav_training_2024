package com.aurionpro.srp.violation.model;

public class Rectangle implements Shape {
	private int width;
	private int height;
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public int getArea()
	{
		return width*height;
	}
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle is:"+(width*height));	
	}

}
