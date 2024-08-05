package com.aurionpro.test;

import com.aurionpro.model.ITest;
import com.aurionpro.model.Reference;

public class ReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITest test = Reference::new;  //Constructor
		method(test);
		
		ITest test1 = Reference::staticPrint;  //static method
        method(test1);
        
        Reference reference = new Reference(); //non static method
        ITest test2=reference::print;
        method(test2);
        
        
	}
	private static void method(ITest test)
	{
		test.display();
	    	
	}

}
