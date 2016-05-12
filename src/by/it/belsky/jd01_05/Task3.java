package by.it.belsky.jd01_05;

import static java.lang.Math.pow;
import static java.lang.StrictMath.tan;

/**
 * Created by misha on 12.05.2016.
 */
public class Task3 {
    public static void printTable() {
        double x = 3.567;
        System.out.println("┏━━━━┳━━━━━━━━━━━━┓");
        System.out.println("┃param x┃       value y      ┃");
        System.out.println("┣━━━━╋━━━━━━━━━━━━┫");

        for (double a = 3.5; a<=25.5; a = a + 3.75) {
            double y = 1 / (tan(pow(x, 3))) + 2.24 * a * x;
            System.out.println(String.format("%-2s%-6s%-2s%-19s%-20s", "┃", a, "┃", y, "┃"));

        }
        System.out.println(" ━━━━━━━━━━━━━━━━━━");
    }
}