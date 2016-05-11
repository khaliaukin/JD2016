package by.it.smirnova.jd01_05.Math;

import static java.lang.Math.pow;
import static java.lang.Math.log;import static java.lang.Math.log;
import static java.lang.Math.tan;
import static java.lang.Math.cbrt;


public class Task1 {
    public static double optionA(double a, double b) {
        //выражение отдельными фрагментами
        double d = tan(pow(a + b, 2));
        double f = cbrt(a + 1.5);
        double g = a*pow(b, 5);
        double k = b / log(pow (a, 2));

        double y = d - f + g - k;

        return y;
    }
    public static double optionB(double a, double b){
        //полное выражение

        double y = tan(pow(a + b, 2)) - cbrt(a + 1.5) + pow(a * b, 5) - b / log(pow (a, 2));

        return y;

    }

}
