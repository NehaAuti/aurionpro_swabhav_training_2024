package com.aurienpro.test;

import java.util.Scanner;

import com.aurienpro.model.Box;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		
		 System.out.println(box);
		 System.out.println("height:"+box.getHeight());
		 System.out.println("width:"+box.getWidth());
		 System.out.println("depth:"+box.getDepth());
		
		
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the height:");
	    int height=scanner.nextInt();
	    
	    
	    System.out.println("Enter the width:");
	    int width=scanner.nextInt();
	
	    
	    System.out.println("Enter the depth:");
	    int depth=scanner.nextInt();
	   
	    System.out.println("height:"+box.getHeight());
	    System.out.println("width:"+box.getWidth());
	    System.out.println("depth:"+box.getDepth());
	    
	
		
		Box box2 = new Box(height,width,depth);  //parameterized
		System.out.println(box2);
		
	    
	    System.out.println("height:"+box2.getHeight());
	    System.out.println("width:"+box2.getWidth());
	    System.out.println("depth:"+box2.getDepth());
	    
	  
	    
		
		
	}

}
