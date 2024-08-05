package com.aurionpro.behavioural.command.model;

public interface Command {
    void execute();
    void undo();
}
