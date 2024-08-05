package com.aurionpro.test;

public class Test {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		try
		{
		int number1=Integer.parseInt(args[0]);
		int number2=Integer.parseInt(args[1]);
		
		double result = number1/number2;
		
		System.out.println("Division is: "+result);
		}
		catch(ArithmeticException exception)
		{
			System.out.println("Invalid input for number2. Number2 can not be 0");
		}
		
		catch(ArrayIndexOutOfBoundsException exception)
		{
			System.out.println("Division requires two arguments. Please Enter two values. ");
		}
		catch(NumberFormatException exception)
		{
			System.out.println(" Division can not be performed other than numbers. Please enter the number values.");
		}
		catch (Exception exception) 
		{
			System.out.println("Exception Occured");
		}
		finally 
		{
			System.out.println("Inside Finally");
		}
		
		//FileInputStream stream = new FileInputStream("abc.txt");
		
		
		System.out.println("Exiting");

	}

}
