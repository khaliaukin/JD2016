package by.it.starotitorov.jd01_02;

import java.io.IOException;

/**
 * Created by Vasiliy Starotitorov on 04.05.2016.
 */
public class TaskB_2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Вывод матрицы от 1 до k");
        int number = 17;
        TaskB_2.matrix(number);
    }
    public static void matrix(int number) {
        int size = 1;
        while ((size * size) < number) {
            size++;
        }
        size = 1;
        while ((size * size) < number) {
            size++;
        }
        int count = 1;
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (count <= number) {
                    array[i][j] = count;
                    count++;
                } else
                    array[i][j] = 0;
            }
        }
        System.out.println("Для числа - " + number + " матрица:");
        for (int[] element : array) {
            for (int out : element) {
                System.out.printf("%4d", out);
            }
            System.out.println();
        }}
}