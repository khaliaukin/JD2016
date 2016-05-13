package by.it.starotitorov.jd01_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Vasiliy Starotitorov on 04.05.2016.
 */
public class TaskB {
    //Задача про попадание числа в отрезок
    public static void main(String[] args) {
        int k = 100, n = 4, m = 120; /*
             объявляем переменные (простите что с заданными значениями, было бы время прикрутил бы и ввод и с правилами)
            в следующих заданиях постараюсь делать все по фен-шуй
            */
        if (n < k && k < m) // определяем попадание в диапазон n..m
            System.out.println("Число " + k + " в отрезке");
        else
            System.out.println("Число " + k + "не в отрезке");
    }
}


