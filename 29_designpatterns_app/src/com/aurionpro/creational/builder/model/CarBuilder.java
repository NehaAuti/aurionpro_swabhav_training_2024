package com.aurionpro.creational.builder.model;

public class CarBuilder {
    // Required parameters
    String engine;
    String wheels;

    // Optional parameters
    boolean hasGPS;
    boolean hasSunroof;
    boolean hasLeatherSeats;

    public CarBuilder(String engine, String wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public CarBuilder setGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
        return this;
    }

    public CarBuilder setSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
        return this;
    }

    public CarBuilder setLeatherSeats(boolean hasLeatherSeats) {
        this.hasLeatherSeats = hasLeatherSeats;
        return this;
    }

    public Car build() {
        return new Car(this);
    }
}