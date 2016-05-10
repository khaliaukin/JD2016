package by.it.luksha.jd01_05.Math_var7;

import static java.lang.Math.*;

public class Task3 {
    public static void createTable(double x, double start, double end, double delta) {

        System.out.println("┏━━━━━┳━━━━━┓");
        System.out.println("┃   param  ┃    value   ┃");
        System.out.println("┣━━━━━╋━━━━━┫");
        for (double c = start; c <= end; c += delta) {
            double y = pow(pow(abs(2*x - c), 3), 1.0/5) + 0.567;
            System.out.printf("%-5s%-8.2f%-5s%-8.2f%-1s\n", "┃", c, "┃", y, "┃");
        }
        System.out.println("┗━━━━━┻━━━━━┛");
    }
}
