package by.it.sergeev.jd01_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user_2 on 29.04.2016.
 */
public class InOut {
    public static String consoleReadLine() throws IOException{
    InputStreamReader iStreamReader = new InputStreamReader(System.in);
    BufferedReader r = new BufferedReader(iStreamReader);
    String out = r.readLine();
    r.close();
    return out;
    }
    public static double[] stringLineToIntArray(String line)
    {
        line = line.trim();
        String[] elemString = line.split(" ");
        int count = elemString.length;
        double[] mas = new double[count];
        for (int i=0; i< count; i++)
        {
            mas[i] = Integer.parseInt(elemString[i]);
        }
        return mas;
    }
    public static void arrayPrint(double[] mas, String name, int cols )
    {
        int col = 0;
        for (int i = 0; i < mas.length; i++)
        {
            System.out.print(name);
            System.out.printf("[% -3d]=%-9.4f ", i , mas[i]);
            col++;
            if ((col%cols==0)||(mas.length-1==i))
            {
                System.out.println();
            }

        }
    }
    public static void arrayPrint2D(double[][] m)
    {
        for (int i = 0; i < m.length; i++)
        {
            for (int j=0; j < m[0].length;j++)
                System.out.printf("%6.2f ",m[i][j]);
            System.out.println();
        }
        System.out.println();
    }
    /**
     * @param m печать двумерного массива с заданым именем и индексами
     */
    public static void arrayPrint2D(double[][] m, String name)
    {
        for (int i = 0; i < m.length; i++)
        {
            for (int j=0; j < m[0].length;j++)
                System.out.printf(name + "%1d,%1d=%-6.2f ", i, j, m[i][j]);
            System.out.println();
        }
        System.out.println();
    }
}
