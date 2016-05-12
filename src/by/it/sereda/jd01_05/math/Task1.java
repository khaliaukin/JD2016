package by.it.sereda.jd01_05.math;

import static java.lang.Math.*;

public class Task1 {
    public static double optionA(double ainput,double x){
        //выражение отдельными фрагментами
        double a = pow(cos(pow(x,2)+(PI/6)), 5);
        double b = sqrt(x*pow(ainput, 3));
        double c = log(abs((ainput-1.12*x)/4));

        x = a - b - c;

        return x;
    }

    public static double optionB(double ainput,double x){
        //выражение одной строкой
        x = pow(cos(pow(x,2)+(PI/6)), 5) - sqrt(x*pow(ainput, 3)) - log(abs((ainput-1.12*x)/4));

        return x;
    }
}