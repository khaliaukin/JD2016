package by.it.sergeev.jd01_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {
    public static void main (String [] args) throws IOException {
        //А1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длинну.
        String line = "22 34 45 143 853 295 184 24 53 2 53";
        int arr[] = Util.lineToIntArray(line);
        String max = TaskA.getMax(arr);
        System.out.println(max);
        String min = TaskA.getMin(arr);
        System.out.println(min);
        //А2. Вывести на консоль те числа, длина которых меньше среднего арфметического.
        double mean = TaskA.mean(arr);
        System.out.print("Среднее арифметическое " + mean + ". Числа меньше: ");
        for (int i : arr) {
            if (i < mean) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        //А3. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
        for (int i : arr) {
            if (TaskA.uniqueDigits(i)) {
                System.out.println("Число из разных цифр: " + i);
                break;
            }
        }
        //B1. Определить принадлежность некоторого значения k нитервалу [n,m].
        int k = 5;
        TaskB.getAffiliations(k);
        //B2. Вывести числа от 1 до K в виде матрицы N х N слева направо и сверзу вниз.
        int K = 6;
        TaskB.getArray(K);
        //B3. Найти корни квадратного уравнения. Параметры уравнения передавать с командной строкой.
        /**
         * параметры зажаются в Run- Edit Configuration - Program arguments
         *  рекомендуемые 2 -9 10
         */
        System.out.println("Находеним корни квадратного уравнения по формуле ax^2 + bx + c = 0, a != 0");
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        // D = (b * b) - (4 * a * c);
        // 2 корня: D > 0 - 2 корня; 1 корень: D = 0; Нет корне: D < 0.
        if (((b * b) - (4 * a * c)) < 0) {
            System.out.println("Корней нет.");
        }
        double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        {
            if (x1 == x2) {
                System.out.println("Корень один: " + x1);
            } else {
                System.out.println("Корни уравнения x1 = " + x1 + " и x2 = " + x2);
            }
        }
        //B4. Ввести число от 1 до 12. Вывести на консоль название месяца соответствующего данному числу. Осуществить проверку корректности ввода чисел.
        System.out.println("Введите номер месяца от 1 до 12");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int mount = Integer.parseInt(r.readLine());
        if (mount==1)
            System.out.println("January");
        else if (mount==2)
            System.out.println("February");
        else if (mount==3)
            System.out.println("March");
        else if (mount==4)
            System.out.println("April");
        else if (mount==5)
            System.out.println("May");
        else if (mount==6)
            System.out.println("June");
        else if (mount==7)
            System.out.println("July");
        else if (mount==8)
            System.out.println("August");
        else if (mount==9)
            System.out.println("September");
        else if (mount==10)
            System.out.println("October");
        else if (mount==11)
            System.out.println("November");
        else if (mount==12)
            System.out.println("December");
        else
            System.out.println("Вы должны были ввести числа от 1 до 12.");

        //C
        int[][] array = TaskC.randomArray();
        TaskC.printArray(array);

        //array =TaskC.transpone(array);

        //C 1.test
        //System.out.println(TaskC.sumBetweenPositiveOfArray(array));

        //C 2.test
        //System.out.println(TaskC.transpone(array));

    }
}
