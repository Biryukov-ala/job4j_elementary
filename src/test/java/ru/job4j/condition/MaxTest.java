package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax20To2Then20() {
        int left = 20;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 20;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax21To21Then21() {
        int left = 21;
        int right = 21;
        int result = Max.max(left, right);
        int expected = 21;
        Assert.assertEquals(result, expected);
    }
}