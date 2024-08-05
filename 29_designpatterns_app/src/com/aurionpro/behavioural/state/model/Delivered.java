package com.aurionpro.behavioural.state.model;

public class Delivered implements IPacketState {
    @Override
    public void next(Packet packet) {
        System.out.println("Packet is already in the Delivered state.");
    }

    @Override
    public void current(Packet packet) {
        System.out.println("Packet is in Delivered state.");
    }

    @Override
    public void previous(Packet packet) {
        packet.setState(new Received());
        //System.out.println("Packet Moved to Received state");
    }
}
