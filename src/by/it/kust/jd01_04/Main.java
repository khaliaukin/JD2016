package by.it.kust.jd01_04;

import java.io.IOException;

/**
 * Created by user_2 on 02.05.2016.
 */
public class Main {
    /**
     * решение СЛАУ методом Жордана-Гаусса с произвольным размером СЛАУ (поиск корней СЛАУ)
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
       //квадратная матрица M коэффициентов СЛАУ
        double m[][] = {
                {2, 5, 4, 1},
                {1, 3, 2, 1},
                {2, 10, 9, 7},
                {3, 8, 9, 2}
        };
        //вектор правых частей Y уравнений СЛАУ
        double y[] = {20, 11, 40, 37};
        System.out.println("квадратная матрица M коэффициентов СЛАУ:");
        InOut.arrayPrint2D(m, "M");
        System.out.println("вектор правых частей Y уравнений СЛАУ:");
        InOut.arrayPrint(y, "Y", y.length);

        double mm[][] = new double[m.length][m[0].length];  //поместим значение исходной матрицы в mm
        for (int i = 0; i < mm.length; i++)
                for (int j = 0; j < mm[0].length; j++)
                        mm[i][j] = m[i][j];

        //TaskA, TaskB: вектор-решение X и детерминант
        double[] x = Utils.findRoot(m, y, false);
        System.out.println("Находим корни X:");
        InOut.arrayPrint(x, "X", x.length);

        //проверка СЛАУ (умножение матрицы M на вектор X)
        System.out.println("Проверка: произведение матрицы коэффициентов M и полученных корней X:");
        InOut.arrayPrint(Utils.arrayMulVector(m, x), "yy", 4);

        //TaskC: обратная матрица
        double[][] inv =Utils.inverseMatrix(m, false);  //создадим обратную матрицу
        System.out.println("обратная матрица:");
        InOut.arrayPrint2D(inv);
        //InOut.arrayPrint2D(Utils.inverseMatrix(m));

        //TaskC: проверка обратной матрицы (умножение исходной матрицы на обратную матрицу inv
        System.out.println("Проверка: умножение исходной матрицы на обратную матрицу:");
        double[][] check = Utils.arrayMulVector(mm, inv);
        InOut.arrayPrint2D(check);
    }
}