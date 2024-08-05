package com.aurionpro.creational.factory.model;

public class CarFactory {
	
	public static ICar makeCar( Car carName)
	{
		ICar car = null;
		
		if(carName == Car.MARUTI)
			car = new Maruti();
		
		if(carName == Car.TATA)
			car = new Tata();
		
		if(carName == Car.MAHINDRA)
			car = new Mahindra();
		
		return car;
	}

}
