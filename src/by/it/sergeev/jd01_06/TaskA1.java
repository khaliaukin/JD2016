package by.it.sergeev.jd01_06;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void Pushkin() {
        StringBuilder pushkin = new StringBuilder(Pushkin.getString());
        Pattern p1 = Pattern.compile("[а-яА-ЯёЁ]{5,}");
        Matcher m1 = p1.matcher(pushkin);
        while (m1.find()) {
            int start = m1.start();
            int length = m1.group().length();
            pushkin.setCharAt(start + 4, '#');
            if (length > 6) {
                pushkin.setCharAt(start + 6, '#');
            }
        }
        System.out.println(pushkin);
    }
}
