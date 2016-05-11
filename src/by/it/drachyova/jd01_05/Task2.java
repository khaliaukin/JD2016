package by.it.drachyova.jd01_05;

import static java.lang.Math.atan;
import static java.lang.Math.pow;
import static java.lang.Math.cos;
import static java.lang.Math.PI;
import static java.lang.Math.abs;

    public class Task2 {
        public static double calculate(double x, double a){
            return atan(pow(x,2))+pow(cos(PI/2-a),3)/abs(x-pow(a,1/5));
        }
    }


