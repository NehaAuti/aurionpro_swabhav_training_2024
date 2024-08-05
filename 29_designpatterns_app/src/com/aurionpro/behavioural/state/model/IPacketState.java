package com.aurionpro.behavioural.state.model;

public interface IPacketState {
    void next(Packet packet);
    void current(Packet packet);
    void previous(Packet packet);
}
