package com.aurionpro.creational.abstractfactory.model;

public class MarutiFactory implements IFactory {

    @Override
    public ICar makeCar() {
        return new Maruti(); // This is correct; Maruti implements ICar
    }
}