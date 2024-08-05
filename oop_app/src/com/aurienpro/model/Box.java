package com.aurienpro.model;

public class Box {
	
	public int height;
	public int width;
	public int depth;
	public int result;
	
	public Box()
	{
		this.height = 10;
		this.width = 20;
		this.depth=30;
	}
	public Box(int height,int width,int depth) // Parametrized Constructor
	{
		this.height = height;
		this.width = width;
		this.depth= depth;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}
	
	public int getHeight()
	{
		return this.height;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public int getWidth()
	{
		return width;
	}

	public void setDepth(int depth)
	{
		this.depth = depth;	
	}
	
	public int getDepth()
	{
		return this.depth;
	}

	
	//public void display()
	//{
		//System.out.println("Height:"+height);
		//System.out.println("Width:"+width);
		//System.out.println("Depth:"+depth);
//	}
	
	//public void result()
	//{
		//result = height*width*depth;
		//System.out.println("Area:"+result);
	//}
	
	
}

