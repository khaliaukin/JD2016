package by.it.sergeev.jd01_06;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {
    public static void PushkinB22() {
        String str = Pushkin.getString();
        int wordsCount;
        String[] sentences = str.split("\\.|\\!|\\?");
        // Делим на предложения. Подразумеваем, что делятся через точку, восклицательный знак или знак вопроса.


        for (int i=0;i<sentences.length;i++)
        {
            System.out.println("Предложение "+Integer.toString(i+1)+":"+sentences[i]);
            // делим предложение на слова. Слова через пробелы (количество пробелов не учитывается)
            String [] words = sentences[i].split("\\s+");
            wordsCount = 0;
            for (int j=0;j<words.length;j++)
                // словом будет считаться строка символов не являющаяся пробелом и длиной больше 1
                if ((words[j]!=" ") && (words[j].length()>1)) wordsCount++;
            System.out.println("Количество слов в предложении: "+wordsCount);
        }
    }
}