package com.aurionpro.test;

import com.aurionpro.model.Circle;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Shape;
import com.aurionpro.model.Triangle;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape;
		shape = new Circle(25);
		shape.area();
		shape.volume();
		
		shape = new Rectangle(10,20);
		shape.area();
		
		shape = new Triangle(5,10);
		shape.area();
		
		

	}

}
