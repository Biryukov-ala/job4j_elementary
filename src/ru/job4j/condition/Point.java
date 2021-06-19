package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rslX = x2 - x1;
        double rslY = y2 - y1;
        rslX = Math.pow(rslX, 2);
        rslY = Math.pow(rslY, 2);
       double rsl = rslX + rslY;
        rsl = Math.sqrt(rsl);

        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(10, 16, 13, 21);
        System.out.println("result (x1, y1) to (x2, y2) is " + result);
    }

}
