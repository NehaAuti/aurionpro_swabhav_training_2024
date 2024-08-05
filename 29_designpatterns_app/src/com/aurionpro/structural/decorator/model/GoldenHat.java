package com.aurionpro.structural.decorator.model;

public class GoldenHat extends HatDecorator {
    public GoldenHat(IHat hat) {
        super(hat);
    }

    @Override
    public String getName() {
        return hat.getName() + " with Gold";
    }

    @Override
    public double getPrice() {
        return hat.getPrice() + 15.0;
    }

    @Override
    public String getDescription() {
        return hat.getDescription() + " Decorated with gold.";
    }
}
