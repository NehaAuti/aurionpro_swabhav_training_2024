package com.aurienpro.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Two No: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result=addition(number1,number2);
        System.out.print("\nAddition: "+result);
        result=subtraction(number1,number2);
        System.out.print("\nSubtraction: "+result);
        result=multiplication(number1,number2);
        System.out.print("\nMultiplication: "+result);
        result=division(number1,number2);
        System.out.print("\nDivision: "+result);
        scanner.close();
	}
	
	private static int addition(int number1,int number2)
	{
		return number1+number2;
	}
    private static int subtraction(int number1,int number2)
	
	{
		return number1-number2;
	}
    private static int multiplication(int number1,int number2)
	
	{
		return number1*number2;
	}
    private static int division(int number1,int number2)
	
	{
		return number1/number2;
	}


}
