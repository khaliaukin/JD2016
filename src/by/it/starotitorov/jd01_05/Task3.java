package by.it.starotitorov.jd01_05;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

/**
 * Created by Vasiliy Starotitorov on 11.05.2016.
 */
public class Task3 {
    public static void main (String[] args) {
        double x = 12.1;
        System.out.println("┏━━━━━━━┳━━━━━━━━━━━━┓");
        System.out.println("┃ число      ┃     значение       ┃");
        System.out.println("┣━━━━━━━╋━━━━━━━━━━━━┫");
        for (double c = -10; c <= 1; c += 0.5) {
            double y = pow(abs(2*x-c), 3.0/5)+0.567;
            System.out.println(String.format("%-2s%-11s%-2s%-19s%-20s", "┃", c, "┃", y, "┃"));
        }
        System.out.println("┗━━━━━━━┻━━━━━━━━━━━━┛");
    }
}
