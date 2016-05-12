package by.it.sereda.jd01_05.math;

import static java.lang.Math.*;

public class Task2 {
    public static double calculate(double a, double b){
        double y = pow((a+1.5), 1.0/3) + pow(a - b,8) - (b / asin(pow(abs(a), 2)));
        return y;
    }
}