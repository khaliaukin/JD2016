package by.it.vasilevich.jd01_02;


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Util {
    static String getOneLine() throws IOException {
        BufferedReader stin = new BufferedReader(new InputStreamReader(System.in));
        String line = stin.readLine();
        stin.close();
        return line;
    }

    static int[] lineToIntArray(String line){
        String strMas[] = line.split(" ");
        // разбили строку line разделителем " ";
        // получили массив strMas[11,34,3,45,23,5,67];
        int intMas[] =  new int[strMas.length];
        // в массив intMas[] вносятся целые числа массива strMas[];
        for (int i=0; i<strMas.length; i++) {
            intMas[i]=Integer.parseInt(strMas[i]);
        }
        return intMas;
    }
}
