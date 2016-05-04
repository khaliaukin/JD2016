package by.it.sinkevich.jd01_04;

import by.it.sinkevich.jd01_03.InOut;

public class GaussMethod {

    public static double[] findRoot(double[][] matrix, double[] vectorY, boolean showSteps) {
        int matrixSize = matrix.length;     //размер системы уравнений
        double[][] slau = new double[matrixSize][matrixSize + 1];
        //перенос матрицы matrix в операционную матрицу slau
        for (int row = 0; row < matrixSize; row++) {
            for (int col = 0; col < matrixSize; col++) {
                slau[row][col] = matrix[row][col];
            }
        }
        //перенос вектора vector в операционную матрицу slau
        for (int row = 0; row < matrixSize; row++) {
            slau[row][matrixSize] = vectorY[row];
        }
        //есди показ есть, то покажем
        if (showSteps) {
            System.out.println("Начало вычислений:");
            InOut.matrixOut(slau);
        }
        //коэффициент для обнуления
        double k;
        //прямой ход
        for (int diag = 0; diag < matrixSize - 1; diag++) {
            for (int row = diag + 1; row < matrixSize; row++) {
                k = slau[row][diag] / slau[diag][diag];
                for (int col = 0; col < matrixSize + 1; col++) {
                    slau[row][col] = slau[row][col] - slau[diag][col] * k;
                }
            }
        }
        if (showSteps) {
            System.out.println("Матрица после прямого хода цикла:");
            InOut.matrixOut(slau);
        }
        //обратный ход
        for (int diag = matrixSize - 1; diag > 0; diag--) {
            for (int row = 0; row < diag; row++) {
                k = slau[row][diag] / slau[diag][diag];
                for (int col = 0; col < matrixSize + 1; col++) {
                    slau[row][col] = slau[row][col] - slau[diag][col] * k;
                }
            }
        }
        if (showSteps) {
            System.out.println("Матрица после обратного хода цикла:");
            InOut.matrixOut(slau);
        }
        //приводим главную диагональ к 1
        for (int i = 0; i < matrixSize; i++) {
            k = 1 / slau[i][i];
            for (int j = 0; j < matrixSize + 1; j++) {
                slau[i][j] = slau[i][j] * k;
            }
        }
        if (showSteps) {
            System.out.println("Матрица после приведения диагонали:");
            InOut.matrixOut(slau);
        }
        //в последней колонке корни. Вернём их в качестве результата
        double[] vectorX = new double[matrixSize];
        for (int row = 0; row < matrixSize; row++) {
            vectorX[row] = slau[row][matrixSize];
        }
        return vectorX;
    }

    public static double findDeterminant(double[][] matrix) {
        //создание копии матрицы
        double[][] matrixCopy = new double[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            System.arraycopy(matrix[row], 0, matrixCopy[row], 0, matrix.length);
        }
        //прямой ход
        double k;
        for (int diag = 0; diag < matrixCopy.length - 1; diag++) {
            for (int row = diag + 1; row < matrixCopy.length; row++) {
                k = matrixCopy[row][diag] / matrixCopy[diag][diag];
                for (int col = 0; col < matrixCopy.length; col++) {
                    matrixCopy[row][col] = matrixCopy[row][col] - matrixCopy[diag][col] * k;
                }
            }
        }
        //вычисление детерминанта матрицы
        double determinant = 1;
        for (int diag = 0; diag < matrixCopy.length; diag++) {
            determinant *= matrixCopy[diag][diag];
        }
        return determinant;
    }

    public static double[][] inverseMatrix(double[][] matrix) {
        int matrixSize = matrix.length;     //размер матрицы
        double[][] slau = new double[matrixSize][2 * matrixSize];
        //перенос матрицы matrix в операционную матрицу slau
        for (int row = 0; row < matrixSize; row++) {
            slau[row][matrixSize + row] = 1;    //добавление единичной матрицы для поиска обратной матрицы
            for (int col = 0; col < matrixSize; col++) {
                slau[row][col] = matrix[row][col];
            }
        }
        //коэффициент для обнуления
        double k;
        //прямой ход
        for (int diag = 0; diag < matrixSize - 1; diag++) {
            for (int row = diag + 1; row < matrixSize; row++) {
                k = slau[row][diag] / slau[diag][diag];
                for (int col = 0; col < 2 * matrixSize; col++) {
                    slau[row][col] = slau[row][col] - slau[diag][col] * k;
                }
            }
        }
        //обратный ход
        for (int diag = matrixSize - 1; diag > 0; diag--) {
            for (int row = 0; row < diag; row++) {
                k = slau[row][diag] / slau[diag][diag];
                for (int col = 0; col < 2 * matrixSize; col++) {
                    slau[row][col] = slau[row][col] - slau[diag][col] * k;
                }
            }
        }
        //приводим главную диагональ к 1
        for (int i = 0; i < matrixSize; i++) {
            k = 1 / slau[i][i];
            for (int j = 0; j < 2 * matrixSize; j++) {
                slau[i][j] = slau[i][j] * k;
            }
        }
        //Получаем и возвращаем обратную матрицу
        double[][] reversedMatrix = new double[matrixSize][matrixSize];
        for (int rows = 0; rows < matrixSize; rows++) {
            for (int cols = matrixSize; cols < 2 * matrixSize; cols++) {
                reversedMatrix[rows][cols - matrixSize] = slau[rows][cols];
            }
        }
        return reversedMatrix;
    }
}
