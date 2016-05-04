package by.it.sinkevich.jd01_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Util {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    static String getString() throws IOException {
        System.out.println("Введите массив целых чисел через пробел: ");
        return READER.readLine();
    }

    static int getInt() throws IOException {
        return Integer.parseInt(READER.readLine());
    }

    static int[] lineToIntArray(String line) {
        String[] strArray = line.split(" ");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        return intArray;
    }

    static int getNumberLength(int number) {
        String strNumber = String.valueOf(number);
        int length = strNumber.length();
        if (strNumber.charAt(0) == '-') {
            length--;
        }
        return length;
    }

    static void matrixOut(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("[%d,%d] = %-7d", i, j, matrix[i][j]);
            }
            System.out.println();
        }
    }

    static void closeReader() throws IOException {
        READER.close();
    }
}
