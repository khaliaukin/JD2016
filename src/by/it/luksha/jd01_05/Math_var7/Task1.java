package by.it.luksha.jd01_05.Math_var7;

import static java.lang.Math.*;

public class Task1 {
    //Записать на языке арифметическое выражение. Запись осуществить двумя способами: – с разбивкой выражения на части; - полным выражением.
    //с разбивкой
    public static double theFirst(double x) {

        double a = sin(pow((PI/8 - 1), 2));
        double b = pow((3 + pow(x, 2)), 1.0/4);
        double c = asin(toRadians(1.0*x/2));
        double d = 5.236 * pow(10, -2);
        double e = log(abs(3.12 - x));

        return ((a + b)/(c - d)) + e;
    }

    //без разбивки
    public static double theSecond(double x) {

        return ((sin(pow((PI/8 - 1), 2)) + pow((3 + pow(x, 2)), 1.0/4))/(asin(toRadians(1.0*x/2)) - 5.236 * pow(10, -2))) + log(abs(3.12 - x));
    }
}
