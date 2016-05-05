package by.it.sergeev.jd01_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

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

    public static int [][] transpone(int[][] array) {


        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j <array.length; j++) {
                array[i][j] = array[j][i];
            }
        }
        System.out.println(array);
        return array;
    }
}
