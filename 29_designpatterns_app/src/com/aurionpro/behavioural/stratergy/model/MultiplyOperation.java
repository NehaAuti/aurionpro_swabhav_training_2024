package com.aurionpro.behavioural.stratergy.model;

public class MultiplyOperation implements IOperation {
    @Override
    public int doOperation(int a, int b) {
    	  // TODO Auto-generated method stub
    	  int multiply = a*b;
    	  System.out.println(multiply);
    	  return multiply;
    	 }
    	 

    	}