package com.aurionpro.dip.violation.test;

import com.aurionpro.dip.violation.model.TaxCalculator1;

public class TextCalculatorTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalculator1 t1=new TaxCalculator1();
		t1.calculateTax(12000, 0);
		   
		TaxCalculator1 t2=new TaxCalculator1();
		t1.calculateTax(12000, 20);

	}

}
