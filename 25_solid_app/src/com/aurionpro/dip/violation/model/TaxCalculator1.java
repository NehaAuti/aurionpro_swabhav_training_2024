package com.aurionpro.dip.violation.model;

import java.util.logging.Logger;

public class TaxCalculator1 {
	 Logger logger;
	 public int calculateTax(int amount,int rate){
	    int tax=0;
	    try {
	    tax=amount/rate;
	    System.out.println(tax);
	    }
	    catch(Exception exception) {
	     new DBLogger().log("Divide by zero");
	     new FileLogger().log("Divide by zero");
	     // new NetworkLogger().log("divide by zero");
	    }
	    return tax;
	      
	   }


}
