package com.aurionpro.structural.decorator.model;

public abstract class CarServiceDecorator implements ICarService {
    protected ICarService carService;

    public CarServiceDecorator(ICarService carService) {
        this.carService = carService;
    }

    @Override
    public double getCost() {
        return carService.getCost();
    }
}