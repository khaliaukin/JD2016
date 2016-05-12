package by.it.kushel.jd01_05;

import static java.lang.Math.*;

/**
 * Created by Diomn on 09.05.2016.
 */
public class Task5 {
    public static void calculationBeta(){

        double beta;
        for (double x = -6.0; x < 2.0; x += 0.5){

            if (x / 2 > -2 && x / 2 <= -1){
                beta = sin(pow(x, 2));
            } else if (x / 2 > -1 && x / 2 < 0.2){
                beta = cos(pow(x, 2));
            } else if (x / 2 == 0.2){
                beta = 1 / tan(pow(x, 2));
            } else{
                continue;
            }
            double alpha = log10(abs(beta + 2.74));
            alpha=Math.rint(1000*alpha)/1000;
            System.out.println("x="+x+", alpha="+alpha);
        }
    }
}
