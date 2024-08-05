package com.aurionpro.model;

public class AreaCalculator {

	double calculateAreaOfCircle(int radius)
	{
		return 3.14*radius*radius;
	}
	
	double calculateAreaOfRectangle(int length,int breadth)
	{
		return length * breadth;
	}
	
	double calculateAreaOfTriangle(int base,int height)
	{
		return 0.50*height*base;
	}
	
	
}
