package by.it.sergeev.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA3 {

    public static void Pushkin3() {
        StringBuilder text = new StringBuilder(Pushkin.getString());
        Pattern p = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher m = p.matcher(text);
        int count = 0;
        while (m.find()) //пока находятся слова, мы подсчитываем число подходящих под проверку
            if (Vowel.vowel(m.group())) //если проверка показали гласные в начале и конце
            {
                count++;                     //то увеличим общий счетчик
                System.out.print(m.group() + " "); //и напечатаем слово
            }

        System.out.print(" = " + count);
    }
}