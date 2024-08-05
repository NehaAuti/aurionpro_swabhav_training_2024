package com.aurionpro.creational.abstractfactory.test;

import com.aurionpro.creational.abstractfactory.model.ICar;
import com.aurionpro.creational.abstractfactory.model.IFactory;

import com.aurionpro.creational.abstractfactory.model.MahindraFactory;
import com.aurionpro.creational.abstractfactory.model.MarutiFactory;
import com.aurionpro.creational.abstractfactory.model.TataFactory;

public class CarTest {

	public static void main(String[] args) {
		IFactory marutiFactory= new MarutiFactory();
		ICar maruti = marutiFactory.makeCar();
		maruti.start();
		maruti.stop();
		IFactory tataFactory = new TataFactory();
		ICar tata = tataFactory.makeCar();
		tata.start();
		tata.stop();
		IFactory mahindraFactory= new MahindraFactory();
		ICar mahindra = mahindraFactory.makeCar();
		mahindra.start();
		mahindra.stop();

//        IFactory marutiFactory = CarFactory.getFactory(CarType.MARUTI);
//        ICar marutiCar = marutiFactory.makeCar(null);
//        System.out.println("Testing Maruti:");
//        marutiCar.start();
//        marutiCar.stop();
//        
//        
//        IFactory tataFactory = CarFactory.getFactory(CarType.TATA);
//        ICar tataCar = tataFactory.makeCar(null);
//        System.out.println("\nTesting Tata:");
//        tataCar.start();
//        tataCar.stop();
//
//       
//        IFactory mahindraFactory = CarFactory.getFactory(CarType.MAHINDRA);
//        ICar mahindraCar = mahindraFactory.makeCar(null);
//        System.out.println("\nTesting Mahindra:");
//        mahindraCar.start();
//        mahindraCar.stop();
    }
}