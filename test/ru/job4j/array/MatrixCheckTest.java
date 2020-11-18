package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.array.MatrixCheck.*;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = monoHorizontal(input, 1);
        assertThat(result, is(true));
    }

    @Test
    public void whenHorizNot() {
        char[][] check = {
                {'X', 'x', 'X'},
                {'X', 'X', 'X', 'x'}};
        assertThat(monoHorizontal(check, 0), is(false));
        assertThat(monoHorizontal(check, 1), is(false));
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = monoVertical(input, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenMonoVertNot() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'x'}
        };
        boolean result = monoVertical(input, 2);
        assertThat(result, is(false));
    }

    @Test
    public void checkDiagonal() {
        char[][] c = new char[][] {
                {'a', 'b', 'c', '0'},
                {'f', 's', 't', 'e'},
                {'r', 'l', 'd', 'h'},
                {'z', 'x', 'e', 'f'}
        };
        assertThat(extractDiagonal(c), is(new char[]{'a', 's', 'd', 'f'}));
    }

    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }

}
