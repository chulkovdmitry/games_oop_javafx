package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    public void whenPositionEqualInitPosition() {
        BishopBlack bishop = new BishopBlack(Cell.C8);
        assertThat(bishop.position(), is(Cell.C8));
    }

    @Test
    public void whenCopyEqualActualPosition() {
        Cell next = Cell.E7;
        BishopBlack bishop = new BishopBlack(Cell.F8);
        assertThat(bishop.copy(next).position(), is(next));
    }

    @Test
    public void way() throws ImpossibleMoveException {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell[] way = bishop.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(way, is(expected));
    }

    @Test
    public void whenIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        assertThat(bishopBlack.isDiagonal(Cell.C8, Cell.A6), is(true));
    }

    @Test
    public void whenIsNotDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        assertThat(bishopBlack.isDiagonal(Cell.C8, Cell.C6), is(false));
    }

}
