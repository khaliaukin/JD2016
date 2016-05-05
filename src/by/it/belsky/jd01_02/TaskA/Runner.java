package by.it.belsky.jd01_02.TaskA;

import java.io.IOException;
/**
 * rr Created by misha on 28.04.2016.
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        String line = "224 337 448 854372 21 2355 83458 13 166";
        int arr[] = Util.lineToIntArray(line);
        String min = TaskA.getMin(arr);
        System.out.println(min);
        String max = TaskA.getMax(arr);
        System.out.println(max);
        double mean = TaskA.mean(arr);
        System.out.print("Числа меньше " + mean + " таковы: ");
        for (int i : arr) {
            if (i < mean)
                System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr) {
            if (TaskA.uniqueDigits(i))
            {
                System.out.print("Найдено число из разных цифр: " + i);
               break;
            }
        }
    }
}
