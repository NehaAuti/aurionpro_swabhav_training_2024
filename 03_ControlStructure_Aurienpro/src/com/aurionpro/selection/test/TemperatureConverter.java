package com.aurionpro.selection.test;
import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        
        int choice = scanner.nextInt();
        double ft = 0.0, ct = 0.0, kt=0.0;
		switch(choice)
        {
        case 1:
        	System.out.println("Enter the temperature in Celsius:");
        	ct = 9.0 /5.0 * ct + 32;
        	System.out.println("Temperature in Fahrenheit:"+ct);
        	break;
        case 2:
        	System.out.println("Enter the temperature in Fahrenheit:");
        	ft = (ct*9/5)+32;
        	System.out.println("Temperature in Celsius:"+ft);
        	break;
        case 3:
        	System.out.println("Enter the temperature in Celsius:");
        	ct = ct+273.15;
        	System.out.println("Temperature in Kelvin:"+kt);
        	break;
        case 4:
        	System.out.println("Enter the temperature in Kelvin:");
        	kt = 9.0 /5.0 * ct + 32;
        	System.out.println("Temperature in Celsius:"+ct);
        	break;
        case 5:
        	System.out.println("Enter the temperature in Fahrenheit:");
        	ft = ct+273.15;
        	System.out.println("Temperature in Kelvin:"+kt);
        	break;
        case 6:
        	System.out.println("Enter the temperature in Kelvin:");
        	kt = 9.0 /5.0 * ct + 32;
        	System.out.println("Temperature in Fahrenheit:"+ct);
        	break;
        default: System.out.println("Invalid Choice");
	    }
	    scanner.close();
        	
        }

	}
