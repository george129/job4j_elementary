package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

//import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
    }

    @Test
    public void rubleToDollar() {
    }

    @Test
    public void whenConvert160RubThen2Euro(){
        int in=160;
        int expected=2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected,out);
    }

    @Test
    public void whenConvert210RubThen3Dollars(){
        int in = 210;
        int expected=3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected,out);
    }
}