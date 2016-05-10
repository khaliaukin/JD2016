package by.it.sergeev.jd01_02;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class TaskC {
    static int N;
    private static int[][] matrix;

    public static int[][] randomArray() throws IOException {
        System.out.print("Введите размер матрицы:");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(r.readLine());
        Random random = new Random();
        matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = random.nextInt(2 * N + 1) - N;//Сгенерировать числа из положительного диапазона, по длине равному диапазону из условия. Т.е. получаем диапазон [0, N+N) = [0, N). Вычесть из каждого полученного числа N, т.е. сдвинуть диапазон на N вправо.
            }
        }
        return matrix;
    }

    public static void printArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3s", matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void sumElements() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > 0 && count != 1) {
                    count++;
                } else if (matrix[i][j] < 0 && count == 1) {
                    sum += matrix[i][j];
                } else if (matrix[i][j] > 0 && count == 1) {
                    break;
                }
            }
        }
        System.out.println(sum);
    }
    public static void transpone() {
        int[][] tran_matrix = new int[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++)  //строка
        {
            for (int col = 0; col < matrix.length; col++) //столбец
            {
                tran_matrix[row][col] = matrix[col][row];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = tran_matrix[i][j];
            }
        }
        System.out.println("Транспонированная матрица: ");
        printArray(matrix);
    }

    public static void rotate () {
        int[][] rotate_matrix = new int[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                rotate_matrix[row][col] = matrix[matrix.length-1-row][col];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] =rotate_matrix[i][j];
            }
        }
        System.out.println("90 градусов: ");
        printArray(matrix);
    }
}
