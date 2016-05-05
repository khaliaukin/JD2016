package by.it.drachyova.jd01_04;

public class Main {

    public static void main(String[] args) {

        double arrayX[][]={
            {2, 5, 4, 1},
            {1, 3, 2, 1},
            {2, 10, 9, 7},
            {3, 8, 9, 2}
        ,};
        double[] arrayY={20, 11, 40, 37};
        double[] roots =  Utils.findRoot(arrayX, arrayY, false);
        InOut.arrayPrint(roots,"x",1);
        System.out.println("Проверка");
        double[] test1 = Utils.arrayMulVector(arrayX,roots);
        InOut.arrayPrint(test1,"y",4);
        double determinant=Utils.findDeterminant(arrayX,arrayY);
        System.out.println("Детерминант = "+ determinant);
        double[][] invMatrix=Utils.inverseMatrix(arrayX);
        System.out.println("Обратная матрица");
        InOut.arrayPrint2D(invMatrix, "i");
        System.out.println("Проверка");
        double[][] test2= Utils.arrayMulVector(arrayX,invMatrix);
        InOut.arrayPrint2D(test2, "x");
    }
}
