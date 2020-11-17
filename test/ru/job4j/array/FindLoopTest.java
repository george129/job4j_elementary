package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.job4j.array.FindLoop.indexOf;

public class FindLoopTest {
    @Test
    public void foundAt0() {
        assertEquals(
                2,
                indexOf(new int[] {2, 3, 10, 15}, 10));

        assertEquals(
                2,
                indexOf(new int[] {2, 3, 10, 15}, 10, 1, 2));
    }

    @Test
    public void notFound() {
        assertEquals(
                -1,
                indexOf(new int[] {1, 2, 3, 10}, 7));
        assertEquals(
                -1,
                indexOf(new int[] {1, 2, 3, 10}, 10, 0, 2));
    }
}