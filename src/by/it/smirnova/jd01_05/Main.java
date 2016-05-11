package by.it.smirnova.jd01_05;

import by.it.smirnova.jd01_05.Math.Task1;
import by.it.smirnova.jd01_05.Math.Task2;
import by.it.smirnova.jd01_05.Math.Task3;
import by.it.smirnova.jd01_05.Math.Task4;

import static java.lang.Math.pow;


public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");
        // Задача 1
        double a = 1.21;
        double b = 0.371;
        System.out.println(Task1.optionA(a,b));
        System.out.println(Task1.optionB(a,b));

        System.out.println("\nTask2");
        // Задача 2
        System.out.println(Task2.calculate(0.94*pow(10,-3), 10.093));

        System.out.println("\nTask3");
        //Задача 3
        Task3.Table();

        System.out.println("\nTask4");
        //Задача4
        System.out.println(Task4.calculate());
    }
}
