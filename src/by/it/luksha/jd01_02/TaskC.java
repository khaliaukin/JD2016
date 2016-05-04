package by.it.luksha.jd01_02;

import java.util.Random;

public class TaskC {

    /**
     *Метод создает квадратную матрицу size*size и заполняет случайным образом значениями от -size до +size
     * @param size размер квадратной матрицы
     * @return квадратная матрица
     */
    public static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = rand.nextInt((size - (-size)) + 1) + (-size);
            }
        }
        return matrix;
    }

    /**
     * Метод создает матрицу произвольного размера
     * @param row число строк
     * @param col число столбцов
     * @return матрица
     */
    public static int[][] createMatrix(int row, int col) {
        int[][] matrix = new int[row][col];
        Random rand = new Random();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = rand.nextInt((5 - (-5)) + 1) + (-5);
            }
        }
        return matrix;
    }


    /**
     *Метод ищет суммы элементов между первым и вторым положительными элементами в строках матрицы и выводит в их в консоль
     * @param matrix квадратная матрица для поиска
     */
    public static void searchSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean isHas = false;

        for (int i = 0; i < m; ) {
            for (int j = 0; j < n; ) {
                if (matrix[i][j] >= 0)
                {
                    int sum = 0;
                    for (int k = j + 1; k < n; k++) {
                        if (matrix[i][k] >= 0)
                        {
                            if (sum != 0)
                            {
                                System.out.println("В строке: " + (i+1) + ", сумма: " + sum);
                                isHas = true;
                                break;
                            }
                            else
                                i++;
                            break;
                        }
                        else
                        {
                            sum += matrix[i][k];
                        }
                    }
                    break;
                }
                else
                    j++;
            }
            i++;
        }

        if (!isHas)
            System.out.println("Подходящие строки отсутствуют.");
    }

    /**
     *Транспонирует произвольную матрицу MxN
     * @param matrix исходная матрица MxN
     * @return транспонированная матрица NxM
     */
    public static int[][] transposeMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] matrixTransposed = new int[n][m];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                matrixTransposed[i][j] = matrix[j][i];
            }
        }

        return matrixTransposed;
    }

    /**
     *Метод поворачивает на 90 градусов против часов стрелки матрицу MxN
     * @param matrix матрица для поворота MxN
     * @return повернутая матрица NxM
     */
    public static int[][] rotate90right(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] rotatedMatrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rotatedMatrix[i][j] = matrix[j][(n-1)-i];
            }
        }

        return rotatedMatrix;
    }


    /**
     *Метод вычитает из элементов каждой строки исходной матрицы ее среднее арифметическое
     * @param matrix матрица MxN для преобразования
     * @return матрица преобразованных элементов типа double
     */
    public static double[][] newSubMeanMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        double[][] resultMatrix = new double[m][n];

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }

            double mean = 1.0*sum/n;
            System.out.println("Среднее арифметическое для строки " + (i+1) + " = " + mean);

            for (int j = 0; j < n; j++) {
                resultMatrix[i][j] = matrix[i][j] - mean;
            }
        }

        return resultMatrix;
    }


    /*public static int[][] matrixWithoutMax(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int maxElement = Integer.MIN_VALUE;
        String strForNewMatrix = "Data:";

        //ищем максимальный элемент в матрице
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maxElement = maxElement > matrix[i][j] ? maxElement : matrix[i][j];
            }
        }
        //===========================================


        System.out.println(strForNewMatrix);
        return null;
    }*/


}
