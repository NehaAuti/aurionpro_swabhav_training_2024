package com.aurionpro.model;

//import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AreaCalculatorTest {
     
	AreaCalculator calculator;
	@BeforeEach
	void init()
	{
		calculator = new AreaCalculator();
	}
	@Test
	void testCalculatorAreaOfCircle()
	{
		//fail("unimplemented");
	    assertEquals(78.5,calculator.calculateAreaOfCircle(5));
	}
	
	@Test
	void testCalculatorAreaOfRectangle()
	{
		 assertEquals(25,calculator.calculateAreaOfRectangle(5,5));
	}
	
	@Test
	void testCalculatorAreaOfTriangle()
	{
		assertEquals(12.5,calculator.calculateAreaOfTriangle(5,5));
		
	}
	
//	boolean isEven(int number)
//	{
//		
//	}
	
	
}
