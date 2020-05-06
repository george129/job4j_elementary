package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        int inX1 = 0;
        int inX2 = 3;
        int inY1 = 4;
        int inY2 = 0;
        double out;
        double expect = 5.0;
        out = Point.distance(inX1, inY1, inX2, inY2);
        Assert.assertEquals(out, expect, 0.01);
    }
}