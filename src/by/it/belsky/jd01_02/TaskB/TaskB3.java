package by.it.belsky.jd01_02.TaskB;

import java.util.Scanner;

/**
 * Created by misha on 03.05.2016.
 */
public class TaskB3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        float a, b, c, d, x1, x2;
        System.out.println("Введите коэффициент а :");
        a = sc.nextFloat();
        System.out.println("Введите коэффициент b :");
        b = sc.nextFloat();
        System.out.println("Введите коэффициент c :");
        c = sc.nextFloat();
        d = (float) Math.pow(b,2) - (4 * a * c);
        if (d < 0) {
            System.out.println("Уравнение не имеет решений");
        } else if (d == 0) {
            {
                x1 = b / -2 * a;
                System.out.println("Уравнение имеет один корень х1=" + x1);
            }
        } else {
            x1 = -b + (float) (Math.sqrt(d)) / 2 * a;
            x2 = -b - (float) (Math.sqrt(d)) / 2 * a;
            System.out.println("Уравнение имеет два корня :"+"x1 =" + x1 + ", x2 =" + x2);
        }
    }
    /**
     * rrCreated by misha on 29.04.2016.
     */
    public static class TaskB {
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
}
//TaskB3

