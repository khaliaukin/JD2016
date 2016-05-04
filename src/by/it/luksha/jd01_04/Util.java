package by.it.luksha.jd01_04;

public class Util {

    /**
     *Метод сортирует одномерный массив
     * @param array одномерный массив для сортировки
     * @param up флаг указывающий на восходящую сортировку (true) или нисходящую (false)
     * @return отсортированый массив
     */
    public static double[] sortArray1D(double[] array, boolean up) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((up && (array[j] > array[i])) || (!up && (array[j] < array[i])))
                {
                    double a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }
        return array;
    }

    /**
     *Метод ищет минимальный элемент одномерного массива
     * @param array одномерный масив для поиска
     * @return минимальное значение среди элементов массива
     */
    public static double minimalElementOfArray1D(double[] array) {
        double minimal = Double.MAX_VALUE;
        for (double element: array) {
            minimal = (minimal < element) ? minimal : element;
        }
        return minimal;
    }

    /**
     *Метод ищет максимальный элемент одномерного массива
     * @param array одномерный массив для поиска
     * @return максимальное значение среди элементов массива
     */
    public static double maximalElementOfArray1D(double[] array) {
        double maximal = Double.MIN_VALUE;
        for (double element: array) {
            maximal = (maximal > element) ? maximal : element;
        }
        return maximal;
    }

    /**
     *Метод умножает матрицу на матрицу
     * @param matrixA первая матрица MxN
     * @param matrixB вторая матрица NxQ
     * @return матрица-произведение первой на вторую матриц MxQ
     */
    public static double[][] multiplyMatrixOnMatrix(double[][] matrixA, double[][] matrixB) {
        double[][] matrixResult = new double[matrixA.length][matrixB[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int r = 0; r < matrixB.length; r++) {
                    matrixResult[i][j] += matrixA[i][r] * matrixB[r][j];
                }
            }
        }
        return matrixResult;
    }

    /**
     * Метод умножает матрицу на вектор
     * @param matrix матрица MxN
     * @param vector вектор Nx1
     * @return вектор-произведение
     */
    public  static double[] multiplyMatrixOnVector(double[][] matrix, double[] vector) {
        int m = matrix.length;
        int n = matrix[0].length;
        double[] result = new double[vector.length];
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                result[row] = result[row] + vector[col]*matrix[row][col];
            }
        }
        return result;
    }

    /**
     *Метод решает СЛАУ методом Гаусса
     * @param matrixX матрица коэфициентов СЛАУ
     * @param vectorY вектор значений СЛАУ
     * @param showSteps флаг показывать шаги работы алгоритма
     * @return вектор решений СЛАУ
     */
    public static double[] findRoot(double[][] matrixX, double[] vectorY, boolean showSteps) {
        int n = matrixX.length;
        double[][] matrix = new double[n][n+1];

        //добавляем в матрицу уравнений значения из матрицы Х
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row][col] = matrixX[row][col];
            }
        }

        //добавляем в матрицу уравнений значения из вектора У
        for (int row = 0; row < n; row++) {
            matrix[row][n] = vectorY[row];
        }

        if (showSteps) InOut.outArray2D(matrix, "A");

        double k;
        //Прямой ход по матрице
        for (int diag = 0; diag < n - 1; diag++) {
            for (int row = diag + 1; row < n; row++) {
                k = matrix[row][diag]/matrix[diag][diag];
                for (int col = 0; col < n + 1; col++) {
                    matrix[row][col] = matrix[row][col] - matrix[diag][col] * k;
                }
            }
        }

        if (showSteps) InOut.outArray2D(matrix, "A");

        //Обратный ход по матрице
        for (int diag = n - 1; diag > 0; diag--) {
            for (int row = 0; row < diag; row++) {
                k = matrix[row][diag]/matrix[diag][diag];
                for (int col = 0; col < n + 1; col++) {
                    matrix[row][col] = matrix[row][col] - matrix[diag][col] * k;
                }
            }
        }

        if (showSteps) InOut.outArray2D(matrix, "A");

        //Приводим главную диагональ к 1
        for (int i = 0; i < n; i++) {
            k = 1/matrix[i][i];
            for (int j = 0; j < n + 1; j++) {
                matrix[i][j] = matrix[i][j] * k;
            }
        }

        if (showSteps) InOut.outArray2D(matrix, "A");

        double[] vectorX = new double[n];
        for (int i = 0; i < n; i++) {
            vectorX[i] = matrix[i][n];
        }

        return vectorX;
    }

    /**
     *Метод ищет детерминант (определитель) матрицы
     * @param matrix квадратная матрица
     * @return детерминат (определитель) матрицы
     */
    public static double findDeterminate(double[][] matrix) {
        int n = matrix.length;
        double det = 1;

        //Приводим матрицу к верхнетреугольному виду
        double k;
        for (int diag = 0; diag < n - 1; diag++) {
            for (int row = diag + 1; row < n; row++) {
                k = matrix[row][diag]/matrix[diag][diag];
                for (int col = 0; col < n; col++) {
                    matrix[row][col] = matrix[row][col] - matrix[diag][col] * k;
                }
            }
        }

        //Детерминант равен произведению элементов главной диагонали
        for (int diag = 0; diag < n; diag++) {
            det *= matrix[diag][diag];
        }


        return det;
    }

    /**
     * Нахождение обратной матрицы (Если справа к квадратной матрице дописать единичную матрицу того же порядка и с помощью элементарных преобразований над строками преобразовать полученную матрицу так, чтобы начальная матрица стала единичной, то матрица полученная из единичной будет обратной матрицей к исходной.)
     * @param matrix матрица NxN
     * @return обратная матрица
     */
    public static double[][] inverseMatrix(double[][] matrix) {
        int n = matrix.length;

        //делаем копию входной матрицы для преобразований
        double[][] detM = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                detM[i][j] = matrix [i][j];
            }
        }


        double[][] matrixE = new double[n][n]; //допишем единичную матрицу

        //заполняем единичную матрицу единицами по диагонали
        for (int diag = 0; diag < n; diag++) {
            matrixE[diag][diag] = 1;
        }

        //проверяем детерминант
        double det = findDeterminate(detM);
        if (det != 0)
        {
            //приводим к верхнетреугольному виду (ниже главной диагонали нули)
            double k;
            for (int diag = 0; diag < n - 1; diag++) {
                for (int row = diag + 1; row < n; row++) {
                    k = matrix[row][diag]/matrix[diag][diag];
                    for (int col = 0; col < n; col++) {
                        matrix[row][col] = matrix[row][col] - matrix[diag][col] * k;
                        matrixE[row][col] = matrixE[row][col] - matrixE[diag][col] * k;
                    }
                }
            }

            //приводим к нижнетреугольному виду (выше главной диагонали нули)
            for (int diag = n - 1; diag > 0; diag--) {
                for (int row = 0; row < diag; row++) {
                    k = matrix[row][diag]/matrix[diag][diag];
                    for (int col = 0; col < n; col++) {
                        matrix[row][col] = matrix[row][col] - matrix[diag][col] * k;
                        matrixE[row][col] = matrixE[row][col] - matrixE[diag][col] * k;
                    }
                }
            }

            //Приводим главную диагональ к 1
            for (int i = 0; i < n; i++) {
                k = 1/matrix[i][i];
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = matrix[i][j] * k;
                    matrixE[i][j] = matrixE[i][j] * k;
                }
            }
        }
        else
        {
            System.out.println("Обратной матрицы не существует");
            return null;
        }

        return matrixE;
    }

}
