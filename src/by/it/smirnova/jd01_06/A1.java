package by.it.smirnova.jd01_06;


import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class A1 {

    public static void main(String[] args)
    {
        //Получим строку в которой можно проводить замену символов.

        StringBuilder text = new StringBuilder(Data.lukomor);

        //переберем все слова.
        //По условию нужны слова с длиной 5 и выше

        Pattern p = Pattern.compile("[а-яА-ЯёЁ]{5,}");

        //Получим matcher - эта структура умеет находить слова по паттерну
        Matcher m = p.matcher(text);
        while (m.find())
        {
            //пока находятся слова, заменяем в них 5 и 7 букву.
            int start = m.start(); //тут хранится индекс с которого начинается слово в StringBuilder-е text

            int length = m.group().length(); // длина найденого слова

            text.setCharAt(start + 4,'#');   //заменяет 5-й символ

            if (length > 6)
                text.setCharAt(start + 6,'#'); //заменяет 7-й символ, если позволяет длина слова
        }
        //печатаем массив
        System.out.print(text);
    }
}
