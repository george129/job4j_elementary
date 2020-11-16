package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void max2is() {
        assertEquals(4, Max.max(3, 4));
        assertEquals(4, Max.max(4, 3));
        assertEquals(4, Max.max(4, -3));
        assertEquals(-4, Max.max(-4, -5));


    }

    @Test
    public void max2not() {
        assertEquals(3, Max.max(3, 3));
        assertEquals(0, Max.max(0, 0));
        assertEquals(-1, Max.max(-1, -1));

    }
    @Test
    public void max3() {
        assertEquals(3, Max.max(3, 2, 1));
        assertEquals(3, Max.max(2, 3, 1));
        assertEquals(3, Max.max(1, 2, 3));
        assertEquals(3, Max.max(3, 3, 3));

    }

    @Test
    public void max4() {
        assertEquals(4, Max.max(-3, -2, 1, 4));
    }
}