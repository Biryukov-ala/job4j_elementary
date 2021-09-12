package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3numbers() {
        int[] data = new int[] {6, 8, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {6, 7, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5numbers() {
        int[] data = new int[] {11, 13, 10, 9, 12};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {9, 10, 11, 12, 13};
        Assert.assertArrayEquals(expected, result);
    }
}