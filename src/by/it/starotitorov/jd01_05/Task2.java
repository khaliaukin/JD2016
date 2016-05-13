package by.it.starotitorov.jd01_05;

import static java.lang.Math.*;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

/**
 * Created by Vasiliy Starotitorov on 11.05.2016.
 */
public class Task2 {
    public static void main(String[] args) {
        double  a = 5.8, x = 3.24 , z;
        z=atan(x*x) +(pow(cos(PI/2+a),3))/abs(x-(pow(a, 1.0/5))); // полное выражение
        System.out.println("итого   " +z);
    }
}

