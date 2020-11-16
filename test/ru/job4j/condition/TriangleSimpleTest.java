package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleSimpleTest {
    @Test
    public void whenExists() {
        assertEquals(true,  TriangleSimple.exist(3, 4, 5));
        assertEquals(true,  TriangleSimple.exist(3, 3, 3));
    }

    @Test
    public void notExist() {
        assertEquals(false, TriangleSimple.exist(2, 2, 4));
    }

}