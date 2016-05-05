package by.it.smirnova.jd01_02;

import java.io.IOException;

/**
 * Created by user_2 on 27.04.2016.
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        //String line=Util.getOneLine();

        String line="11 22 343 123 67 456 333 22 853";

        int arr[]= Util.lineToIntArray(line);


        String max=TaskA.getMax(arr);

        System.out.println(max);

        String min=TaskA.getMin(arr);

        System.out.println(min);


        double mean=TaskA.mean(arr);

        System.out.print("Числа меньше "+mean+" таковы: ");

        for (int i:arr) {

            if (i<mean) {

                System.out.print(i+" ");
            }
        }

        System.out.println("");

        for (int i: arr)
        {
            if (TaskA.uniqueDigits(i)) {

                System.out.print("Найдено число из разных цифр: "+i);

                break;
            }
        }
    }

}
