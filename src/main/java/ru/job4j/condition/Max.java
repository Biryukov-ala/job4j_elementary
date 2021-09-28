package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = true;
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int msg = Max.max(21, 22);
        System.out.println(msg);
    }
}
