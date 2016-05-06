package by.it.belsky.jd01_02.TaskB;

public class TaskB1 {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 4; i <= 15; i++) {
            k = k + i;
            if (k >= 7 && k <= 79)
                System.out.println("Число " + k + " принадлежит интервалу [7...79]");
            else
                System.out.println("Число " + k + " не принадлежит интервалу [7...79]");
        }
        Matrix();
    }

    public static void printArray2D(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[j][i] + "\t");
            }
            System.out.println();

        }
    }
    public static void printArray2D1(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void Matrix() {
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
        printArray2D(matrixA);
        System.out.println();
        printArray2D1(matrixA);
    }
}
//TaskB1






