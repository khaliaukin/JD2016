package by.it.drachyova.jd01_05;

import static java.lang.Math.pow;
import static java.lang.Math.cos;
import static java.lang.Math.PI;
import static java.lang.Math.log;
import static java.lang.Math.abs;

public class Task1 {

    public static double method1 (double a, double b){
        //с разбивкой выражения на части
        double y1=pow(cos(PI/4),4);
        double y2=pow(a+1.5,1/5);
        double y3=a*pow(b,8);
        double y4=b/(log(pow(abs(a),2)));
        return y1+y2+y3-y4;
    }

    public static double method2(double a, double b){
        //полным выражением
        return pow(cos(PI/4),4)+pow(a+1.5,1/5)+a*pow(b,8)-b/(log(pow(abs(a),2)));

    }
}
