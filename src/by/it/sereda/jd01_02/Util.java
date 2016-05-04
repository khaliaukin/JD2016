package by.it.sereda.jd01_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {
    //чтение одной строки с консоли
    static String getOneLine() throws IOException {
        BufferedReader stin = new BufferedReader(new InputStreamReader(System.in));
        String line = stin.readLine();
        //stin.close();
        return line;
    }

    //преобразование одной строки в массив чисел
    static int[] lineToIntArray(String line) {
        //деление строки на элементы массива по пробелам
        String[] strArray = line.split(" ");
        //создаем и заполняем массив числе
        int[] array = new int[strArray.length];
        for (int j = 0; j < strArray.length; j++) {
            array[j] = Integer.parseInt(strArray[j]);
        }
        return array;
    }

    //преобразование одной строки в массив чисел
    static double[] lineToDoubleArray(String line) {
        //деление строки на элементы массива по пробелам
        String[] strArray = line.split(" ");
        //создаем и заполняем массив числе
        double[] array = new double[strArray.length];
        for (int j = 0; j < strArray.length; j++) {
            array[j] = Float.parseFloat(strArray[j]);
        }
        return array;
    }
}
