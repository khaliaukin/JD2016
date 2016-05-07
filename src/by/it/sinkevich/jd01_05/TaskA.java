package by.it.sinkevich.jd01_05;

import java.io.IOException;

import static java.lang.Math.*;
/**
 * Created by Computer on 07.05.2016.
 */
class TaskA {

    double task1(double x, boolean fullExpression) {
        double y;
        if (fullExpression) {
            y = (pow(sin(PI / 2 + 1), 2) + x * pow(3 + x * x, 1 / 4) - pow(tan(toRadians(pow(x, 3) - 1)), 3)) /
                    (atan(x / 2) - log(17.56));
        } else {
            double part1 = pow(sin(PI / 2 + 1), 2);
            double part2 = x * pow(3 + x * x, 1 / 4);
            double part3 = pow(tan(toRadians(pow(x, 3) - 1)), 3);
            double part4 = atan(x / 2) - log(17.56);
            y = (part1 + part2 - part3) / part4;
        }
        if (fullExpression) {
            System.out.println("Значение выражения записанного полностью равно: " + y);
        } else {
            System.out.println("Значение выражения записанного по частям равно: " + y);
        }
        return y;
    }

    double task2(boolean manualArgsInOut) throws IOException {
        double x, a;
        if (manualArgsInOut) {
            System.out.print("Переменная х = ");
            x = Util.getDoubleFromConsole();
            System.out.print("Переменная а = ");
            a = Util.getDoubleFromConsole();
        } else {
            x = 3.24;
            a = 5.8;
        }
        double z = atan(x * x) + pow(cos(PI / 2 - a), 3) / abs(x - pow(a, 1 / 5));
        if (!manualArgsInOut) {
            System.out.println("z = " + z);
        }
        return z;
    }

    void task3() {
        double[][] sfunct = new double[2][11];
        int index = 0;
        for (double t = 2.0; t < 3.1; t = t + 0.1) {
            sfunct[0][index] = t;
            double s = log(abs(1.3 + t)) - pow(E, t);
            sfunct[1][index] = s;
            index++;
        }
        System.out.println("Результат задания №3: ");
        Util.printFunctionTable(sfunct, "s");
    }

    void task4() {
        double[][] yfunca = new double[2][11];
        int index = 0;
        for (double a = 0; a < 2.1; a = a + 0.2) {
            yfunca[0][index] = a;
            double y = 0;
            for (int x = 1; x <= 6; x++) {
                y += pow(7, a) - cos(x);
            }
            yfunca[1][index] = y;
            index++;
        }
        System.out.println("Рещультат задания №4: ");
        Util.printFunctionTable(yfunca, "y");
    }
}
