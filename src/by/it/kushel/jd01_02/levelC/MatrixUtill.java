package by.it.kushel.jd01_02.levelC;


public class MatrixUtill {
    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sumBetweenPositiv(int[][] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            int sumRow = 0;
            int positiveCount = 0;

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    positiveCount++;
                    if (positiveCount == 1) continue;
                    if (positiveCount == 2) break;
                }
                if (positiveCount == 1) {
                    sumRow = sumRow + array[i][j];
                }
            }
            if (positiveCount == 2) {
                sum = sum + sumRow;
            }

        }

        return sum;
    }

    public static int[][] transposition (int[][] array){

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < i; j++) {
                    int elementOfArray = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = elementOfArray;
                }
            }
        return array;
    }

    public static int[][] rotation (int[][] array) {

        for (int i = 0; i < array.length; i++) {
            int maxInd = array[i].length - 1;
            for (int j = 0; j < maxInd / 2; j++) {
                int temp = array[i][j];
                array[i][j] = array[i][maxInd - j];
                array[i][maxInd - j] = temp;
            }
        }
        array=transposition(array);
        return array;
    }
}