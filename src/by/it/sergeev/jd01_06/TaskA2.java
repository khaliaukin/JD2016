package by.it.sergeev.jd01_06;

import java.util.Arrays;

public class TaskA2 {
    public static void Pushkin2() {
        StringBuilder text = new StringBuilder(Pushkin.getString());
        String [] mastext = text.toString().split("[^а-яА-ЯёЁ]+");

        for (int i = 0; i < mastext.length; i++) {
            if (mastext[i].length() > 0) {
                int count = 1;
                for (int j = i + 1; j < mastext.length; j++) {
                    if (mastext[i].equals(mastext[j])) {
                        count++;
                        mastext[j]="";
                    }
                }
                String a = "Слово ";
                Arrays.sort(mastext);


                System.out.println(a + mastext[i] + " повторяется ");
                System.out.print(count);
            }
        }
    }
}
