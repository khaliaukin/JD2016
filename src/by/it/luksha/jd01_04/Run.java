package by.it.luksha.jd01_04;
public class Run {
    public static void main(String[] args) {

        System.out.println("====================================================================");
        System.out.println("Реализуйте статические методы ввода-вывода для одномерных и двумерных массивов типа double.");
        System.out.println("====================================================================");
        System.out.printf("%s%n", "Одномерный массив:");
        double[] array1D = InOut.inArray1D("1 0 2 5 7 8 1 2 4 6 8");
        InOut.outArray1D(array1D, "A");
        System.out.println();

        System.out.printf("%s%n", "Двумерный массив:");
        double[][] array2D = InOut.inArray2D(2, 2, "1 2 3 4");
        InOut.outArray2D(array2D, "A");
        System.out.println();

        System.out.println("====================================================================");
        System.out.println("Реализуйте статические методы для сортировки одномерных массивов типа double.");
        System.out.println("====================================================================");
        System.out.printf("%s%n", "Восходящая сортировка одномерного массива:");
        InOut.outArray1D(Util.sortArray1D(array1D, true), "A");
        System.out.println();
        System.out.printf("%s%n", "Нисходящая сортировка одномерного массива:");
        InOut.outArray1D(Util.sortArray1D(array1D, false), "A");
        System.out.println();
        System.out.println();

        System.out.println("====================================================================");
        System.out.println("Реализуйте статические методы для поиска минимального и максимального значения в одномерном массиве для типа double.");
        System.out.println("====================================================================");
        System.out.printf("%s%n", "Одномерный массив:");
        InOut.outArray1D(array1D, "A");
        System.out.println();
        System.out.println("Минимум = [" + Util.minimalElementOfArray1D(array1D) + "]");
        System.out.println("Максимум = [" + Util.maximalElementOfArray1D(array1D) + "]");
        System.out.println();

        System.out.println("====================================================================");
        System.out.println("Реализуйте умножение матрицы на вектор, матрицы на матрицу для типа double.");
        System.out.println("====================================================================");

        System.out.printf("%s%n", "Умножение матрицы A:");
        double[][] matrixA = InOut.inArray2D(3, 2, "1 2 3 4 5 6");
        InOut.outArray2D(matrixA, "A");
        System.out.printf("%s%n", "На матрицу B:");
        double[][] matrixB = InOut.inArray2D(2, 4, "1 2 3 4 5 6 7 8");
        InOut.outArray2D(matrixB, "B");
        System.out.println("Произведение:");
        InOut.outArray2D(Util.multiplyMatrixOnMatrix(matrixA, matrixB), "A*B");

        System.out.println();
        System.out.printf("%s%n", "Умножение матрицы А:");
        InOut.outArray2D(matrixA, "A");
        double[][] vectorMatrix = InOut.inArray2D(2, 1, "1 2");
        System.out.printf("%s%n", "На вектор Vector:");
        InOut.outArray2D(vectorMatrix, "Vector");
        System.out.println("Произведение:");
        InOut.outArray2D(Util.multiplyMatrixOnMatrix(matrixA, vectorMatrix), "A");

        System.out.println("============================================================================================");
        System.out.println("А. Разработать метод findRoot для решения СЛАУ методом Жордана-Гаусса с произвольным размером СЛАУ (поиск корней СЛАУ). \n" +
                "На входе метода: квадратная матрица M коэффициентов СЛАУ и вектор правых частей Y уравнений СЛАУ. На выходе вектор-решение X.");
        System.out.println("============================================================================================");
        double[] vectorY = InOut.inArray1D("5 4 6 3");
        double[][] matrixX = InOut.inArray2D(4, 4, "1 -1 3 1 4 -1 5 4 2 -2 4 1 1 -4 5 -1");

        System.out.println("Матрица коэффициентов СЛАУ:");
        InOut.outArray2D(matrixX, "X");
        System.out.println("Вектор значений СЛАУ:");
        InOut.outArray1D(vectorY, "Y");
        System.out.println();
        System.out.println("Вектор решений СЛАУ:");
        double[] vectorX = Util.findRoot(matrixX, vectorY, false);
        InOut.outArray1D(vectorX, "x");
        System.out.println();
        System.out.println("Проверка:");
        InOut.outArray1D(Util.multiplyMatrixOnVector(matrixX, vectorX), "Y");
        System.out.println();
        System.out.println();

        System.out.println("============================================================================================");
        System.out.println("B. Разработать метод findDeterminant (поиск определителя матрицы M)");
        System.out.println("============================================================================================");
        System.out.print("Определитель матрицы: ");
        System.out.println(Util.findDeterminate(matrixX));
        System.out.println();

        System.out.println("============================================================================================");
        System.out.println("C. Разработать метод inverseMatrix (поиск обратной матрицы M).");
        System.out.println("============================================================================================");
        System.out.print("Исходная матрица:");
        matrixX = InOut.inArray2D(4, 4, "1 -1 3 1 4 -1 5 4 2 -2 4 1 1 -4 5 -1");
        System.out.println();
        InOut.outArray2D(matrixX, "A");
        System.out.print("Обратная матрица:");
        System.out.println();
        double[][] inverse = Util.inverseMatrix(matrixX);
        InOut.outArray2D(inverse, "A-1");
        matrixX = InOut.inArray2D(4, 4, "1 -1 3 1 4 -1 5 4 2 -2 4 1 1 -4 5 -1");
        System.out.print("Проверка:");
        System.out.println();
        InOut.outArray2D(Util.multiplyMatrixOnMatrix(matrixX, inverse), "");

    }
}
