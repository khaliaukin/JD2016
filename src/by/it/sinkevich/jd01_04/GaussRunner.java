package by.it.sinkevich.jd01_04;

import by.it.sinkevich.jd01_03.InOut;
import by.it.sinkevich.jd01_03.Utils;

import java.io.IOException;

public class GaussRunner {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите матрицу коэффициентов СЛАУ: ");
        double[][] matrix = InOut.matrixIn();
        /*double[][] matrix = {
                {2, 5, 4, 1},
                {1, 3, 2, 1},
                {2, 10, 9, 7},
                {3, 8, 9, 2}
        };*/
        System.out.println("Введите вектор значений СЛАУ: ");
        double[] vectorY = InOut.arrayIn();
        //double[] vectorY = {20, 11, 40, 37};
        double[] vectorX = GaussMethod.findRoot(matrix, vectorY, true);
        System.out.println("Корни СЛАУ:");
        InOut.arrayOut(vectorX);
        System.out.println("Проверка метода findRoot(умножение матрицы на вектор корней равно вектору значений СЛАУ):");
        double[] rootsCheck = Utils.matrixMul(matrix, vectorX);
        InOut.arrayOut(rootsCheck);
        System.out.println("Детерминант исходной матрицы равен: " + GaussMethod.findDeterminant(matrix));
        System.out.println("Обратная матрица: ");
        double[][] reversedMatrix = GaussMethod.inverseMatrix(matrix);
        InOut.matrixOut(reversedMatrix);
        System.out.println("Проверка обратной матрицы(умножение исходной на обратную равно единичной): ");
        double[][] resultCheck = Utils.matrixMul(matrix, reversedMatrix);
        InOut.matrixOut(resultCheck);
        InOut.closeReader();
    }
}
