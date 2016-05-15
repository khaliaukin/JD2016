package by.it.vasilevich.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TaskA {

    public static void main (String[]args){
        /**
         *задание А1
         */
        StringBuilder sb = new StringBuilder(Utils.lukomor);//для работы над текстом создаем StringBuilder
        Pattern p = Pattern.compile("[а-яА-яёЁ]{5,}");//создаем паттерн,в которм прописываем требования для отбора слов
        Matcher matcher = p.matcher(sb);//при помощи маттчера находим слова по требованию паттерна
        while (matcher.find()) {//находим слова и вносим изменения
            int start = matcher.start();//индекс с которого начинается слово
            int length = matcher.group().length();//длинна слова в найденной группе слов
            sb.setCharAt(start + 4, '#');//заменяем 5ый символ на символ '#'
            if (length > 6)//если длина слова более шести символов, то выполняем ещё изменения
                sb.setCharAt(start + 6, '#');//заменяем 7ый символ на символ '#'
        }
        System.out.println(sb);//выводим текст с изменениями

        /**
         *задание А2
         */
        String s = Utils.lukomor;
        String[]array = s.split("[^а-яА-яёЁ]+");//создаем массив, где разделителем будут все символы кроме [а-яА-яёЁ]
        //перебираем слова, для определения количества повторов
        for (int i = 0; i < array.length; i++)
            if (array[i].length() > 0) {
                int count = 1;
                for (int j = i + 1; j < array.length; j++)
                    if (array[i].equals(array[j])) {//сравниваем значение первого слова со вторым
                        count++;//увеличиваем количество повторов
                        array[j] = "";//
                    }
                System.out.println("Слово \"" + array[i] + "\" повторяется " + count + " раз(а)");
            }

        /**
         *задание А3
         */

        sb = new StringBuilder(Utils.lukomor);//для работы над текстом создаем StringBuilder
        p = Pattern.compile("[а-яА-яёЁ]+");//создаем паттерн,в которм прописываем требования для отбора слов
        matcher = p.matcher(sb);//при помощи маттчера находим слова по требованию паттерна
        int count = 0;
        while (matcher.find())
            if (Utils.Otbor(matcher.group())) {
                count++;
                System.out.println(matcher.group());
            }
        System.out.println(count);
    }
}
