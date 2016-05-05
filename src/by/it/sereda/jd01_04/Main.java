package by.it.sereda.jd01_04;

public class Main {
    public static void main (String[] args) throws IndexOutOfBoundsException {
        //String line=InOut.consoleReadLine();
        //String line = "71 12 14 789 6 565 76 712";
        String line = "99 100 101 102 106 200 209 1";
        double v[]=InOut.stringLineToArray(line);

        System.out.println("Массив v");
        InOut.arrayPrint(v, "v", 5);

        v=Utils.sortArray(v,true);
        System.out.println("Массив v отсортированный по возрастанию");
        InOut.arrayPrint(v, "v", 5);

        //v=Utils.sortArray2method(v);
        //System.out.println("Массив v отсортированный по возрастанию");
        //InOut.arrayPrint(v, "v", 5);

        v=Utils.sortArray(v,false);
        System.out.println("Массив v отсортированный по убыванию");
        InOut.arrayPrint(v, "v", 5);

        System.out.println("Максимум массива Max="+Utils.maxArray(v));
        System.out.println("Максимум массива Min="+Utils.minArray(v));

        //double[][] m=InOut.consoleReadLine2d(); //ввод двумерного массива с клавиатуры

        double [] y={20, 11, 40, 37};

        double[][] m={
                {2, 5, 4, 1},
                {1, 3, 2, 1},
                {2, 10, 9, 7},
                {3, 8, 9, 2}
        };

        InOut.arrayPrint2D(m);
        InOut.arrayPrint2D(m,"m");

        double[] x=Utils.findRoot(m,y,false);
        InOut.arrayPrint(x, "X", 1);
        //Проверка
        InOut.arrayPrint(Utils.arrayMulVector(m,x), "yy", 4);

        double[][] inversma=Utils.inverseMatrix(m,false);
        InOut.arrayPrint2D(inversma, "matrixOne");
        //Проверка правильности определения обратной матрицы
        //путем перемножения исходной на обратную
        //Верно - если результат единиичная матрица
        InOut.arrayPrint2D(Utils.arrayMulVector(m,inversma), "Единичная. результат");

        //определение детерминанта
        System.out.println("Детерминант ="+Utils.findDeterminant(m));


    }

}
