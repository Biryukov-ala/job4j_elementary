package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double rslP = (a + b + c)/2; /*определяем полупериметр*/
        double rsl = rslP * (rslP - a) * (rslP - b) * (rslP - c);/*выражение под корнем*/
        rsl = Math.sqrt(rsl);/*площадь треугольника*/
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
