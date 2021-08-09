package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 1; i <= number + 1; i++) {
            if (i % 1 == 0) {
                prime = false;
                if (i % 2 == 0) {
                    prime = false;
                    if (i % 3 == 0) {
                        prime = true;
                        if (i % 4 == 0) {
                            prime = false;
                            if (i % 5 == 0) {
                                prime = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return prime;
    }
}