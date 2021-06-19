package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
    double rslH = p / (2 * (k + 1)); /*определяем высоту*/
    double rslL = rslH * k; /*определяем длину через высоту и k*/
        double rsl = rslH * rslL; /*определяем площадь*/
    return rsl;
}
    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
