package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int delta = money - price;

            for (int i = 0; i < coins.length; i++) {
                int count = 0;
                while ((count = delta / coins[i]) > 0) {
                    delta = delta - count * coins[i];
                        for (int z = 0; z < count; z++) {
                            rsl[size++] = coins[i];
                        }
                }
            }
        return Arrays.copyOf(rsl, size);
    }
}
