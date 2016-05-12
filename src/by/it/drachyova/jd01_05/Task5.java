package by.it.drachyova.jd01_05;


import static java.lang.Math.*;

public class Task5 {

    public static void calculate(){


        for (double x =-2.8; x <0.3; x += 0.2){
            double lambda;
            if (x>-2 && x<=-1){
                lambda = asin(pow(x,2));
            } else if (x>-1 && x<0.2){
                lambda = acos(pow(x,2));
            } else if (x==0.2){
                lambda=atan(pow(x,2));
            } else{
                continue;
            }
            double y =lambda/3+sqrt(lambda);
            System.out.println(String.format("%1s%25s", x, y));
        }
    }
}
