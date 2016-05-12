package by.it.belsky.jd01_05;

import static java.lang.Math.atan;
import static java.lang.Math.pow;
import static java.lang.StrictMath.sin;

/**
 * Created by misha on 12.05.2016.
 */
public class Task2 {
    public static double calculateA(double y) {
        double x = 0.21E2;
         y = (pow(sin(x+1), 2)+x*pow(3+pow(x, 2), 0.25))/atan(x/2);
return y;
    }
    public static double calculateB(double x) {
       double y = (pow(sin(x+1), 2)+x*pow(3+pow(x, 2), 0.25))/atan(x/2);
        return y;
    }
}