package by.it.khalyavkin.jd01_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by user_2 on 29.04.2016.
 */
public class InOut {

    public static String consoleReadLine () throws IOException {
        InputStreamReader iStreamReader=new InputStreamReader(System.in);
        BufferedReader line = new BufferedReader(iStreamReader);
        String out = line.readLine();
        //line.close();
        return out;
    }


    public static int [][] matrixInput() throws IOException {
        // int row=0; // counter of rows;
        // while (consoleReadLine!="") {
        //row++;
        // int strM[] = stringLineToIntArray(consoleReadLine());
        //int col=strM.length;
        //if
        // }
        // int [][] matrix = new int [col][row];
        System.out.println("введите количество строк матрицы");
        Scanner in = new Scanner(System.in);
        int nrow=in.nextInt();// считываем введенное количество строк матрицы
        System.out.println("введите 1-ю строку");
        String scol= consoleReadLine();
        int [] col = stringLineToIntArray(scol);
        int [][] matrix = new int [nrow][col.length];
        for (int i=0; i<nrow; i++) {
            scol= consoleReadLine();
            col=stringLineToIntArray(scol);
            for (int j=0; j<col.length; j++) {
                matrix[i][j] = col[j];
            }
        }
        //количество строк в матрице запрос и перевод в инт
        //объявление мкассива fffff
        return matrix;
    }

    public static int [] stringLineToIntArray (String line) {
        line = line.trim(); // метод trim убирает из исходной строки все ведущие и замыкающие пробелы.
        String[] elemString = line.split(" "); // метод split разделяет строку line по пробелам на строки
        //и присваивает элементам массива полученные строки
        int count = elemString.length; // счетчик со значением количества элементов массива
        int[] mas = new int[count];//объявленіе целочисленного одномерного массива размерностью счетчика
        for (int i = 0; i < count; i++) {
            mas[i] = Integer.parseInt(elemString[i]);//заполнение целочисленного массива
        }
        return mas; //возврат значения
    }

    public static void arrayPrint(int[] mas, String name, int cols) {
        int col = 0;
        for (int i = 0; i < mas.length; i++) {
            System.out.print(name);
            System.out.printf("[% -3d]=%-4d ", i, mas[i]);
            col++;
            if ((0 == col % cols) || (mas.length - 1 == i)) {
                System.out.println();
            }
        }
    }

    public static void arrayPrint(double[] mas, String name, int cols) {
        int col = 0;
        for (int i = 0; i < mas.length; i++) {
            System.out.print(name);
            System.out.printf("[% -3d]=%-4d ", i, mas[i]);
            col++;
            if ((0 == col % cols) || (mas.length - 1 == i)) {
                System.out.println();
            }
        }
    }

    public static void arrayPrint2D(double[][] m) {
        for (int i = 0; i < m.length; i++) {               //перебор строк массива
            for (int j = 0; j < m[0].length; j++)       //перебіраем столбцы массива
                System.out.printf("%6.2f ", m[i][j]);  // печатаем один элемент
            System.out.println();
        }// в конце столбца

        System.out.println();                      // вывод пустой строкі в конце массива

    }

    public static void arrayPrint2D(double[][] m, String name) {
        for (int i = 0; i < m.length; i++) {               //перебор строк массива
            for (int j = 0; j < m[0].length; j++)       //перебіраем столбцы массива
                System.out.printf(name + "[%1d,%1d]=%-6.1f ", i, j, m[i][j]);
            System.out.println();                   // вывод пустой строкі в конце массива
        }

    }


}
