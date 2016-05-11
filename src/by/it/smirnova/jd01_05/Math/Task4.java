package by.it.smirnova.jd01_05.Math;
import static java.lang.Math.log10;
import static java.lang.Math.abs;

public class Task4 {

    public static double calculate(){

        double m = 1;

        for(int d = 23; d<=39; d+=1){

            for(double t = 2; t<=3; t+=0.1){

                double f = log10(abs(d-t));

                m = m*f;
            }
        }
        return m;
    }
}
