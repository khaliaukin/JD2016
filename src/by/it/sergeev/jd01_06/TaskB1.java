package by.it.sergeev.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void PushkinB() {
        char[] chars = "БВГДЖЗЙКЛМНПРСТФХЦЧШЩ".toCharArray();
        StringBuffer sb = new StringBuffer();
        Matcher m = Pattern.compile("(?i)\\b([а-яА-ЯёЁ])(.+?)\\b").matcher(Pushkin.getString());
        int count = 0;
        while (m.find()) {
            if (m.group(2).length() == 4 && Arrays.binarySearch(chars, m.group(1).toUpperCase().charAt(0)) >=0 )
            {
                count++;
                System.out.print(m.group() + " ");
                m.appendReplacement(sb, "___");
            }
        }
        System.out.println();
        System.out.println("Количество слов: " + count + '\n');
        m.appendTail(sb);
        System.out.println(sb);
    }
}
