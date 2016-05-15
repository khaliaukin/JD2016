package by.it.sereda.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B1 {

    static boolean soGlasnaya(String word){
        //паттерн для согласных букв
        String soglas="бвгджзклмнпрстфхцчшщБВГДЖЗКЛМНПРСТФХЦЧШЩ";
        char first=word.charAt(0);
        //вернем true если согласная в начале
        return (soglas.indexOf(first)>=0);
    }

    public static void removeWordsWithLength() {

        StringBuilder text=new StringBuilder(Data.lukomor);
        Pattern p=Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher m=p.matcher(text);
        while (m.find()) {
            if ((soGlasnaya(m.group()) && m.group().length()==5)) {
                text.delete(m.start(), m.end());
                m.reset();
                }
            }
        System.out.println(text);
    }
}
