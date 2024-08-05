package com.aurionpro.dip.violation.test;

import com.aurionpro.dip.violation.model.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalculator t1 = new TaxCalculator();
        t1.CalculateTax(100, 10);
        
        TaxCalculator t2 = new TaxCalculator();
        t2.CalculateTax(2000, 0);
        
       
	}

}
