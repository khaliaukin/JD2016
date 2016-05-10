package by.it.sereda.jd01_05.math;

import static java.lang.Math.*;

public class Task5 {

    public static void calculate(double r){

        double z;
        for (double p = -1.5; p < 15.0; p += 1.5){

            if (p - 1 < 0){
                z = p - 3.18*cos(p+1);
            } else if (p - 1 >= 0 && p - 1 < 3){
                z = pow(p, 3) - tan(p);
            } else if (p - 1 >= 3){
                z = pow((p + sin(PI/6)), 5);
            } else{
                continue;
            }
            double y = sqrt(abs(z - 2.56*r));
            System.out.println(String.format("%1s%25s", "при p="+p, "y="+y));
        }
    }
}