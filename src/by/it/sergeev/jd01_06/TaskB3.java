package by.it.sergeev.jd01_06;

import java.io.*;
import java.util.Arrays;


public class TaskB3 {
    public static void sortWord() throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String n = r.readLine();

        char[] chars = n.toCharArray();

        StringBuilder text = new StringBuilder(Pushkin.getString().toLowerCase());
        String[] mastext = text.toString().trim().split(" ");
        int arr[] = new int[mastext.length]; //создаём массив с словами.
        for (int i = 0; i <= mastext.length; i++) {
            int t = 0;
            String letter[] = mastext[i].split("[^а-яё]+"); //массив с буквами.
            for (int j = 0; j <= letter.length; j++) {
                if (letter[j] == chars.toString()) {
                    t++;
                }
                arr[j] = t;
            }
            System.out.println(t);
            Arrays.sort(arr);
            for (int m = 0; m <= arr.length; m++) {

            }
        }
    }
}