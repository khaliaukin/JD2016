package by.it.kushel.jd01_02.levelA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {
    static String genOneLine() throws IOException {
        BufferedReader in = new  BufferedReader (new InputStreamReader(System.in));
        String line = in. readLine();
        in.close();
        return line;
    }

    static int[] lineToIntArray(String line){
        String[] strArray = line.split(" ");
        int[] array = new int[strArray.length];
        for (int j=0; j<strArray.length; j++){
         array[j]= Integer.parseInt(strArray[j]);
        }
        return array;

    }
    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+"; ");
        }
    }
}
