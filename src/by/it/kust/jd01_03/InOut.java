package by.it.kust.jd01_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Tanya Kust
 *
 */
public class InOut {
    //процедура чтения одной строки с консоли
    public static String consoleReadLine() throws IOException {
        InputStreamReader iStreamReader = new InputStreamReader(System.in);
        BufferedReader line = new BufferedReader(iStreamReader);
        String out = line.readLine();
        line.close();
        return out;
    }

    //строка чисел (целых) разделенных пробелом, на выходе массив таких чисел
    public static double[] stringLineToDblArray(String line) {
        line = line.trim();           //удаляем пробелы в начале и в конце
        String[] elemString = line.split(" ");   //преобразование строки в массив
        int count = elemString.length;    //найдем длину массива
        double[] mas = new double[count];    //создали массив для чисел
        for (int i=0; i<count; i++) {    //заполнили его
            mas[i] = Double.parseDouble(elemString[i]);
        }
        return mas;
    }

   //mas входной массив, name имя на экране, cols число столбцов для вывода
    public static void arrayPrint(double[] mas, String name, int cols) {
        int col = 0;
        for (int i = 0; i<mas.length; i++) {
            System.out.print(name);     //печатаем имя массива
            System.out.printf("[% -3d]=%-9.4f ",i,mas[i]);    //печатаем значения
            col++;
            if ((0==col%cols)              //если конец колонки
                    || (mas.length-1==i))   //или конец массива
            {
                System.out.println();      //тогда напечатаем перевод строки
            }
        }
    }

    //вывод двумерного массива
    public static void arrayPrint2D(double[][] m){
        for (int i = 0; i < m.length; i++) {      //перебираем строки массива
            for (int j = 0; j < m[0].length; j++)     //перебираем столбцы массива
                System.out.printf("%6.2f ", m[i][j]);   //печатаем один элемент
            System.out.println();            // в конце столбца
        }
    }

    //печать двумерного массива с заданным именем и индексами
    public static void arrayPrint2D(double[][] m, String name){
        for (int i = 0; i < m.length; i++) {      //перебираем строки массива
            for (int j = 0; j < m[0].length; j++)     //перебираем столбцы массива
                System.out.printf(name + "[%1d,%1d]=%-6.1f ", i, j, m[i][j]);   //печатаем один элемент
            System.out.println();            // в конце столбца
        }
        System.out.println();      //в конце массива выводится пустая строка
    }
}
