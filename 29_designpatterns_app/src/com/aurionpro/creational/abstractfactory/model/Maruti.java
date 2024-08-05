package com.aurionpro.creational.abstractfactory.model;

import com.aurionpro.creational.abstractfactory.model.ICar;

public class Maruti implements ICar {

    @Override
    public void start() {
        System.out.println("Maruti car starting.");
    }

    @Override
    public void stop() {
        System.out.println("Maruti car stopping.");
    }
}