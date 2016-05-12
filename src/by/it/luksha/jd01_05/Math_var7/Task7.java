package by.it.luksha.jd01_05.Math_var7;

import java.util.Arrays;
import java.util.Collections;
import static java.lang.Math.*;

public class Task7 {
    public static double[] createCosArray() {

        double[] array = new double[21];

        for (int i = 0; i < 21; i++) {
            double y = 4 * cos((PI/10) * i);
            int round = (int) round(y * 10);
            array[i] = (double) round/10;
        }

        return array;
    }

    public static double[] sortArray(double[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (abs(array[i]) <= i)
                count++;
        }

        Double[] newArray = new Double[count];

        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (abs(array[i]) <= i) {
                newArray[count] = (Double) array[i];
                count++;
            }
        }

        Arrays.sort(newArray, Collections.reverseOrder());

        double[] result = new double [newArray.length];
        for (int i = 0; i < newArray.length; i++) {
            result[i] = (double) newArray[i];
        }

        return result;
    }

    public static void printArrayC(double[] array) {
        int size = (int) ceil(1.0*array.length/5);

        String[][] output = new String[5][size];

        int count = 0;
        for (int col = 0; col < output[0].length; col++) {
            for (int row = 0; row < output.length; row++) {
                if (count < array.length)
                {
                    output[row][col] = "C["+(count+1)+"]"+String.valueOf(array[count]);
                    count++;
                }
                else
                    output[row][col] = "X";
            }
        }
        outArray2D(output);
    }

    public static void printArrayB(double[] array) {
        int size = (int) round(1.0*18/5);

        String[][] output = new String[5][size];

        int count = 0;
        for (int row = 0; row < output.length; row++) {
            for (int col = 0; col < output[0].length; col++) {
                if (count < array.length)
                {
                    output[row][col] = "C["+(count+1)+"]"+String.valueOf(array[count]);
                    count++;
                }
                else
                    output[row][col] = "X";
            }
        }
        outArray2D(output);
    }

    /**
     *Метод выводи двумерный массив в консоль
     * @param array двумерный массив для вывода в консоль
     */
    private static void outArray2D(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%15s", array[i][j]);
            }
            System.out.println();
        }
    }
}
