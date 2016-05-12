package by.it.kust.jd01_04;

/**
 * Created by user_2 on 02.05.2016.
 */
public class Utils {
    /**
     * TaskA1: Поиск корней СЛАУ (метод Жордана-Гаусса)
     * @param mA исходная матрица
     * @param mY исходный вектор
     * @param showSteps показ
     * @return x - последняя колонка с корнями
     */
    public static double[] findRoot(double[][] mA, double[] mY, boolean showSteps){
        int n = mA.length;   //размер системы уравнений
        double[][] m = new double[n][n+1];
        //перенос матрицы mA в операционную мартицу m
        for (int row = 0; row < n; row++)
            for (int col = 0; col < n; col++)
                m[row][col] = mA[row][col];
        //перенос вектора mY в операционную матрицу m
        for (int row = 0; row < n; row++) {
            m[row][n] = mY[row];
        }
        //покажем, если есть показ
        if (showSteps) InOut.arrayPrint2D(m, "m");
        if (showSteps) InOut.arrayPrint2D(m);
        double k;

        //прямой ход
        for (int diag = 0; diag < n-1; diag++)
            for (int row = diag+1; row < n; row++)
            {
                k = m[row][diag]/m[diag][diag];
                for (int col = 0; col < n+1; col++)
                    m[row][col] = m[row][col] - m[diag][col]*k;
            }
        System.out.println("Матрица после прямого хода:");
        InOut.arrayPrint2D(m);

        //найдем детерминант
        System.out.println("Детерминант матрицы = " + findDeterminant(m));

        //обратный ход
        for (int diag = n - 1; diag > 0; diag--)
            for (int row = 0; row < diag; row++)
            {
                k = m[row][diag]/m[diag][diag];
                for (int col = 0; col < n+1; col++)
                    m[row][col] = m[row][col] - m[diag][col]*k;
            }
        System.out.println("Матрица после обратного хода:");
        InOut.arrayPrint2D(m);

        //покажем, если есть показ
        if (showSteps) InOut.arrayPrint2D(m);

        //приведем главную диагональ к 1
        for (int i = 0; i < n; i++) {
            k = 1 / m[i][i];
            for (int j = 0; j < n + 1; j++)
                m[i][j] = m[i][j] * k;
        }
        //покажем, если есть показ
        if (showSteps) InOut.arrayPrint2D(m);
        System.out.println("Матрица с главной диагональю 1:");
        InOut.arrayPrint2D(m);


        //в последней колонке корни, вернем их в качестве результата x
        double[] x = new double[n];
        for (int i = 0; i < n; i++)
            x[i] = m[i][n];
        return x;
    }

    /**
     * Умножение матрицы на вектор
     * @param x исходная матрица
     * @param y исходный вектор
     * @return результат умножения в виде массива
     */
    public static double[] arrayMulVector(double[][] x, double[] y){
        double[] z = new double[x.length];
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < y.length; j++)
                z[i] = z[i] + x[i][j]*y[j];
        return z;
    }

    /**
     * Умножение матрицы на матрицу
     * @param x исходнпя матрицв
     * @param y исходная вторая матрица
     * @return результат умножения в виде новой матрицы
     */
    public static double[][] arrayMulVector(double[][] x, double[][] y){
        double[][] z = new double[x.length][y[0].length];
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < y[0].length; j++)
                for (int k = 0; k < y.length; k++)
                    z[i][j] = z[i][j] + x[i][k]*y[k][j];
        return z;
    }

    /**
     * TaskB: поиск определителя матрицы M
     * @param x - входящая матрица после прямого хода Гаусса
     * @return det - значение детерминанта
     */
    public static double findDeterminant(double[][] x){
        double det = 1;
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++)
                if (i == j) det = det*x[i][j];
        return det;
    }

    public static double[][] inverseMatrix(double[][] m, boolean showSteps){
        int n = m.length;   //размер системы уравнений
        double[][] im = new double[n][n];  //создаем единичную матрицу той же размерности, что и исходная
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (j == i){
                    im[i][j] = 1;   //добавляем 1 в единичную матрицу
                } else im[i][j] = 0;  //добавляем 0 в единичную матрицу

        //покажем, если есть показ
        if (showSteps) InOut.arrayPrint2D(im, "im");
        //if (showSteps) InOut.arrayPrint2D(im);
        double k;

        //прямой ход
        for (int diag = 0; diag < n; diag++)
            for (int row = diag+1; row < n; row++)
            {
                k = m[row][diag]/m[diag][diag];
                for (int col = 0; col < n; col++) {
                    m[row][col] = m[row][col] - m[diag][col] * k; //преобразуем исходную матрицу
                    im[row][col] = im[row][col] - im[diag][col]*k; //одновременно преобразем единичную
                }
            }
        /*System.out.println("Исходная матрица после прямого хода:");
        InOut.arrayPrint2D(m);
        System.out.println("Единичная матрица после прямого хода:");
        InOut.arrayPrint2D(im);*/

        /*//найдем детерминант
        System.out.println("Детерминант исходной матрицы = " + findDeterminant(m));
        System.out.println("Детерминант единичной матрицы = " + findDeterminant(im));*/

        //обратный ход
        for (int diag = n - 1; diag > 0; diag--)
            for (int row = 0; row < diag; row++)
            {
                k = m[row][diag]/m[diag][diag];
                for (int col = 0; col < n; col++) {
                    m[row][col] = m[row][col] - m[diag][col] * k;  //преобразуем исходную матрицу
                    im[row][col] = im[row][col] - im[diag][col] * k;  //одновременно преобразем единичную
                }
            }
        /*System.out.println("Исходная матрица после обратного хода:");
        InOut.arrayPrint2D(m);
        System.out.println("Единичная матрица после обратного хода:");
        InOut.arrayPrint2D(im);*/

        //покажем, если есть показ
        if (showSteps) InOut.arrayPrint2D(m);
        if (showSteps) InOut.arrayPrint2D(im);

        //приведем главную диагональ к 1
        for (int i = 0; i < n; i++) {
            k = 1 / m[i][i];
            for (int j = 0; j < n; j++) {
                m[i][j] = m[i][j] * k;
                im[i][j] = im[i][j]*k;
            }
        }
        //покажем, если есть показ
        if (showSteps) InOut.arrayPrint2D(m);
        if (showSteps) InOut.arrayPrint2D(im);
        /*System.out.println("Исходная матрица после  преобразований с главной диагональю 1:");
        InOut.arrayPrint2D(m);
        System.out.println("Единичная матрица после преобразований:");
        InOut.arrayPrint2D(im);*/

        return im;
    }

}