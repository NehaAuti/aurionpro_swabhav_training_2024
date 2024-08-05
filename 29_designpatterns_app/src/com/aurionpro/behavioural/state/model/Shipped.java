package com.aurionpro.behavioural.state.model;

public class Shipped implements IPacketState {
    @Override
    public void next(Packet packet) {
        packet.setState(new Received());
    }

    @Override
    public void current(Packet packet) {
        System.out.println("Packet is in Shipped state.");
    }

    @Override
    public void previous(Packet packet) {
        packet.setState(new Ordered());
    }
}
