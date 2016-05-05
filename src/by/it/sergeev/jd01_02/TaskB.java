package by.it.sergeev.jd01_02;

/**
 * Created by Дмитрий on 28.04.2016.
 */
public class TaskB {
    static String getAffiliations(int aff) {
        //B1. Определить принадлежность некоторого значения k нитервалу [n,m].
        // интервал от 0 до 100
        int n = 0;
        int m = 100;
        if (aff > n && aff < m) {
            System.out.println("Число " + aff + " принадлежит интервалу [" + n + "," + m + "]");
        } else {
            System.out.println("Число " + aff + " не принадлежит интервалу [" + n + "," + m + "]");
        }
        return "";
    }

    //B2. Вывести числа от 1 до K в виде матрицы N х N слева направо и сверзу вниз.
    static String getArray(int K) {
        // слева направо
        Integer count1 = 1;
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < K; j++) {
                System.out.printf("%3s", count1++);
            }
            System.out.println();
        }
        System.out.println("");
        // сверзу вниз
        Integer count2 = 1;
        for (int i = 1; i <= K; i++) {
            for (int j = 1; j < K; j++) {
                System.out.printf("%3s",count2 + " ");
                count2 += K;
            }
            System.out.println(count2);
            count2 = i + 1;
        }
        return "";
    }
    //B3

}
