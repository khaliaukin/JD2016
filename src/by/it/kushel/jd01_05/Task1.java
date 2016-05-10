package by.it.kushel.jd01_05;

/**
 * Created by Diomn on 05.05.2016.
 */
import static java.lang.Math.*;
public class Task1 {
    public static double optionA(double x){
        double a=sin(PI/2+1)*sin(PI/2+1)+x*pow(3+x*x,1/4);
        double b=pow(tan(pow(x,3)-1),3);
        double c= atan(x/2)-log(17.56);
        double y=(a+b)/c;
        return  y;
    }
    public static double optionB(double x){
        double y=(sin(PI/2+1)*sin(PI/2+1)+x*pow(3+x*x,1/4)+pow(tan(pow(x,3)-1),3))/(atan(x/2)-log(17.56));
        return  y;
    }
}
