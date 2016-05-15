package by.it.sereda.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B1 {

    static boolean soGlasnaya(String word){
        //паттерн для гласных букв
        String soglas="бвгджзклмнпрстфхцчшщБВГДЖЗКЛМНПРСТФХЦЧШЩ";
        char first=word.charAt(0);
        //вернем true если согласная в начале
        return (soglas.indexOf(first)>=0);
    }

    public static void removeWordsWithLength() {
        //Получим строку в которой можно проводить замену символов.
        //это StringBuilder. В String такое делать нельзя.
        StringBuilder text=new StringBuilder(Data.lukomor);
        //сначала переберем все слова.
        //Нас интересуют слова с длиной 5
        //Паттерн для таких слов [а-яА-ЯёЁ]{5}
        Pattern p=Pattern.compile("[а-яА-ЯёЁ]+");
        //Теперь получим matcher - эта структура умеет находить слова по паттерну
        Matcher m=p.matcher(text);
        while (m.find()) {
            if ((soGlasnaya(m.group()) && m.group().length()==5)) {
                text.delete(m.start(), m.end());
                m.reset();
                }
            }
        //конец. печатаем массив
        System.out.println(text);
    }
}
