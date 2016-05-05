package by.it.sinkevich.jd01_03;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        double[] array = InOut.arrayIn();
        //double[] array = {-3.5, 0.4, 16, .7, 100, -77.7, 66.6};
        System.out.println("Минимальный элемент массива: " + Utils.getMin(array));
        System.out.println("Максимальный элемент массива: " + Utils.getMax(array));
        System.out.println("Сортировка массива по возрастанию:");
        InOut.arrayOut(Utils.sortArray(array, true));
        System.out.println("Сортировка массива по убыванию: ");
        InOut.arrayOut(Utils.sortArray(array, false));

        double[][] matrix = InOut.matrixIn();
        /*double[][] matrix = {
                {1.2, -3.5, 1.8, -2.2, -5.3},
                {10, -2.8, 3.2, -2.8, 1.5},
                {2.3, -6.5, -9.2, 6.5, -1.2}
        };*/
        System.out.println("Матрица: ");
        InOut.matrixOut(matrix);
        double[] vector = {1.2, 0.5, 0.8, 2.1, -1.4};
        System.out.println("Вектор: ");
        InOut.arrayOut(vector);
        System.out.println("Результат произведения матрицы на вектор: ");
        double[] result = Utils.matrixMul(matrix, vector);
        InOut.arrayOut(result);
        InOut.closeReader();
    }
}
