package by.it.starotitorov.jd01_05;

import static java.lang.Math.*;

/**
 * Created by Vasiliy Starotitorov on 12.05.2016.
 */
public class Task5 {

    public static void main(String[] args) {
        int index = 0;
        double[][] zfuncp = new double[2][8];
        double r = 4.73, x;
        for (double p = -8; p < 22; p += 3.5) {
            if (p + r < 0.5) {
                x = pow(sin(p), 5);
            } else if (0.5 <= p + r && p + r <= 3) {
                x = pow(E, abs(p + 3));
            } else {

                x = sqrt(abs(pow(p + 7, 5)));
                double z = 2 * x + pow(E, r) / 2;
                zfuncp[0][index] = p;
                zfuncp[1][index] = z;
                index++;

                System.out.println(String.format("%5s   %-25s", x, z ));
            }
        }

    }

}