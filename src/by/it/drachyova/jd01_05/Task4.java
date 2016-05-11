package by.it.drachyova.jd01_05;

import static java.lang.Math.log;
import static java.lang.Math.abs;

public class Task4 {

    public static double calculate(){

        double product = 1;

        for (double t = 2; t <= 3; t += 0.1){
            for (int d = 23; d <= 39; d++){
                double m =log(abs(d-t));
                product *= m;
            }
        }
        return product;
    }
}

