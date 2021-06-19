package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        double result = Point.distance(10, 16, 13, 21);
        assertThat(result, is(5.830951894845301));
    }
}