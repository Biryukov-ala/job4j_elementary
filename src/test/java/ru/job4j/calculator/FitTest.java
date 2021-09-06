package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan174Then85() {
        short in = 174;
        double expected = 85.1;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman171Then70() {
        short in = 171;
        double expected = 70.15;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
   }
}