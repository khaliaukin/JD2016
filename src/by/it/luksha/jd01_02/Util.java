package by.it.luksha.jd01_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {
    /**
     * Метод обрабатывает строку из консоли
     * @return строка
     * @throws IOException
     */
    /*public static String getLine() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        bufferedReader.close();

        return line;
    }*/

    /**
     * Метод парсит строку в массив целых чисел
     * @param line строка с числами типа int через пробел
     * @return массив int
     */
    public static int[] stringToArrayInt(String line) {
        line = line.trim();
        String[] strArr = line.split(" ");
        int[] intArr = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        return intArr;
    }

    /**
     *Метод выводит в консоль двумерный массив
     * @param array двумерный массив int для вывода в консоль
     */
    public static void outArray2D(int[][] array) {
        for (int[] col : array) {
            for (int element : col)
                System.out.printf("[%4d]", element);
            System.out.println();
        }
    }

    /**
     *Метод выводит в консоль двумерный массив
     * @param array двумерный массив double для вывода в консоль
     */
    public static void outArray2D(double[][] array) {
        for (double[] col : array) {
            for (double element : col)
                System.out.printf("[%5.2f]", element);
            System.out.println();
        }
    }

    /**
     * Метод проверяет вхождение элемента в массив
     * @param matrix массив
     * @param toLook элемент
     * @return входит/не_входит
     */
    public static boolean isHas(int[] matrix, int toLook) {
        boolean isHas = false;
        for (int element: matrix) {
            if (element == toLook)
                isHas = true;
        }

        return isHas;
    }

}
