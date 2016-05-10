package by.it.sereda.jd01_05.math;

import static java.lang.Math.*;
import static java.lang.Math.E;

public class Task3 {
    public static void printTable(){

        System.out.println("┏━━━━━┳━━━━━━━━━━━━┓");
        System.out.println("┃Параметр┃      Значение y     ┃");
        System.out.println("┣━━━━━╋━━━━━━━━━━━━┫");
        for (double t = 2.0; t < 3.1; t = t+0.1){
            double y = log(abs(1.3 + t)) - pow(E, t);;
            System.out.println(String.format("%-2s%-7.3s%-2s%-20s%-20s", "┃", t, "┃", y, "┃"));
        }
        System.out.println("┗━━━━━┻━━━━━━━━━━━━┛");
    }
}
