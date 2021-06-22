package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");
        //тестирование конвертера//
        float in = 140;
        float expected = 2f;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println ("140 rubles are " + euro + " euro." + passed);
        expected = 2.3333333f;
        out = Converter.rubleToDollar (in);
        passed = expected == out;
        System.out.println("140 rubles are " + dollar + " dollars." + passed);

    }
}
