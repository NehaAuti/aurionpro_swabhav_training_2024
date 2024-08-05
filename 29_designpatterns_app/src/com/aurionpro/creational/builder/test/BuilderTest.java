package com.aurionpro.creational.builder.test;


import com.aurionpro.creational.builder.model.Car;
import com.aurionpro.creational.builder.model.CarBuilder;

public class BuilderTest {
    public static void main(String[] args) {
        Car car = new CarBuilder("V8", "Alloy")
                .setGPS(true)
                .setSunroof(true)
                .setLeatherSeats(true)
                .build();

        System.out.println(car);

        Car basicCar = new CarBuilder("V6", "Steel")
                .build();

        System.out.println(basicCar);
    }
}
