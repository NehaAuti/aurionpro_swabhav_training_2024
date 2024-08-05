package com.aurionpro.structural.decorator.model;

public class PremiumHat implements IHat {
    @Override
    public String getName() {
        return "Premium Hat";
    }

    @Override
    public double getPrice() {
        return 25.0;
    }

    @Override
    public String getDescription() {
        return "A high-quality premium hat.";
    }
}
