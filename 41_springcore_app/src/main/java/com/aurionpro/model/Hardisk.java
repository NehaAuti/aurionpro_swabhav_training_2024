package com.aurionpro.model;

public class Hardisk {

	private int capacity;
      
	public Hardisk()
	{
		System.out.println("Inside Harddisk default constructor");
	}
	public Hardisk(int capacity) {
		super();
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
		System.out.println("Inside Capacity");
	}

	@Override
	public String toString() {
		return "Hardware [capacity=" + capacity + "]";
	}
	
	
}


