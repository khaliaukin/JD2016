package by.it.sergeev.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void PushkinB() {
        StringBuffer sb = new StringBuffer();
        Matcher m = Pattern.compile("(?i)\\b([а-яА-ЯёЁ])(.+?)\\b").matcher(Pushkin.getString());
        int count = 0;
        while (m.find()) {
            if (m.group().length() == 5)
            {
                count++;
                m.appendReplacement(sb, "_");
            }
        }
        System.out.println("Количество слов: " + count + '\n');
        m.appendTail(sb);
        System.out.println(sb);
    }
}
