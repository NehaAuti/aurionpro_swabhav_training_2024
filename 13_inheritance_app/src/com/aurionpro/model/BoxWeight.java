package com.aurionpro.model;

public class BoxWeight extends Box {
	
	private int weight;
	
	public BoxWeight(int weigth,int width, int height, int depth )
	{
		super(width,depth,height); 
		this.weight=weight;
	}

	@Override
	public String toString() {
	return "BoxWeight [weight=" + weight + 
	           ", width=" + getWidth() + 
	           ", height=" + getHeight() + 
	           ", depth=" + getDepth() + "]";
	}
	

	

}
