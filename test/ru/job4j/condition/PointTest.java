package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Assert.assertEquals(5.0, new Point(4, 0).distance(new Point(0, 3)), 0.01);
    }

    @Test
    public void distance3d(){
        Assert.assertEquals(5.19, new Point(1,1,1).distance3d(new Point(4,0,4)),0.01);

    }
}