package by.it.kushel.jd01_05;

/**
 * Created by Diomn on 05.05.2016.
 */
import static java.lang.Math.*;
public class Task4 {
   /* public static double[][]calculationY(){
        int row=6;
        int col=(int)((2-0)/2);
        double[][] y=new double[row][col];
        double a=0;
        int x=1;
        for(int i=0;i<=row;i++){
            for(int j=0; j<col; j++){
                y[i][j]=pow(7,a)-cos(x);
                a=a+0.2;
            }
            x=x+1;
        }
        return y;
    }*/

    public static void calculationY() {
        double sum = 0;

        for (double a = 0; a <= 2; a += 0.2) {
            for (int x = 1; x <= 6; x++) {
                double y = pow(7, a) - cos(x);
                sum += y;
            }
                System.out.println("a=" + Math.rint(100.0 * a) / 100.0 + ", Sum=" + Math.rint(100.0 * sum) / 100.0);
            }

        }


}

