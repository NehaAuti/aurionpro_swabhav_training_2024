package com.aurienpro.test;

import java.util.Scanner;

import com.aurienpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		//System.out.println(rectangle);
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the length:");
	    int l=scanner.nextInt();
	    System.out.println("Enter the breadth:");
	    int b=scanner.nextInt();
		Rectangle rectangle = new Rectangle();
			//System.out.println(rectangle);
			
			rectangle.initialize(l,b);
			rectangle.display();
			rectangle.calculateBoxArea();
			rectangle.displayresult();			
		}


	}


