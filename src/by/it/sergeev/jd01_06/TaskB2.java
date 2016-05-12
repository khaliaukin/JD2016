package by.it.sergeev.jd01_06;

import java.util.Arrays;

public class TaskB2 {

    public static void PushkinB22() {
        StringBuilder text = new StringBuilder(Pushkin.getString());
        String s[] = text.toString().trim().split("[.!?]+\\s*");//делим текст на предложения.
        int arr[] = new int[s.length]; //создаём массив с предложениями
        int k[] = new int[s.length]; //создаём копию массива для последующего сравнения

        for (int i = 0; i <= s.length-1; i++) {
            int t = 0;
            String w[] = s[i].toString().trim().split(" "); //количество слов в каждом предложении.
            for (int j = 0; j <= w.length-1; j++) {
                t++;
            }
            arr[i] = t;
            k[i] = t;
        }
        Arrays.sort(arr); // сортируем массив по количеству слов в предложении
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr.length - 1; j++) {
                if (arr[i] == k[j]) {
                    System.out.println(s[j].replaceAll("\n", " ")); //удаление переноса строки
                }
            }
        }
    }
}