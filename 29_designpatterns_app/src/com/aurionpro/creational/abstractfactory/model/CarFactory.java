package com.aurionpro.creational.abstractfactory.model;

public class CarFactory {
	public static IFactory getFactory(CarType carType) {
        switch (carType) {
            case MARUTI:
                return new MarutiFactory();
            case TATA:
                return new TataFactory();
            case MAHINDRA:
                return new MahindraFactory();
            default:
                throw new IllegalArgumentException("Invalid CarType: " + carType);
        }
    }

}
