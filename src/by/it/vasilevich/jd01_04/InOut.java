package by.it.vasilevich.jd01_04;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InOut {
    static String getOneLine() throws IOException {
        BufferedReader stin = new BufferedReader(new InputStreamReader(System.in));
        String line = stin.readLine();
        stin.close();
        return line;
    }


    public static double[] lineToIntArray(String line) {
        String strMas[] = line.split(" ");
        // разбили строку line разделителем " ";
        // получили массив strMas{введенные числа};
        double dMas[] = new double[strMas.length];
        // в массив intMas[] вносятся целые числа массива strMas[];
        for (int i = 0; i < strMas.length; i++) {
            dMas[i] = Double.parseDouble(strMas[i]);
        }
        return dMas;
    }

    public static void arrayOne(String[] arg) throws IOException {
        System.out.println("Введите числа для одномерного массива:");
        String line = getOneLine();
        //строка ввода из консоли;
        double arr[] = lineToIntArray(line);
        //преобразуем строку в массив;
        //System.out.println(arr[5]);
        System.out.print("Создан одномерный массив со следующими значениями:\n{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            //выводим все элементы массива;
            if (i < arr.length - 1)
                System.out.print(", ");
            else
                System.out.print("}");
        }
    }


    //ввод двумерного массива
//    public static void arrayDouble(String[][] arg) throws IOException {
//        System.out.println("Введите размер матрицы:");
//        //строка ввода из консоли;
//        String n = getOneLine();
//        //устанавливаем размер матрицы;
//        int n = Integer.parseInt(String n);
//        double arr[][] = new double[n][n];
//        System.out.print("Введите двумерный массив:\n{");
//        for (int i = 0; i < arr.length; i++)
//            for (int j = 0; j < arr.length; j++) {
//                System.out.println("Введите [" + i + "][" + j + "]-ый компонент массива");
//            }
//    }
}
