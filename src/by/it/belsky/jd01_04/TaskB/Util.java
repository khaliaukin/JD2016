package by.it.belsky.jd01_04.TaskB;

import by.it.belsky.jd01_04.TaskA.InOut;

/**
 * r
 * Created by misha on 05.05.2016.
 */
public class Util {

    public static void Matrix(double[][] m, boolean Showsteps) {

        int n = m.length;
//        double [][]m=new double[n][n];
//        for (int row = 0; row < n; row++)
//            for (int col = 0; col < n; col++)
//                m[row][col] = mB[row][col];
        double k;
        for (int diag = 0; diag < n - 1; diag++) {
            for (int row = diag + 1; row < n; row++) {
                k = m[row][diag] / m[diag][diag];
                for (int col = 0; col < n + 1; col++)
                    m[row][col] = m[row][col] - m[diag][col] * k;
            }
        }
        Util.arrayPrint2D(m, "m");
    }

    public static double determinant(double[][] m) {

        double D = 1.0;
        for (int diag = 0; diag < m.length; diag++) {
            D = D * m[diag][diag];

        }

        System.out.println("Определитель матрицы D= " + D);
        return D;
    }

    public static void arrayPrint2D(double[][] m, String name) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++)
                System.out.printf(name + "[%1d,%1d]=%-6.1f ", i, j, m[i][j]);
            System.out.println();
        }
        System.out.println();
    }
}
