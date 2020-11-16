package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.job4j.loop.FindLoop.indexOf;

public class FindLoopTest {
    @Test
    public void foundAt0() {
        assertEquals(
                2,
                indexOf(new int[] {2, 3, 10, 15}, 10));
    }

    @Test
    public void notFound() {
        assertEquals(
                -1,
                indexOf(new int[] {1, 2, 3, 10}, 7));
    }
}