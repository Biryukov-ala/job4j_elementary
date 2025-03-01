package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + div(first, second)
                + minus(first, second);
    }

    public static double sumOnlyTwo(double first, double second) {
        return div(first, second)
                + minus(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumOnlyTwo(10, 20));
    }
}
