package com.aurionpro.test;
import java.util.Scanner;
public class ArrayMatrix {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
    System.out.println("Enter how many rows:");
    int rows=scanner.nextInt();
    System.out.println("Enter how many columns:");
    int columns=scanner.nextInt();
 
    int matrix[][]=new int[rows][columns];
    System.out.println("Enter array elements:");
    
    for(int i=0;i<rows;i++)
    {
    	for(int j=0;i<columns;j++)
    	{
    		matrix[i][j]=scanner.nextInt();
    	}  
	}
    System.out.println("Matrix is:");
    
    for(int i=0;i<rows;i++)
    {
    	for(int j=0;i<columns;j++)
    	{
    	    System.out.print(matrix[i][j]+"\t");
    	}
        System.out.println("");
	}
    scanner.close();  
   }
}
