package com.aurionpro.creational.builder.model;

public class Car {
    // Required parameters
    private final String engine;
    private final String wheels;

    // Optional parameters
    private final boolean hasGPS;
    private final boolean hasSunroof;
    private final boolean hasLeatherSeats;

    Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.hasGPS = builder.hasGPS;
        this.hasSunroof = builder.hasSunroof;
        this.hasLeatherSeats = builder.hasLeatherSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels='" + wheels + '\'' +
                ", hasGPS=" + hasGPS +
                ", hasSunroof=" + hasSunroof +
                ", hasLeatherSeats=" + hasLeatherSeats +
                '}';
    }
}