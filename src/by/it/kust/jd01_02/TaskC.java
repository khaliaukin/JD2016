package by.it.kust.jd01_02;

import java.io.IOException;

/**
 * Created by User on 28.04.2016.
 */
public class TaskC {
    static void beginTaskC() throws IOException {
        System.out.println("Задание C: Введите целое число n - размерность матрицы a [n] [n]");
        String s1 = Util.getOneLine();
        int s = Integer.parseInt(s1);
        double[][] mm = new double[s][s];
        Util.arrayRandomPrint2D(mm);   //заполняем массив случ.числами и печатаем элементы

        //Задание С1: Найти сумму элементов матрицы, расположенных между первым и
        // вторым положительными элементами каждой строки.
        int p1 = 0;  //для хранения индекса первого положительного
        int p2;      //для хранения индекса второго положительного
        int c = 0;   //счетчик положительных чисел
        double sum = 0;
        for (int i = 0; i < mm.length; i++){
            for (int j = 0; j < mm[i].length; j++) {
                if (mm[i][j] > 0 && c <= 2) {
                    c = c + 1;
                    if (c == 1) p1 = j;
                    if (c == 2) {
                        p2 = j;
                        for (j = (p1 + 1); j < p2; j++){
                            sum = sum + mm[i][j];
                        }
                        System.out.println("Задание С1. Сумма элементов между первыми " +
                                "двумя положительными элиентами " + i + "-й строки:" + sum);
                        }
                }
            }
            c = 0;
            sum = 0;
        }

        //Задание С2: Транспонировать матрицу (заменить строки на столбцы).
        System.out.println("Задание С2. Транспонированная матрица:");
        Util.transposedMatrix(mm);

        //Задание С3: Повернуть матрицу на 90 градусов против часовой стрелки.
        //double [][] pov = new double[mm.length][mm[0].length];
        System.out.println("Задание С3. Повернули матрицу на 90 градусов против часовой стпелки:");
        int ss = mm.length;
        for (int i = 0; i < (ss/2); i++ ){
            for (int j = i; j < (ss-1-i); j++){
                double t = mm[i][j];
                mm[i][j] = mm[j][ss-1-i];
                mm[j][ss-1-i] = mm[ss-1-i][ss-1-j];
                mm[ss-1-i][ss-1-j] = mm[ss-1-j][i];
                mm[ss-1-j][i] = t;
            }
        }
        Util.arrayPrint(mm);

        //Задание С4: Построить матрицу, вычитая из элементов каждой строки
        // матрицы ее среднее арифметическое.
        double sred = Util.srAriphm(mm);
        System.out.println("Задание С4. Вычли из элементов каждой строки матрицы ее среднее арифметическое = " + sred);
        for (int i=0; i<mm.length; i++){
            for (int j=0; j<mm[0].length; j++) {
                mm[i][j] = mm[i][j] - sred;
                System.out.printf("[%1d,%1d]=%-6.2f ", i, j, mm[i][j]);
            }
            System.out.println();
        }




    }
}
