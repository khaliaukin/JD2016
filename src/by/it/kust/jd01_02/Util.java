package by.it.kust.jd01_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {
    //чтение одной строки с консоли

    /**
     * @author Tanya Kust
     * @return Line строку, введенную с консоли, lineToIntArray заполняем масств числами из строки, поиск макс и мин в массиве...
     * @throws IOException
     */
    static String getOneLine() throws IOException {

        BufferedReader stin = new BufferedReader(new InputStreamReader(System.in));
        String line = stin.readLine();
        //stin.close();
        return line;
    }

    static int[] lineToIntArray (String line) {
        //деление строки на элементы массива по пробелам
        String[] strArray = line.split(" ");
        //создаем и заполняем массив чисел
        int[] array = new int[strArray.length];
        for (int j = 0; j < strArray.length; j++) {
            array [j] = Integer.parseInt(strArray[j]); //или надо было j=Integer.parseInt(j)?
        }
        return array;
    }

    public static void arrayPrintLeftToRight(int[] mas, String name, int cols) {
        int col = 0;
            for (int i = 0; i < (cols*cols); i++) {  //лишнее не печатаем, чтобы была квадр.матрицв
                System.out.print(name);     //печатаем имя массива
                System.out.printf("[% -3d]=%-4d ", i, mas[i]);    //печатаем значения
                col++;
                if ((0 == col % cols)              //если конец колонки
                        || (cols * cols == i))   //или конец массива
                {
                    System.out.println();      //тогда напечатаем перевод строки
                }
        }
    }

    public static void arrayPrintTopToBottom(int[] mas, String name, int cols) {
        for (int i = 0; i < cols; i++) {  //лишнее не печатаем, чтобы была квадр.матрицв
            System.out.print(name);     //печатаем имя массива
            System.out.printf("[% -3d]=%-4d ", i, mas[i]);    //печатаем значения
            int col = 1;
            for (int j= (i + cols); j < cols*cols; j = j + cols) {
                System.out.print(name);     //печатаем имя массива
                System.out.printf("[% -3d]=%-4d ", j, mas[j]);    //печатаем значения c шагом указ.размера квадр.матрицы
                col++;
                if (0 == col % cols) {           //если конец колонк тогда напечатаем перевод строки
                    System.out.println();
                }
            }
        }
    }

    public static void arrayRandomPrint2D(double[][] m){
        int n = m.length;
        for (int i = 0; i < m.length; i++) {      //перебираем строки массива
            for (int j = 0; j < m[i].length; j++) {    //перебираем столбцы массива
                m[i][j] = (int) (Math.random() * (n * 2 + 1) - n);
                System.out.printf("[%1d,%1d]=%-6.1f ", i, j, m[i][j]);
            }
            System.out.println();            // в конце столбца
        }
        System.out.println();      //в конце массива выводится пустая строка
    }

    //Задание С2: Транспонировать матрицу (заменить строки на столбцы).
    public static void transposedMatrix(double[][] tr){
        double[][] tr2 = new double[tr.length][tr[0].length];
        for (int i=0; i<tr.length; i++) {
            for (int j=0; j<tr[0].length; j++) {
                tr2[i][j] = tr[j][i];
                System.out.printf("[%1d,%1d]=%-6.1f ", i, j, tr2[i][j]);
            }
            System.out.println();
        }
    }

    //Задание С4: среднее арифметическое двумерного массива
    static double srAriphm (double array[][]){
        //вычисляем среднее арифметическое
        double sr = 0;
        //все складываем
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[0].length; j++) {
                sr = sr + array[i][j];
            }
        }
        //найти среднее
        sr = sr / (array.length*array[0].length);
        return sr;
    }

    //вывод двумерного массива
    public static void arrayPrint(double[][] m){
        for (int i = 0; i < m.length; i++) {      //перебираем строки массива
            for (int j = 0; j < m[0].length; j++) {    //перебираем столбцы массива
                System.out.printf("[%1d,%1d]=%-6.1f ", i, j,  m[i][j]);
            }              //печатаем один элемент
            System.out.println();            // в конце столбца
        }
    }
}

