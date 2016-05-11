package by.it.luksha.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB {
    /**
     * Метод удаляет из текста все слова длины 5, начинающиеся на согласную букву.
     */
    public static void task1() {
        System.out.println("1. Из текста удалить все слова длины 5, начинающиеся на согласную букву.");

        StringBuilder text = new StringBuilder(Data.lykomorie);

        Pattern pattern = Pattern.compile("(?i)\\b([ЙЦКНГШЩЗХФВПРЛДЖЧСМТБйцкнгшщзхфвпрлджчсмтб]{1})([\\S]{4}?)\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find())
        {
            int start = matcher.start();
            text.delete(start, start+6);
            matcher.reset();
        }

        System.out.println(text);
    }

    /**
     * Метод выводит все предложения заданного текста в порядке возрастания количества слов в каждом из них. В предложениях убирает переносы строк.
     */
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

    /**
     * Метод сортирует слова в тексте по убыванию количества вхождений заданного символа, а в случае равенства — по алфавиту.
     * @param sub заданный символ
     */
    public static void task3(String sub) {

        System.out.println("3. Отсортировать слова в тексте по убыванию количества вхождений заданного символа, а в случае равенства — по алфавиту.");

        //разбивание строки с текстом на массив строк со словами
        String[] words = Data.lykomorie.split("[^а-яА-ЯЁё]+");

        //переводим все символы слов в нижний регистр
        System.out.println("До сортировки:");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            System.out.println((i+1) + ". " + (words[i]));
        }

        //сортировка по алфавиту
        Arrays.sort(words);

        //убывающая сортировка по количеству вхождений заданного символа
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length - 1; j++) {
                int k = counterOccurrence(words[j], sub);
                int l = counterOccurrence(words[j+1], sub);
                if (k < l)
                {
                    String tmp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = tmp;
                }
            }
        }

        System.out.println("После сортировки по количеству вхождений символа " + sub + " :");
        int count = 1;
        for (String word: words) {
            System.out.println(count + ". " + (word));
            count++;
        }
    }

    /**
     * Метод ищет кол-во вхождений подстроки в строку
     * @param string строка для поиска
     * @param sub подстрока, которую ищем
     * @return количество вхождений
     */
    public static int counterOccurrence(String string, String sub) {
        return (string + "\0").split(sub).length - 1;
    }
}
