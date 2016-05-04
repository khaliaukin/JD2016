package by.it.sergeev.jd01_05.TaskA;

import static java.lang.Math.*;

/**
 * Created by Дмитрий on 04.05.2016.
 */
public class A2 {
    public static double calculate(double a, double b){
        double y;
        y = pow(1.0 / tan(PI / 4 - 1), 4) + cbrt(a + 1.5) - (b / asin(pow(a, 2)));
        return y;
    }
}
