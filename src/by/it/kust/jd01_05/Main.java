package by.it.kust.jd01_05;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        //Задание 1
        double a = 0.94;
        double x = 10.093;
        System.out.println("Задание 1: \nЗаписать на языке арифсетическое выражение. Запись осуществить двумя способами (с разбивкой выражения на части и полныс выражением");
        System.out.println("Результат выражения с разбивкой выражения на части: z =  " + Task1.option1(a, x));
        System.out.println("Результат выражения полным выражением: z = " +  Task1.option2(a, x));

        //Задание 2
        System.out.println("Задание 2: \nСоставить программу вычисления функции");
        System.out.println("Результат вычисления функции: z = " + Task2.calculate(a*pow(10,-3), x));

        //Задание 3
        System.out.println("Задание 3: \nСоставить программу табулирования функции y. В таблицу вывести параметр цикла и результат вычисления");
        Task3.printTable();

        //Задание 4
        System.out.println("Задание 4: \nСоставить программу вычисления суммы либо произведения (вложенные циклы)");
        System.out.println("Произведение = " + Task4.calculate());


    }


}