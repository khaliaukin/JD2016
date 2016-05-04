package by.it.sergeev.jd01_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

//import static java.util.Objects.isNull;

/**
 * Created by Дмитрий on 02.05.2016.
 */
public class TaskC {
    static int N;

    public static int[][] randomArray() throws IOException {
        System.out.print("Введите размер матрицы:");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(r.readLine());
        Random random = new Random();
        int[][] array = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = random.nextInt(2 * N + 1) - N;//Сгенерировать числа из положительного диапазона, по длине равному диапазону из условия. Т.е. получаем диапазон [0, N+N) = [0, N). Вычесть из каждого полученного числа N, т.е. сдвинуть диапазон на N вправо.
            }
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3s",array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
/*
    public static int sumBetweenPositiveOfArray(int[][] array) {
        if (isNull(array)) {
            throw new IllegalArgumentException();
        }
        int sum = 0;

        for (int i = 0, matrixLength = array.length; i < matrixLength; i++) {
            sum += sumBetweenPositiveOfRow(array[i]);
        }

        return sum;
    }

    private static int sumBetweenPositiveOfRow(int[] row) {
        if (isNull(row)) {
            throw new IllegalArgumentException();
        }

        int sum = 0;
        int a = -1;
        int b = -1;
        int i = 0;
        int rowLength = row.length;

        while ((a == -1 || b == -1) & i < rowLength) {
            if (row[i] > 0) {
                if (a == -1) {
                    a = i;
                } else {
                    b = i;
                }
            }
            i++;
        }

        return sumBetweenTwoElements(row, a, b);
    }

    private static int sumBetweenTwoElements(int[] row, int a, int b) {

        if (isNull(row) || a < -1 || a > row.length || b < -1 || b > row.length || (a > b && b != -1)) {
            throw new IllegalArgumentException();
        }

        if (a == -1 || b == -1) {
            return 0;
        } else {
            int sum = 0;
            for (int i = a; i <= b; i++) {
                sum += row[i];
            }
            return sum;
        }
    }

    public static Object[][] transpone(Object[][] array) {

        Object[][] tmp = new Object[array[0].length][array.length];
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j <array.length; j++) {
                tmp[i][j] = array[j][i];
            }
        }
        return tmp;
    }
}
*/