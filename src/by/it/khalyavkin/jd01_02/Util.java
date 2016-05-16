package by.it.khalyavkin.jd01_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Created by user_2 on 27.04.2016.
 */
public class Util {
    //чтение одной строки с консоли
    static String getOneLine () throws IOException {
       BufferedReader stin = new BufferedReader(new InputStreamReader(System.in));
               String line = stin.readLine();
                stin.close();
        return line;
    }
// преобразование строки в массив чисел
    static int [] lineToIntArray (String line) {
        String [] strArray = line.split (" ");
        int [] array = new int [strArray.length];
        for (int j = 0; j < strArray.length; j++)
        {
            array [j] = parseInt (strArray[j]);
        }
        return array;
    }
}
