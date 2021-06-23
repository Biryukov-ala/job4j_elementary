package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short manheight) {
        double rsl = (manheight - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short womheight) {
        double rsl = (womheight - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short manheight = 174;
        short womheight = 171;
        double man = Fit.manWeight(manheight);
        double wom = Fit.womanWeight(womheight);
        System.out.println("If man's height is " + manheight + ", than man's normal weight is " + man);
        System.out.println("If woman's height is " + womheight + ", than woman's normal weight is " + wom);
    }
}
