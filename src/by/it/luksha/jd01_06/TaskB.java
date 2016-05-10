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

        //разбиение строки на массив предложений и вывод в консоль
        String[] arrayOfText = text.toString().split("([\\.]{1}\\s)|(! )|\\?\\s");
        System.out.println("До сортировки:");
        int k = 1;
        for (String element: arrayOfText)
        {
            System.out.println(k + ". " + element);
            k++;
        }

        //сортировка предложений по кол-ву слов
        for (int i = 0; i < arrayOfText.length;  i++) {
            for (int j = 0; j < arrayOfText.length - 1; j++) {
                String[] arrJ = arrayOfText[j].split("( - )|( )");
                String[] arrJ1 = arrayOfText[j+1].split("( - )|( )");
                if( arrJ.length > arrJ1.length ){
                    String tmp = arrayOfText[j];
                    arrayOfText[j] = arrayOfText[j+1];
                    arrayOfText[j+1] = tmp;
                }
            }
        }


        //вывод в консоль после сортировки
        System.out.println("После сортировки:");
        k = 1;
        for (String element: arrayOfText)
        {
            System.out.println(k + ". " + element);
            k++;
        }
    }
}
