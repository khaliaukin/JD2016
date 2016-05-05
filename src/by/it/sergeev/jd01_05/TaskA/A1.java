package by.it.sergeev.jd01_05.TaskA;

import static java.lang.Math.*;

public class A1 {
    public static double equationInPart(double x){
        double a, b, c, d;
        a = pow(sin((PI/6) - 1),2);
        b = pow(3+x*x,1.0/4);
        c = pow(log10(pow(x, 3) - 1), 3);
        d = asin(x/2)-1.756*pow(10,-2);
        double y = (a+b-c)/d;

        return y;
    }
    public static double equationFull(double x){

        double y = (pow(sin((PI/6) - 1),2) + pow(3+x*x,1.0/4) - pow(log10(pow(x, 3) - 1), 3))/(asin(x/2)-1.756*pow(10,-2));

        return y;
    }
}
