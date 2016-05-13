package by.it.starotitorov.jd01_05;
import static java.lang.Math.*;
/**
 * Created by Vasiliy Starotitorov on 11.05.2016.
 */
public class Task1 {
    public static void main(String[] args) {
        double  a = 10.093, x = 0.94 , z;
        double d, e, f, z1;
        d = (pow(sin(PI*0.5+a),3))/log10(2*x); //выражение разделено на три части
        e = a*sqrt(x);
        f = acos(x*x);
        z1 = f - e + d;
        z=acos(x*x) - a*sqrt(x)+((pow(sin(PI*0.5+a),3))/log10(2*x)); // полное выражение
        System.out.println("расчет аркосинуса  " +f);
        System.out.println("расчет произведения а на квадратный корень x  " +e);
        System.out.println("расчет дробной части " +d);
        System.out.println("итого 1.  " +z1);
        System.out.println("итого 2.  " +z);

    }


}

