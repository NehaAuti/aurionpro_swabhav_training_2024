package com.aurionpro.structural.facade.model;

public class Projector implements OnDevice {
    @Override
    public void on() {
        System.out.println("Projector is on.");
    }
}
