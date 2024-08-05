package com.aurionpro.test;

import com.aurionpro.model.Base;
import com.aurionpro.model.Derived;
import com.aurionpro.model.Derived2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = new Base();
     	base.display();
     	
	    base = new Derived();
	    base.display();
	    
		base = new Derived2();
		base.display();
		
	}

}
