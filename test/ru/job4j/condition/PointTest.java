package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        double out;
        double expect = 5.0;
        out = Point.distance(0, 3, 4, 0);
        Assert.assertEquals(out, expect, 0.01);
    }
}