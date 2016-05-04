package by.it.sereda.jd01_02;

public class TaskB {

    static int belongsToInterval (int[] knm) {
        int knmresult=10;
        if (knm[1]<knm[2]) {
            if (knm[0]>=knm[1] && knm[0]<=knm[2]) {
                knmresult=1;
            }
            else {
                knmresult=0;
            }
        }
        return knmresult;
    }

    /*static void matrixKNN (int[] knn) {
        double definitioninfloat = Math.sqrt(knn[0]);
        double definitioninfloatceil = Math.ceil(definitioninfloat);
        int definition=(int)definitioninfloatceil;
        int k =1;
        for (int row = 0; row < definition; row++) {
            for (int col = 0; col < definition; col++)
                System.out.printf(" %3s ", k++);
            System.out.println();
        }
    }*/

    static void matrixKNN (int[] knn) {
        double definitioninfloat = Math.sqrt(knn[0]);
        double definitioninfloatceil = Math.ceil(definitioninfloat);
        int definition=(int)definitioninfloatceil;
        double[][] m=new double[definition][definition];
        //заполняем нулями матрицу
        for (int row = 0; row < definition; row++)
            for (int col = 0; col < definition; col++)
                m[row][col]=0;
        int k = knn[0];
        int step=1;
            for (int row = 0; row < definition; row++)
                for (int col = 0; col < definition; col++)
                    if (k+1>step)
                        m[row][col] = step++;

        for (int i = 0; i < m.length; i++) {        //перебираем строки массива
            for (int j = 0; j < m[i].length; j++)
                System.out.printf("%6.2f ",m[i][j]);//печатаем один элемент
            System.out.println();                   //в конце столбуа
        }
        System.out.println();           //в конце массива выводится пустая строка

    }



    static void quadEquation (double[] arrayabc) {
        double a = arrayabc[0];
        double b = arrayabc[1];
        double c = arrayabc[2];
        if (a==0) {
            System.out.println("Некорректный ввод значения a, уравнение не является квадратным");
        }
        else {
            double d = (Math.pow(b, 2) - (4*a*c));
            if (d<0) {
                System.out.println("Уравнение с такими коэффициентами не имеет решения");
            }
            else {
                double x1 = (-b + Math.sqrt(d))/2*a;
                double x2 = (-b - Math.sqrt(d))/2*a;
                System.out.println("Корень X1=" +x1);
                System.out.println("Корень X2=" +x2);
            }
        }
    }

    static void monthNumber (String[] months, int[] monthnumber) {
        try {
            if (0<monthnumber[0] && 13>monthnumber[0]) {
                System.out.println("Название месяца "+months[monthnumber[0]-1]);
            }
            else {
                System.out.println("Неверный номер месяца");
            }
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат ввода номера месяца ");
        }
    }







}
