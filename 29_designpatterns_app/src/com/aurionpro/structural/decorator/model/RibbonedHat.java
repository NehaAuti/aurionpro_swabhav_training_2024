package com.aurionpro.structural.decorator.model;

public class RibbonedHat extends HatDecorator {
    public RibbonedHat(IHat hat) {
        super(hat);
    }

    @Override
    public String getName() {
        return hat.getName() + " with Ribbon";
    }

    @Override
    public double getPrice() {
        return hat.getPrice() + 5.0;
    }

    @Override
    public String getDescription() {
        return hat.getDescription() + " Decorated with a ribbon.";
    }
}
