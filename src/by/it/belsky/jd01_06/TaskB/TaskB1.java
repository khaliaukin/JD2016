package by.it.belsky.jd01_06.TaskB;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by misha on 09.05.2016.
 */
public class TaskB1 {
    static boolean SoGlasnaya(String word) {
        //паттерн для гласных букв
        String bvg = "бвгджзклмнпрстфхцчшщ";
        //добавим туда еще и большие
        bvg = bvg + bvg.toUpperCase();
        char first = word.charAt(0);

        return (bvg.indexOf(first) >= 0);
    }

    public static void main(String[] args) {
        //Получим строку в которой можно проводить замену символов.
        StringBuilder text = new StringBuilder(Data.lukomor);
        StringBuilder textok = new StringBuilder(Data.lukomor);
        Pattern p = Pattern.compile("([^а-яА-ЯёЁ]{1})([бвгджзклмнпрстфхцчшщ][а-яА-ЯёЁ]{4})([^а-яА-ЯёЁ]{1})");
        Matcher m = p.matcher(text);
        int corr=0;
        while (m.find()) {

                int start = m.start(2)-corr;
                int end = m.end(2)-corr;
                corr=corr+m.end(2)-m.start(2);

                //int length = m.group().length();
            //if (length==5)
                    textok.delete(start,end);
                    System.out.println(m.group(2));
                //m.reset();
            }
        System.out.println(textok);
        }
    }
