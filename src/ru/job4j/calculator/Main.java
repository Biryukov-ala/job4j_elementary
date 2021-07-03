package ru.job4j.calculator;

public class Main {
    public static void main(String[] args) {
        //Ниже представлены строки кода. В них представлены пары в которых происходит преобразование типов.
        // Вам необходимо их разделить на 2 группы - преобразование, которое происходит
        // с потерей данных и преобразование без потери данных.

        // 1 выражение, без потери данных
        long l = 129;
        byte b = (byte) l;
        System.out.println(l);

        // 2 выражение, с потерей
        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println(rsl);

        // 3 выражение, без потери
        char c = 45000;
        float i1 = c;
        System.out.println(i1);

        // 4 выражение
        double d = 121.19;
        byte b1 = (byte) d;
        System.out.println(b1);

        // 5 выражение
        short s = 1500;
        char c1 = (char) s;
        double d1 = c1;
        System.out.println(d1);
    }
}
