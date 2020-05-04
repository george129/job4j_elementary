package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        int in_x1=0, in_x2=3, in_y1=4, in_y2=0;
        double out, expect=5.0;
        out=Point.distance(in_x1, in_y1, in_x2, in_y2);
        Assert.assertEquals(out, expect, 0.01);
    }
}