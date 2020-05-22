package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        Point a = new Point(0, 1);
        Point b = new Point(1, 0);
        Point c = new Point(0, 0);
        Triangle t = new Triangle(a, b, c);
        boolean expect = true;
        assertEquals(expect, t.exist());
    }

    @Test
    public void whenNotExist() {
        Point a = new Point(0, 1);
        Point b = new Point(0, 2);
        Point c = new Point(0, 0);
        Triangle t = new Triangle(a, b, c);
        boolean expect = false;
        assertEquals(expect, t.exist());
    }


    @Test
    public void perimeter() {
        Point a = new Point(3, 0);
        Point b = new Point(0, 4);
        Point c = new Point(0, 0);
        Triangle t = new Triangle(a, b, c);
        int expect = 6;
        assertEquals(expect, t.perimeter(), 0.01);
    }

    @Test
    public void areaNot0() {
        Point a = new Point(2, 0);
        Point b = new Point(0, 5);
        Point c = new Point(0, 0);
        Triangle t = new Triangle(a, b, c);
        int expect = 5;
        assertEquals(expect, t.area(), 0.01);
    }

    @Test
    public void area0() {
        Point a = new Point(0, 2);
        Point b = new Point(0, 5);
        Point c = new Point(0, 0);
        Triangle t = new Triangle(a, b, c);
        int expect = -1;
        assertEquals(expect, t.area(), 0.01);
    }

}