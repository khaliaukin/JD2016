package by.it.sergeev.jd01_05.qvar16.TaskA;

import static java.lang.Math.*;


public class A2 {
    public static double calculate(double a, double x){
        double z;
        z = acos(pow(x, 2)) - a*sqrt(x/pow(a,3))+pow(sin(PI/2),3)/log10(2*x);
        return z;
    }
}
