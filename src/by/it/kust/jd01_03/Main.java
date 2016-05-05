package by.it.kust.jd01_03;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        String line = InOut.consoleReadLine();
        //String line = "71 12 14 789 6 565 76 712";
        double v[] = InOut.stringLineToDblArray(line);

        System.out.println("Массив v");
        InOut.arrayPrint(v, "v", 5);

        v = Utils.sortIntArray(v, true);
        System.out.println("Массив v отсортированный по возврастанию");
        InOut.arrayPrint(v, "v", 5);

        v = Utils.sortIntArray(v, false);
        System.out.println("Массив v отсортированный по убыванию");
        InOut.arrayPrint(v, "v", 5);

        System.out.println("Максимум массива Max = " + Utils.maxDblArray(v));
        System.out.println("Минимум массива Min = " + Utils.minDblArray(v));


        double m[][] = {
                {2, 5, 4, 1},
                {1, 3, 2, 1},
                {2, 10, 9, 7},
                {3, 8, 9, 2}
        };
        double m2[][] = {
                {3, 0, 1, 9},
                {0, 0, 0, 0},
                {1, 5, 2, 4},
                {8, 3, 4, 5}
        };
        InOut.arrayPrint2D(m);
        InOut.arrayPrint2D(m2, "m");
        //поместим в mm произведение двух матриц:
        double[][] mm = new double[4][4];
        mm = Utils.arrayMulVector(m, m2);
        //выведем их произведение в консоль:
        System.out.println("Произведение двух матриц:");
        InOut.arrayPrint2D(mm, "mm");
    }
}
