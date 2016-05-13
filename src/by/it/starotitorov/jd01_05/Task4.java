package by.it.starotitorov.jd01_05;
import static java.lang.Math.*;
/**
 * Created by Vasiliy Starotitorov on 12.05.2016.
 */
public class Task4 {
    public static void main(String[] args) {
        double d = 1;
        for (double a = -5; a <= 12; a += 3.75)
            for (double t = 1; t <= 3; t++) {
                {
                    d = d * sin(a - t);

                    System.out.println(String.format("%-2s%-20s%-5s%-10s%-15s", "┃", d, "┃", a, "┃"));
                }
            }
        }
    }
