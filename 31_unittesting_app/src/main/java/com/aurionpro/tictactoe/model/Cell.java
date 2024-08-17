package com.aurionpro.tictactoe.model;

import com.aurionpro.tictactoe.model.CellAlreadyMarkedException;
import com.aurionpro.tictactoe.model.MarkType;

public class Cell {
    private MarkType mark;

    public Cell() {
        this.mark = MarkType.EMPTY;
    }

    public boolean isCellEmpty() {
        return this.mark == MarkType.EMPTY;
    }

    public MarkType getMark() {
        return mark;
    }

    public void setMark(MarkType mark) throws CellAlreadyMarkedException {
        if (!isCellEmpty()) {
            throw new CellAlreadyMarkedException("Cell is already marked");
        }
        this.mark = mark;
    }
}
