package by.it.sergeev.jd01_05.qvar16.TaskA;

import static java.lang.Math.*;



public class A1{
        public static double equationInPart(double x){
    double a, b, c, d;
    a = pow(sin((PI/2) + 1),2);
    b = pow(3+x*x,1.0/4);
    c = pow(tan(pow(x, 3) - 1), 3);
    d = atan(x/2)-log(17.56);
    double y = (a+b-c)/d;

    return y;
}
        public static double equationFull(double x){

            double y = (pow(sin((PI/2) + 1),2) + pow(3+x*x,1.0/4) - pow(tan(pow(x, 3) - 1), 3))/(atan(x/2)-log(17.56));

            return y;
        }
}

