package com.aurionpro.tictactoe.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.aurionpro.tictactoe.model.Cell;
import com.aurionpro.tictactoe.model.CellAlreadyMarkedException;
import com.aurionpro.tictactoe.model.MarkType;

public class CellTest {
    private Cell cell;

    @BeforeEach
    public void setUp() {
        cell = new Cell();
    }

    @Test
    public void testCreatedCellsEmpty() {
        assertTrue(cell.isCellEmpty(), "testCreatedCellsEmpty: Cell should be initially empty");
        System.out.println("testCreatedCellsEmpty: Cell is initially empty");
    }

    @Test
    public void testSetMark_checkIfCanMarkX() {
        try {
            cell.setMark(MarkType.X);
            assertEquals(MarkType.X, cell.getMark(), "testSetMark_checkIfCanMarkX: Mark should be X");
            System.out.println("testSetMark_checkIfCanMarkX: Successfully set mark to X");
        } catch (CellAlreadyMarkedException e) {
            fail("Exception should not have been thrown");
        }
    }

    @Test
    public void testSetMark_checkIfCanMarkO() {
        try {
            cell.setMark(MarkType.O);
            assertEquals(MarkType.O, cell.getMark(), "testSetMark_checkIfCanMarkO: Mark should be O");
            System.out.println("testSetMark_checkIfCanMarkO: Successfully set mark to O");
        } catch (CellAlreadyMarkedException e) {
            fail("Exception should not have been thrown");
        }
    }

    @Test
    public void testSetMark_throwsCellAlreadyMarkedExceptionWhenMarkedTwice() {
        try {
            cell.setMark(MarkType.X);
            cell.setMark(MarkType.O);
            fail("Exception should have been thrown");
        } catch (CellAlreadyMarkedException e) {
            System.out.println("testSetMark_throwsCellAlreadyMarkedExceptionWhenMarkedTwice: CellAlreadyMarkedException was thrown as expected");
        }
    }
}
