package by.it.smirnova.jd01_04;

/**
 * Created by Evgenia on 01.05.2016.
 */
public class Utils {

    /**
     * @param mas Исходный массив
     * @param upDirection если true то по-возрастанию, если false то по-убыванию
     * @return
     */

    public static double[] sortDoubleArray(double[] mas, boolean upDirection) {

        for (int i = 0; i < mas.length - 1; i++)

            for (int j = i + 1; j < mas.length; j++)

                if ((upDirection && mas[i] > mas[j]) ||

                        (!upDirection && mas[i] < mas[j]))

                {
                    double m = mas[i];

                    mas[i] = mas[j];

                    mas[j] = m;
                }

        return mas;
    }

    /**
     * Поиск максимума для массива INT
     * @param mas - одномерный массив
     * @return максимум или Integer.MAX_VALUE если массив пустой
     */
    public static double maxDoubleArray(double[] mas) {

        if (0 == mas.length) {

            return Double.MAX_VALUE;
        } else {

            double max = mas[0];

            for (double m : mas) {

                if (max < m) max = m;
            }
            return max;
        }

    }
    /**
     * Поиск минимума для массива INT
     * @param mas - одномерный массив
     * @return минимум или Integer.MIN_VALUE если массив пустой
     */

    public static double minDoubleArray(double[] mas) {

        if (0 == mas.length) {

            return Double.MIN_VALUE;
        } else {

            double min = mas[0];

            for (double m : mas) {

                if (min > m) min = m;
            }
            return min;
        }

    }

    public static double[] arrayMulVector(double[][] x, double[] y) {

        double[] z = new double[x.length];

        for (int i = 0; i < x.length; i++)

            for (int j = 0; j < y.length; j++)

                z[i] = z[i] + x[i][j] * y[j];

        return z;
    }

    public static double[][] arrayMulVector(double[][] x, double[][] y) {

        double[][] z = new double[x.length][y[0].length];

        for (int i = 0; i < x.length; i++)

            for (int j = 0; j < y[0].length; j++)

                for (int k = 0; k < y.length; k++)

                    z[i][j] = z[i][j] + x[i][k] * y[k][j];

        return z;
    }

    public static double[] findRoot(double[][] mA, double[] mY, boolean showSteps) {

        int n = mA.length;

        double[][] m = new double[n][n + 1];

        for (int row = 0; row < n; row++)

            for (int col = 0; col < n; col++)

                m[row][col] = mA[row][col];

        for (int row = 0; row < n; row++)

            m[row][n] = mY[row];

        if (showSteps) InOut.arrayPrint2D(m, "m");

        if (showSteps) InOut.arrayPrint2D(m);

        double k;

        for (int diag = 0; diag < n - 1; diag++) {

            for (int row = diag + 1; row < n; row++) {

                k = m[row][diag] / m[diag][diag];

                for (int col = 0; col < n + 1; col++)

                    m[row][col] = m[row][col] - m[diag][col] * k;
            }
        }

        for (int diag = n - 1; diag > 0; diag--) {

            for (int row = 0; row < diag; row++) {

                k = m[row][diag] / m[diag][diag];

                for (int col = 0; col < n + 1; col++)

                    m[row][col] = m[row][col] - m[diag][col] * k;
            }

            if (showSteps) InOut.arrayPrint2D(m);
        }


        for(int i = 0; i<n; i++)
        {

            k = 1 / m[i][i];

            for (int j = 0; j < n + 1; j++)

                m[i][j] = m[i][j] * k;
        }

        if (showSteps) InOut.arrayPrint2D(m);

        double[] x = new double[n];

        for( int i = 0; i < n; i++)

            x[i]=m[i][n];

        return x;
    }
}







