package by.it.belsky.jd01_03.TaskB;

/**
 * rrCreated by misha on 29.04.2016.
 */
public class TaskB {
    public static void main(String[] args) {


        int[][] matrixA;
        matrixA = new int[3][3];
        matrixA[0][0] = 1;
        matrixA[0][1] = 2;
        matrixA[0][2] = 3;
        matrixA[1][0] = 4;
        matrixA[1][1] = 5;
        matrixA[1][2] = 6;
        matrixA[2][0] = 7;
        matrixA[2][1] = 8;
        matrixA[2][2] = 9;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixA[j][i] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
    }
}