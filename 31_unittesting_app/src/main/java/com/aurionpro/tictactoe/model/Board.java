package com.aurionpro.tictactoe.model;


public class Board {
    private Cell[] cells = new Cell[9];

    public Board() {
        for (int i = 0; i < cells.length; i++) {
            cells[i] = new Cell();
        }
    }

    public boolean placeMark(int row, int col, MarkType mark) {
        int index = row * 3 + col; // Convert 2D index to 1D
        if (index < 0 || index >= cells.length || !cells[index].isCellEmpty()) {
            return false; // Out of bounds or cell already marked
        }
        try {
            cells[index].setMark(mark);
        } catch (CellAlreadyMarkedException e) {
            return false;
        }
        return true;
    }

    public boolean checkWin(MarkType mark) {
        return (checkRows(mark) || checkColumns(mark) || checkDiagonals(mark));
    }

    private boolean checkRows(MarkType mark) {
        for (int i = 0; i < 3; i++) {
            if (cells[i * 3].getMark() == mark &&
                cells[i * 3 + 1].getMark() == mark &&
                cells[i * 3 + 2].getMark() == mark) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumns(MarkType mark) {
        for (int i = 0; i < 3; i++) {
            if (cells[i].getMark() == mark &&
                cells[i + 3].getMark() == mark &&
                cells[i + 6].getMark() == mark) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals(MarkType mark) {
        return (cells[0].getMark() == mark &&
                cells[4].getMark() == mark &&
                cells[8].getMark() == mark) ||
               (cells[2].getMark() == mark &&
                cells[4].getMark() == mark &&
                cells[6].getMark() == mark);
    }

    public boolean isFull() {
        for (Cell cell : cells) {
            if (cell.getMark() == MarkType.EMPTY) {
                return false;
            }
        }
        return true;
    }

    public Cell[] getCells() {
        return cells;
    }

    public void setCellMark(int loc, MarkType mark) throws CellAlreadyMarkedException {
        cells[loc].setMark(mark);
    }
}

//public class Board {
//    private Cell[] cells = new Cell[9];
//
//    public Board() {
//        for (int i = 0; i < cells.length; i++) {
//            cells[i] = new Cell();
//        }
//    }
//
//    public boolean isBoardFull() {
//        for (Cell cell : cells) {
//            if (cell.getMark() == MarkType.EMPTY) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public Cell[] getCells() {
//        return cells;
//    }
//
//    public void setCellMark(int loc, MarkType mark) throws CellAlreadyMarkedException {
//        cells[loc].setMark(mark);
//    }
//}
