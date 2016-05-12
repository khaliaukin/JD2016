package by.it.kushel.jd01_05;

/**
 * Created by Diomn on 05.05.2016.
 */
import static java.lang.Math.*;
public class Task3 {
    /*public static double[] y(double x){
        double deltaa=2.5;
       int sizeMas= (int)((25.5-3.5)/deltaa);
        double[]y=new double[sizeMas];
        double a=3.5;
        for (int i=0; i<sizeMas; i++) {
            y[i] = sin(x / 3) + 1.2 * a;
            a=a+deltaa;
        }
        return y;
    }*/
    public static void printTable(){

        double x = 12.1;

        System.out.println("┏━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ param ┃        value        ┃");
        System.out.println("┣━━━━━━━━━━━━━━━━━┫");
        for (double a = 3.5; a <= 25.5; a += 2.5){
            double y = sin(x / 3) + 1.2 * a;
            System.out.println(String.format("%-2s%-6s%-2s%-19s%-20s", "┃", a, "┃", y, "┃"));
        }
        System.out.println("┗━━━━━━━━━━━━━━━━━┛");
    }

}
