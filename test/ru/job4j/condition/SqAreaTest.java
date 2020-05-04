package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        int in_p=12, in_k=2;
        double out=SqArea.square(in_p, in_k);
        double expect=8.0;
        Assert.assertEquals(out,expect, 0.01);
    }
}