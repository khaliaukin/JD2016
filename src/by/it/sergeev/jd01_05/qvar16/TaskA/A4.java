package by.it.sergeev.jd01_05.qvar16.TaskA;

import static java.lang.Math.*;

public class A4 {
    public static double calculate(){
        double sum = 0;

        for (double x = 1; x <= 8; x += 0.02){
            for (int i = 6; i <= 12; i++){
                double y = pow((x + 2),1.3*i);
                sum += y;
            }
        }
        return sum;
    }
}
