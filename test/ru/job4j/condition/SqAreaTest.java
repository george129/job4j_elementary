package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        double out = SqArea.square(12, 2);
        double expect = 8.0;
        Assert.assertEquals(out, expect, 0.01);
    }
}