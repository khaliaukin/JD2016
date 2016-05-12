package by.it.kust.jd01_05;

import static java.lang.Math.*;

public class Task1 {
    /**
     * запись с разбивкой выражения на части
     * @param a заданный параметр
     * @param x заданный параметр
     * @return результат вычисления выражения
     */
    public static double option1(double a, double x){
        double b = acos(pow(x, 2));
        double c = a*sqrt(x);
        double d = pow(sin(PI/2 + a), 3);
        double e = log(2*x);
        double z;
        z = b - c + d/e;
        return z; // результат выражения
    }

    /**
     * запись с разбивкой выражения на части
     * @param a заданный параметр
     * @param x заданный параметр
     * @return результат вычисления выражения
     */
    public static double option2(double a, double x){
        //запись полным выражением
        double z;
        z = acos(pow(x,2)) - a*sqrt(x) + pow(sin(PI/2+a),3)/log(2*x);
        return z;


    }

}