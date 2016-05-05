package by.it.belsky.jd01_02.TaskB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by misha on 03.05.2016.
 */
public class TaskB2 {
    public static String ConsoleReadline() throws IOException {

        InputStreamReader iSstreamreader = new InputStreamReader(System.in);
        BufferedReader line = new BufferedReader(iSstreamreader);
        System.out.println("Введите массив");
        String out = line.readLine();
        //line.close();

        return out;
    }

    public static int[] stringLineToIntArray(String line) {
        line = line.trim();
        String[] elemString = line.split(" ");
        int count = elemString.length;
        int mas[] = new int[count];
        for (int i = 0; i < count; i++) {
            mas[i] = Integer.parseInt(elemString[i]);
        }
        return mas;
    }

    public static void arrayPrint(int mas[], String name, int cols) {
        int col = 0;
        for (int i = 0; i < mas.length; i++) {
            System.out.print(name);
            System.out.printf("[ %-1d ]=%-4d ", i, mas[i]);
            col++;
            if ((0 == col % cols)
                    || (mas.length - 1 == i)) {
                System.out.println();
            }
        }
    }
}