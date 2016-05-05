package by.it.kushel.jd01_02.levelC;


public class RunnerC {
    public static void main(String[] args) {
       int[][] array= RandomMatrixBuilder.build(5);
        MatrixUtill.print(array);
       System.out.println("sum = " + MatrixUtill.sumBetweenPositiv(array));
        System.out.println();

       int [][] transArr= MatrixUtill.transposition(array);
        MatrixUtill.print(transArr);
        System.out.println();

        MatrixUtill.print(MatrixUtill.rotation(array));

    }
}
