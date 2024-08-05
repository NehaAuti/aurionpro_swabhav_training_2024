package com.aurionpro.test;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = scanner.nextInt();
		int array[]= new int[size];
		System.out.println("Enter Array Elements:");
		for(int i =0;i<size;i++)
			array[i]=scanner.nextInt();
		System.out.println("Array is:");
		for(int i =0;i<size;i++)
			System.out.println(array[i] +"\t");
		scanner.close();
		

	}

}
