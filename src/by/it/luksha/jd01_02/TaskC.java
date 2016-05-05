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
     * Метод создает матрицу произвольного размера и заполняет значениями от -5 до +5
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

    /**
     * Метод ищет максимальный элемент в матрице произвольного размера и удаляет строки и столбцы его содержащие
     * @param matrix матрица для поиска
     */
    public static void matrixWithoutMax(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int maxElement = Integer.MIN_VALUE;
        String strForNewMatrix = "";

        //ищем максимальный элемент в матрице
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maxElement = maxElement > matrix[i][j] ? maxElement : matrix[i][j];
            }
        }

        //получаем строку элементов через пробел не стоящих в одной строке/столбце с максимальных значением
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean isDelete = true;

                if (matrix[i][j] != maxElement)
                {
                    for (int k = 0; k < n; k++) {
                        if (matrix[i][k] != maxElement)
                        {
                            for (int l = 0; l < m; l++) {
                                if (matrix[l][j] != maxElement)
                                {
                                    isDelete = false;
                                }
                                else
                                {
                                    isDelete = true;
                                    break;
                                }
                            }
                        }
                        else
                        {
                            isDelete = true;
                            break;
                        }
                    }
                }
                else
                    isDelete = true;

                if (!isDelete)
                    strForNewMatrix = strForNewMatrix + " " + matrix[i][j];
            }
        }

        //находим размер новой матрицы
        int newRow = m;
        int newCol = n;
        for (int i = 0; i < m; i++) {
            if (Util.isHas(matrix[i], maxElement))
                newRow--;
        }

        for (int i = 0; i < n; i++) {
            int[] array = new int[m];
            for (int j = 0; j < m; j++) {
                array[j] = matrix[j][i];
            }
            if (Util.isHas(array, maxElement))
                newCol--;
        }

        if (newRow == 0 && newCol == 0)
        {
            System.out.println("Такой матрицы не существует");
        }
        else
        {
            int[] forNewMatrix = Util.stringToArrayInt(strForNewMatrix); //массив для заполнения итоговой матрицы

            int[][] result = new int[newRow][newCol]; //итоговая матрица

            //заполняем матрицу результат
            int k = 0;
            for (int i = 0; i < newRow; i++) {
                for (int j = 0; j < newCol; j++) {
                    result[i][j] = forNewMatrix[k];
                    k++;
                }
            }
            System.out.println("Матрица без максимального элемента \"" + maxElement + "\" имеет вид:");
            Util.outArray2D(result);
        }
    }

}
