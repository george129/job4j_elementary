package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void max2is() {
        assertEquals(4, Max.max(3, 4));
    }

    @Test
    public void max2not() {
        assertEquals(3, Max.max(3, 3));
    }
    @Test
    public void max3() {
        assertEquals(3, Max.max(1,2,3));
    }

    @Test
    public void max4() {
        assertEquals(4, Max.max(-3, -2, 1, 4));
    }
}