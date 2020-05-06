package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        int inP=12;
        int inK=2;
        double out=SqArea.square(inP, inK);
        double expect=8.0;
        Assert.assertEquals(out,expect, 0.01);
    }
}