package com.aurionpro.tictactoe.model;

import com.aurionpro.tictactoe.model.MarkType;

public class Player {
    private String playerName;
    private MarkType mark;

    public Player(String playerName, MarkType mark) {
        this.playerName = playerName;
        this.mark = mark;
    }

    public String getPlayerName() {
        return playerName;
    }

    public MarkType getMark() {
        return mark;
    }
}
