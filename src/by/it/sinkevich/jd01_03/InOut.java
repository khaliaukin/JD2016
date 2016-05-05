package by.it.sinkevich.jd01_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Класс для ввода и вывода одномерных и двумерных массивов
 */
public class InOut {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Ввод с консоли одномерного массива типа {@code double}
     * @return одномерный массив
     * @throws IOException
     */
    public static double[] arrayIn() throws IOException {
        System.out.println("Введите строку элементов через пробел:");
        String line = READER.readLine();

        String[] strValues = line.trim().split(" ");
        double[] values = new double[strValues.length];
        for (int i = 0; i < strValues.length; i++) {
            values[i] = Double.parseDouble(strValues[i]);
        }
        return values;
    }

    /**
     * Ввод с консоли двумерного массива типа {@code double}
     * @return двумерный массив
     * @throws IOException
     */
    public static double[][] matrixIn() throws IOException {
        System.out.print("Введите количество строк матрицы: ");
        int count = Integer.parseInt(READER.readLine());
        double[][] matrix = new double[count][];
        for (int i = 0; i < count; i++) {
            System.out.print("Строка номер " + (i + 1) + ": ");
            String line = READER.readLine();
            String[] strValues = line.trim().split(" ");
            double[] values = new double[strValues.length];
            for (int j = 0; j < strValues.length; j++) {
                values[j] = Double.parseDouble(strValues[j]);
            }
            matrix[i] = values;
        }
        return matrix;
    }

    /**
     * Метод закрывает поток ввода, должен вызываться после окончания работы с классом
     * @throws IOException
     */
    public static void closeReader() throws IOException {
        READER.close();
    }

    /**
     * Выводит одномерный массив на консоль
     * @param array массив типа {@code double}
     */
    public static void arrayOut(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d] = %-7.2f ", i, array[i]);
        }
        System.out.println();
    }

    /**
     * Выводит матрицу на консоль
     * @param matrix матрица типа {@code double}
     */
    public static void matrixOut(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("[%d,%d] = %-7.2f ", i, j, matrix[i][j]);
            }
            System.out.println();
        }
    }
}
