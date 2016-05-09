package by.it.luksha.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB {
    public static void task1() {
        System.out.println("1. Из текста удалить все слова длины 5, начинающиеся на согласную букву.");

        StringBuilder text = new StringBuilder(Data.lykomorie);

        Pattern pattern = Pattern.compile("(?i)\\b([ЙЦКНГШЩЗХФВПРЛДЖЧСМТБйцкнгшщзхфвпрлджчсмтб]{1})([\\S]{4}?)\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find())
        {
            System.out.println(matcher.group());
            int start = matcher.start();
            text.delete(start, start+6);
        }

        System.out.println(text);
    }

    public static void task2() {
        System.out.println("2. Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них. В предложениях убрать переносы строк.");

        /*String[] text = Data.lykomorie.split("\\n");
        for (String element: text) {
            System.out.println(element);
            System.out.println("!");
        }*/
        //System.out.println(text);

        StringBuilder text = new StringBuilder(Data.lykomorie);

        //замена новой строки на пробел
        Pattern pattern = Pattern.compile("\\n");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find())
        {
            int start = matcher.start();
            text.replace(start, start+1, " ");

        }
        System.out.println(text);

        String[] arrayOfText = text.toString().split("[\\.]{1}?");
        for (String element: arrayOfText) {
            System.out.println(element);
            System.out.println("!");
        }

    }
}
