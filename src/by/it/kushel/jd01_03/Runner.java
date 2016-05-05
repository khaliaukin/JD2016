package by.it.kushel.jd01_03;

import by.it.kushel.jd01_04.MethodOfGauss;

public class Runner {
    public static void main(String[] args) {
        String line = "3.1 3.9 4 35 5 346 -36 346.1 34";
        double v[] = InOut.stringLineToDoubleArray(line);

        System.out.println("Массив v");
        InOut.arrayPrint(v,"v",1);
        System.out.println();

        double[]sotrMas=Util.sortIntArray(v, true);
        System.out.println("Отсортированный массив v");
        InOut.arrayPrint(sotrMas,"sv",1);
        System.out.println();

        double max=Util.searchOfMaximum(v);
        System.out.println("Max = "+ max );
        System.out.println();

        double min=Util.searchOfMinimum(v);
        System.out.println("Min = "+ min );
        System.out.println();

System.out.println("Умножение матрицы на вектор");
        System.out.println();
        double[][] matrix2D = {
                {-9,1,0},
                {4,1,1},
                {-2,2,-1}
        };

        System.out.println("Матрицу:");
        InOut.arrayPrint2D(matrix2D);
        System.out.println("Умножаем на вектор:");
        double[] vector={2, 4, 8};
        InOut.arrayPrint(vector, "v",1);
        System.out.println("Получаем:");
       double[] resultMatrix=Util.multiplicationArrays(matrix2D, vector);
        InOut.arrayPrint(resultMatrix, "rm", 1);
        System.out.println();

        System.out.println("Решение СЛАУ");
        System.out.println();
        double[][] masA={
                {2,3},
                {5,-1}
        };
        double[] masY={8,3};
        double[]x=MethodOfGauss.findRoots(masA, masY,true);
        InOut.arrayPrint(x, "roots", 10);

        System.out.println("Проверка правильности нахождения корней");
        System.out.println();
        System.out.println("Матрицу корней:");
        InOut.arrayPrint(x,"r",1);
        System.out.println("Умножаем на матрицу А:");
        InOut.arrayPrint2D(masA);
        System.out.println("Получаем вектор Y:");
        double[] masY2=Util.multiplicationArrays(masA, x);
        InOut.arrayPrint(masY, "Y", 1);
        System.out.println();
    }

}
