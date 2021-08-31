package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp = array[array.length - 1];
        array[array.length - 1] = array[0];
        array[0] = temp;

        temp = array [1]; /* инд 1 в темп*/
        array [1] = array [array.length - 2]; /* инд предпоследний в 1*/
        array [array.length - 2] = temp; /* инд темп в предпоследний*/

        return array;
    }
}
