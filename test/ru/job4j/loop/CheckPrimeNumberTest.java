package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static ru.job4j.loop.CheckPrimeNumber.check;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        boolean rsl = check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        boolean rsl = check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when1() {
        boolean rsl = check(1);
        assertThat(rsl, is(false));
    }

    @Test
    public void batch() {
        assertEquals(true, check(7));
        assertEquals(true, check(13));
        assertEquals(true, check(23));
        assertEquals(true, check(11));
        assertEquals(false, check(8));
        assertEquals(false, check(6));
    }
}