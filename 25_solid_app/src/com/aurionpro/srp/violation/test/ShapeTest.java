package com.aurionpro.srp.violation.test;
//OCP Solution
import com.aurionpro.srp.violation.model.Circle;
import com.aurionpro.srp.violation.model.Rectangle;
import com.aurionpro.srp.violation.model.Shape;
import com.aurionpro.srp.violation.model.Triangle;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape;
		shape = new Circle(25);
		shape.area();
		
		
		shape = new Rectangle(10,20);
		shape.area();
		
		shape = new Triangle(5,10);
		shape.area();

	}

}
