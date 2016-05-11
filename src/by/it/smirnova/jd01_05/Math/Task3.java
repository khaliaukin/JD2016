package by.it.smirnova.jd01_05.Math;

import static java.lang.Math.E;
import static java.lang.Math.pow;

public class Task3 {

    public static void Table(){

        double x = 12.1;

        System.out.printf("%10s %60s\n","a", "f");

        for(double a = -5; a<=12; a+=3.75){

            double f = pow(E, a*x) - 3.45*a;

            System.out.printf("%10.2f %60.2f\n", a, f);

        }
    }
}
