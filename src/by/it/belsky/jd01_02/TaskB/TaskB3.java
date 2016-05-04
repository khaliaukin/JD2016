package by.it.belsky.jd01_02.TaskB;

import com.sun.org.apache.regexp.internal.RE;
import com.sun.org.apache.xml.internal.serializer.utils.SystemIDResolver;

import java.util.Scanner;

/**
 * Created by misha on 03.05.2016.
 */
public class TaskB3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        float a, b, c, d, x1, x2;
        System.out.println("Введите коэффициент а :");
        a = sc.nextFloat();
        System.out.println("Введите коэффициент b :");
        b = sc.nextFloat();
        System.out.println("Введите коэффициент c :");
        c = sc.nextFloat();
        d = (float) Math.pow(b,2) - (4 * a * c);
        if (d < 0) {
            System.out.println("Уравнение не имеет решений");
        } else if (d == 0) {
            {
                x1 = b / -2 * a;
                System.out.println("Уравнение имеет один корень х1=" + x1);
            }
        } else {
            x1 = -b + (float) (Math.sqrt(d)) / 2 * a;
            x2 = -b - (float) (Math.sqrt(d)) / 2 * a;
            System.out.println("Уравнение имеет два корня :"+"x1 =" + x1 + ", x2 =" + x2);
        }
    }
}

