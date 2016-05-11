package by.it.luksha.jd01_05.Math_var7;

import static java.lang.Math.*;

public class Task4 {
    public static void multiply() {
        for (double t = 2; t <= 3.1; t+=0.1) {
            double multi = 1;
            for (int a = 12; a <= 43; a++) {
                multi *= pow(t, a - 3);
            }
            System.out.printf("При t=%1.1f произведение - %5.5f\n", t, multi);
        }
    }
}
