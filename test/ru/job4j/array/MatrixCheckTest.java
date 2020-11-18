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
    public void whenNot() {
        char[][] check = {
                {'X', 'x', 'X'},
                {'X', 'X', 'X', 'x'}};
        assertThat(monoHorizontal(check, 0), is(false));
        assertThat(monoHorizontal(check, 1), is(false));
        }
}
