package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll; @BeforeAll - this is used for static reference 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {
	
	Operations operations;
    @BeforeEach
	void init() 
	{
	 operations = new Operations();
	}
	
	@AfterEach
	void status()
	{
		System.out.println("Test executed");
	}
	
	@Test
	void testAddition() {
		//fail("Not yet implemented");

     	assertEquals(10,operations.addition(5,5),"This function must do Addition");
//		int actual = operations.addition(5,5);
//		int expected = 10;
//		//function in Junit for test to check is expected and actual is same
//		assertEquals(expected,actual);
	}
	@Test
	void testSubtraction() {
		
     	assertEquals(10,operations.subtraction(20,10),"This function must do Subtraction");

}
	@Test
	void testMultiplication() {
	
     	assertEquals(200,operations.multiplication(20,10),"This function must do Multiplication");
     	assertEquals(6,operations.multiplication(2,3),"This function must do Multiplication");
     	assertEquals(6,operations.multiplication(3,2),"This function must do Multiplication");
}
	@Test
	void testDivision() {
	
     	assertEquals(2,operations.division(20,10),"This function must do Division");
        assertThrows(ArithmeticException.class, () -> operations.division(6,0));
}
	@Test
	void testIsEven()
	{
		assertTrue(operations.isEven(6));
		
		
	}

}