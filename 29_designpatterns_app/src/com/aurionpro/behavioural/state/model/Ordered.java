package com.aurionpro.behavioural.state.model;

public class Ordered implements IPacketState {
    @Override
    public void next(Packet packet) {
        packet.setState(new Shipped());
    }

    @Override
    public void current(Packet packet) {
        System.out.println("Packet is in Ordered state.");
    }

    @Override
    public void previous(Packet packet) {
        System.out.println("Packet is in the initial state.");
    }
}