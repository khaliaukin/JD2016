package by.it.drachyova.jd01_05;

import static java.lang.Math.pow;
import static java.lang.Math.abs;


public class Task3 {
    public static void printTable(){

        double x = 12.1;

        System.out.println(" _______________________");
        System.out.println("| parameter |   value   |");
        System.out.println("|___________|___________|");
        for (double c = -10.0; c <= 1.0; c += 0.5){
            double l = pow((pow(abs(2.0*x-c),3)),1/5)+0.567;
            System.out.format("%-2s%-10.1f%-2s%-10.3f%-2s","|",c,"|",l,"|");
            System.out.println();
        }
        System.out.println("|___________|___________|");
    }
}
