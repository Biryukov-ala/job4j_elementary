package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP9K4Square3() {
        double expected = 3.24;
        int p = 9;
        double k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenP10K3Square4() {
        double expected = 4.68;
        int p = 10;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenP11K6Square3() {
        double expected = 3.70;
        int p = 11;
        double k = 6;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}