package by.it.sinkevich.jd01_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InOut {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

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

    public static void closeReader() throws IOException {
        READER.close();
    }

    public static void arrayOut(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d] = %-7.2f ", i, array[i]);
        }
        System.out.println();
    }

    public static void matrixOut(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("[%d,%d] = %-7.2f ", i, j, matrix[i][j]);
            }
            System.out.println();
        }
    }
}
