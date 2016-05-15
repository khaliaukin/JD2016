package by.it.vasilevich.jd01_06;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB {
    public static void main (String[]args) {
        StringBuilder sb = new StringBuilder(Utils.lukomor);//для работы над текстом создаем StringBuilder
        Pattern p = Pattern.compile("[а-яА-яёЁ]{5,}");//создаем паттерн,в которм прописываем требования для отбора слов
        Matcher matcher = p.matcher(sb);//при помощи маттчера находим слова по требованию паттерна
        while (matcher.find())
            if (Utils.Otbor2(matcher.group())) {
                System.out.println(matcher.group());
                char start = (matcher.group().charAt(0));
                char end = (matcher.group().charAt(matcher.group().length()-1));
                //sb.delete(start, end);
            }
        System.out.println(sb);//выводим текст с изменениями
    }
}
