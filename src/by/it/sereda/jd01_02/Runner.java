package by.it.sereda.jd01_02;

import java.io.IOException;

public class Runner {
    public static void main (String[] args) throws IOException {
        //прочитаем линию значений с клавиатуры
        //String line=sereda.j01_02.Util.getOneLine();
        String line="11 22 343 123 67 456 333 22 853";
        //получим массив чисел с которым будем работать;
        int arr[]= Util.lineToIntArray(line);
        //1. Найти самое короткое и самое длинное число.
        // Вывести найденные числа и их длину.
        String max= TaskA.getMax(arr);
        System.out.println(max);
        String min= TaskA.getMin(arr);
        System.out.println(min);

        //2. Вывести на консоль те числа, длина которых меньше (больше) средней.
        double mean= TaskA.mean(arr);
        System.out.println("Числа длина которых меньше средней "+mean+" таковы: ");
        for (Integer i:arr) {
            if (i.toString().length()<mean) {
                System.out.println(i+" ");
            }
        }
        System.out.println();
        //3. Найти число, состоящее только из различных цифр.
        //Если таких чисел несколько, найти первое из них.
        for (int i:arr) {
            if (TaskA.uniqueDigits(i)) {
                System.out.println("Найдено число из разных цифр: "+i);
                break; //больше ничего не ищем

            }
        }

        //1.Определить принадлежность некоторого значения k интервалу [n, m].
        System.out.println("\tВведите значение K, границ интервала N, M, через пробел");
        System.out.println("\tи нажмите Enter");
        String lineknm=Util.getOneLine();
        int arrknm[]=Util.lineToIntArray(lineknm);
        int knmselector=TaskB.belongsToInterval(arrknm);
        switch (knmselector) {
            case 1:
                System.out.println("Значение K принадлежит заданному интервалу");
                break;
            case 0:
                System.out.println("Значение K не принадлежит заданному интервалу");
                break;
            default:
                System.out.println("Интервал задан неверно");
        }

        //2.
        TaskB.matrixKNNInLine(arrknm);
        TaskB.matrixKNNInArray(arrknm);



        //3.
        System.out.print("\t Введите значения коэффициентов квадратного уравнения через пробел,");
        System.out.print("\t a b c, соответственно, и нажмите Enter:");
        String lineabc= Util.getOneLine();
        double arrayabcin[]= Util.lineToDoubleArray(lineabc);
        TaskB.quadEquation(arrayabcin);


        //4. Ввести число от 1 до 12. Вывести на консоль название месяца,
        //  соответствующего данному числу. Осуществить проверку корректности
        //  ввода чисел.
        String[] monthsnames = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"} ;
        System.out.println("\tВведите номер месяца");
        String monthline= Util.getOneLine();
        int monthnumb[]= Util.lineToIntArray(monthline);
        TaskB.monthNumber (monthsnames,monthnumb);
    }
}