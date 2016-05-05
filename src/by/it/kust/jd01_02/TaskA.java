package by.it.kust.jd01_02;

import java.io.IOException;

public class TaskA {
    static void beginTaskA() throws IOException {
        //Задание A: Ввести n чисел с консоли через пробел.
        System.out.println("Задание А: Введите несколько чисел через пробел");
        //прочитаем линию значений с клавиатуры
        String line1 = Util.getOneLine();
        //String line = "11 22 343 123 67 456 333 22 853";
        int arr[]=Util.lineToIntArray(line1);
        //пункт А1 вывести числа мин и макс
        String max = TaskA.getMax(arr);
        System.out.println("\n" + max);
        String min = TaskA.getMin(arr);
        System.out.println(min);
        //пункт А2  вывксти числа меньше среднего
        double sred = TaskA.srAriphm(arr);
        System.out.print("Числа меньше " + sred + " таковы: ");
        for (int i : arr){
            if (i < sred) {  //почему здесь просто i, а не intMas[i]?
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //пункт А3 вывести первое число из разных цифр
        for (int i : arr) {
            if (TaskA.uniqueDigits(i)) {
                System.out.println("Найдено число из рахных цифр: " + i);
                break; //больше ничего не ищем
            }
        }
    }
    //пункт А1
    static String getMax(int array[]) {
        //int lenMax = 0;
        Integer max = Integer.MIN_VALUE;
        for (Integer i : array) {
            if (max < i) {
                max = i;
            }
        }
        return  "MAX = " + max.toString() + " length = " + max.toString().length();
    }
    static String getMin(int array[]) {
        //int lenMax = 0;
        Integer min = Integer.MAX_VALUE;
        for (Integer i : array) {
            if (min > i) {
                min = i;
                }
            }
        return  "MIN = " + min.toString() + " length = " + min.toString().length();
    }
    //пункт А2
    static double srAriphm (int array[]){
    //вычисляем среднее арифметическое
        double sr = 0;
        //все складываем
        for (int i : array) {sr = sr + i;}
        //найти среднее
        sr = sr / array.length;
        return sr;
    }
    //пункт А3
    static boolean uniqueDigits (Integer value) {
        char ch[] = value.toString().toCharArray();
        for (int i = 0; i < ch.length; i++)
            for (int j = i + 1; j < ch.length; j++) //а как оно проверит 343?
                if (ch[i] == ch[j]) return false;
        //если не попалось одинаковых цифр, то они все разные
        return true;
    }
}