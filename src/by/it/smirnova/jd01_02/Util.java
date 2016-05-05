package by.it.smirnova.jd01_02;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user_2 on 27.04.2016.
 */
public class Util {

    static String getOneLine() throws IOException
    {

        BufferedReader stin = new BufferedReader (new InputStreamReader(System.in));

        String line = stin.readLine();

        stin.close();

        return line;

    }


    static int[] lineToIntArray(String line) {

        String[] strMas = line.split(" ");

        int[] intMas = new int[strMas.length];

        for(int j = 0; j < strMas.length; j++)
        {
            intMas[j] = Integer.parseInt(strMas[j]);
        }
        return intMas;
    }
}
