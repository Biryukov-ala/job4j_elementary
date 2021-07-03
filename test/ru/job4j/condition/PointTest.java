package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when10to200then201dot25() {
        double expected = 201.25;
        int x1 = 10;
        int y1 = 20;
        int x2 = 100;
        int y2 = 200;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }
    @Test
    public void when5to10then10dot049() {
        double expected = 10.049;
        int x1 = 5;
        int y1 = 20;
        int x2 = 6;
        int y2 = 10;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void when7to15then2dot236() {
        double expected = 2.236;
        int x1 = 7;
        int y1 = 17;
        int x2 = 6;
        int y2 = 15;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.001);
    }

}