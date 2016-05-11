package by.it.smirnova.jd01_05.Math;

import static java.lang.Math.pow;
import static java.lang.Math.acos;
import static java.lang.Math.sqrt;
import static java.lang.Math.sin;
import static java.lang.Math.log10;
import static java.lang.Math.PI;

public class Task2 {
    public static double calculate(double a, double x) {
        double z;
        z = acos(pow(x,2)) - a*sqrt(x/pow(a,3)) + pow(sin(PI/2),3)/log10(2*x);
        return z;

    }
}
