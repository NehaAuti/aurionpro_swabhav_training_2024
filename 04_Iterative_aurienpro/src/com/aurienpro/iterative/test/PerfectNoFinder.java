package com.aurienpro.iterative.test;

import java.util.Scanner;

public class PerfectNoFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The No: ");
        int number = scanner.nextInt();
        int i =1,sum=0;
        
        while(i<=(number/2))
        {
        	if(number%i==0)
        		sum =sum+i;
        	i++;
        }
        if(sum==number)
        {
        	System.out.println("Perfect No");
        }
        else
        	System.out.println("Not a perfect No");
        scanner.close();

	}

}
