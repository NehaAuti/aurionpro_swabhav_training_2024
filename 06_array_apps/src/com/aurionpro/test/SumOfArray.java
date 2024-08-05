package com.aurionpro.test;
import java.util.Scanner;
public class SumOfArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				 int sum = 0;
			        Scanner scanner = new Scanner(System.in);
			        System.out.print("Enter size of the array:");
			        int size = scanner.nextInt();
			        int array[] = new int[size];
			        System.out.println("Enter array elements:");
			        for(int i = 0; i < size; i++)
			        {
			            array[i] = scanner.nextInt();
			            sum = sum + array[i];
			        }
			        System.out.println("Sum of the array is:"+sum);
					//return size;
			        scanner.close();
	}

}
