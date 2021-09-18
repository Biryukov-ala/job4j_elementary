package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length; index++) {
            int min = MinDiapason.findMin(data, index, (data.length - 1));
            int indexLoop = FindLoop.indexOf(data, min, index, data.length);
            SwitchArray.swap(data, index, indexLoop);
        }
        return data;
    }
}
