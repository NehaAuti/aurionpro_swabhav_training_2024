package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.Car;
import com.aurionpro.creational.factory.model.CarFactory;
import com.aurionpro.creational.factory.model.ICar;
//import com.aurionpro.creational.factory.model.Mahindra;
//import com.aurionpro.creational.factory.model.Maruti;
//import com.aurionpro.creational.factory.model.Tata;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICar car;
		car = CarFactory.makeCar(Car.MARUTI);
		car.start();
		car.stop();
		
		car = CarFactory.makeCar(Car.TATA);
		car.start();
		car.stop();
		
		car = CarFactory.makeCar(Car.MAHINDRA);
		car.start();
		car.stop();
		
//		car = new Maruti();
//	    car.start();
//        car.stop();
		
		
//		System.out.println("Maruti Car:");
//		Maruti maruti = new Maruti();
//		maruti.start();
//		maruti.stop();
//		
//		System.out.println("Tata Car:");
//		Tata tata = new Tata();
//		tata.start();
//		tata.stop();
//		
//		System.out.println("Mahendra Car:");
//		Mahindra mahindra = new Mahindra();
//		mahindra.start();
//		mahindra.stop();

	}

}
