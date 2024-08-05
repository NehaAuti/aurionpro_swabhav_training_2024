package com.aurionpro.behavioural.state.model;

public class Packet {
    private IPacketState state;

    public Packet() {
        this.state = new Ordered();
    }

    public IPacketState getState() {
        return state;
    }

    public void setState(IPacketState state) {
        this.state = state;
    }

    public void goToNextState() {
        state.next(this);
    }

    public void goToPreviousState() {
        state.previous(this);
    }

    public void printCurrentStatus() {
        state.current(this);
    }
}
