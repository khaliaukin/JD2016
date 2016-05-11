package by.it.luksha.jd01_05.Math_var7;

import static java.lang.Math.*;

public class Task5 {
    public static void calculate() {
        double r = 4.73;
        for (double p = -2; p < 25; p+=4) {
            double x = 0;
            double diff = p + r;
            if (diff < 0.5) {
                x = pow(sin(r), 5);
            }
            else if (0.5 <= diff && diff < 3) {
                x = 0;
            }
            else if (diff > 3) {
                x = sqrt(r + 87.34);
            }

            double z = x + (pow(E, r))/2;

            System.out.printf("При значении р=%3f, z=%5.3f\n", p, z);
        }
    }
}
