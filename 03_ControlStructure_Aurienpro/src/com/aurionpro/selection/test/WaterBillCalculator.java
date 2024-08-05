package com.aurionpro.selection.test;
import java.util.Scanner;
public class WaterBillCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the no of units consumed: ");
	    int units = scanner.nextInt();
	    int meter_Charge= 75;
	    int charge = 0;
	    if(units<=100)
	    {
	    	charge = units*5;
	    	System.out.println("Unit Consumed Charge:"+charge);
	    }
	    else if(units<=250) 
	    {
	    	{   charge =+100*5;
	    		charge += ((units-100)*10);
	    		System.out.println("Unit Consumed Charge:"+charge);
	    	}
	    }	
	    else
	    	{ 
	    	charge =+100*5;
	    	charge =+150*10;
	    	charge =((units-250)*20);
	    	System.out.println("Unit Consumed Charge:"+charge);
	    	
	    	}
	   
	    int total_bill_charge = charge + meter_Charge;
	    System.out.println("Total Bill Charge:"+total_bill_charge);
	    scanner.close();  
	}

}
