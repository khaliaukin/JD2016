package by.it.sereda.jd01_05.math;


public class Task4 {
    public static double calculate(){
        double mul = 1;

        for (double t = 2.0; t < 3.1; t = t+0.1){
            for (int d = 23; d <= 39; d++){
                double x = Math.log10(Math.abs(d-t));
                mul = mul*x;
                }
        }
        return mul;
    }
}