package com.aurienpro.model;

public class Box1 {
		
		public int height;
		public int width;
		public int depth;
		public int result;
		
		public Box1()
		{
			width = 10;
			depth=10;
			height = 10;
		}
		public void display()
		{
			System.out.println("Height:"+height);
			System.out.println("Width:"+width);
			System.out.println("Depth:"+depth);
		}
		

}
