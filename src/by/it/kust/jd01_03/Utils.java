package by.it.kust.jd01_03;

/**
 * Created by User on 01.05.2016.
 */
public class Utils {
    //поиск максимума для масива INT, mas - одномерный массив
    //возвращает максимум или Integer.MAX_VALUE если массив пустой
    public static double maxDblArray(double[] mas) {
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

    //поиск минимума для масива INT, mas - одномерный массив
    //возвращает минимум или Integer.MIN_VALUE если массив пустой
    public static double minDblArray(double[] mas) {
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

    //пузырьковая сортировка, mas - Исходный массив
    //upDirection если true то по возрастанию, если false то по убыванию
    public static double[] sortIntArray(double[] mas, boolean upDirection) {
        for (int i = 0; i < mas.length-1; i++)
            for (int j = i+1; j < mas.length; j++)
                if ((upDirection && mas[i] > mas[j]) ||
                        (!upDirection && mas[i] < mas[j]))
                {
                    double m = mas[i];
                    mas[i] = mas[j];
                    mas[j] = m;
                }
        return mas;
    }

    //умножение матрицы на вектор и на матрицу
    public static double[] arrayMulVector(double[][] x, double[] y) {
        double[] z = new double[x.length];
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < y.length; j++)
                z[i] = z[i] + x[i][j]*y[j];
        return z;
    }
    public static double[][] arrayMulVector(double[][] x, double[][] y) {
        double[][] z = new double[x.length][y[0].length];
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < y[0].length; j++)
                for (int k = 0; k < y.length; k++)
                    z[i][j] = z[i][j] + x[i][k]*y[k][j];
        return z;
    }
}
