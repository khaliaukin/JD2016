package by.it.sinkevich.jd01_03;

public class Utils {

    static double[] sortArray(double[] array, boolean direction) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if ((array[j] > array[j + 1] && direction) ||
                        (array[j] < array[j + 1] && !direction)) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    static double getMax(double[] numbers) {
        double max = Double.MIN_VALUE;
        for (double num : numbers) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    static double getMin(double[] numbers) {
        double min = Double.MAX_VALUE;
        for (double num : numbers) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    public static double[][] matrixMul(double[][] x, double[][] y) {
        double[][] matrix = new double[x.length][y[0].length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y[0].length; j++) {
                for (int k = 0; k < y.length; k++) {
                    matrix[i][j] += x[i][k] * y[k][j];
                }
            }
        }
        return matrix;
    }

    public static double[] matrixMul(double[][] x, double[] y) {
        double[] vector = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                vector[i] += x[i][j] * y[j];
            }
        }
        return vector;
    }
}
