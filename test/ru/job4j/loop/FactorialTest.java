package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.job4j.loop.Factorial.*;

public class FactorialTest {
    @Test
    public void factorial() {
        assertEquals(24,  calc(4));
        assertEquals(120, calc(5));
        assertEquals(1, calc(1));
        assertEquals(1, calc(0));
    }
    @Test
    public void factorialRecursive() {
        assertEquals(24,  calcRecursive(4));
        assertEquals(120, calcRecursive(5));
        assertEquals(1, calcRecursive(1));
        assertEquals(1, calcRecursive(0));
    }

}