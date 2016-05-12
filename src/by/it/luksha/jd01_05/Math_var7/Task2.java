package by.it.luksha.jd01_05.Math_var7;

import static java.lang.Math.*;

public class Task2 {
    public static double calculate(double a, double b) {
        return  tan(pow((a-b), 2)) - pow((a + 1.5), 1.0/3) + a*pow(b, 5) - b/log(pow(a, 2));
    }
}
