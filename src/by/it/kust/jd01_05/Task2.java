package by.it.kust.jd01_05;

import static java.lang.Math.*;

public class Task2 {
    /**
     * вычисление функции
     * @param a заданный параметр
     * @param x заданный параметр
     * @return результат вычисления выражения
     */
    public static double calculate(double a, double x){
        double z;
        z = acos(pow(x,2)) - a*sqrt(x/pow(a,3)) + pow(sin(PI/2),3)/log(2*x);
        return z;    //результат функции
    }
}