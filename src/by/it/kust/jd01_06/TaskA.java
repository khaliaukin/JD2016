package by.it.kust.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 14.05.2016.
 */
public class TaskA {
    public static void replaceSymbol() {
        StringBuilder text = new StringBuilder(Poem.lukomor);
        Pattern p1 = Pattern.compile("[а-яА-ЯёЁ]{5,}");
        Matcher m1 = p1.matcher(text);
        while (m1.find()){
            int start = m1.start();
            int length = m1.group().length();
            text.setCharAt(start+4, '#');
            if (length > 6)
                text.setCharAt(start+6, '#');
        }
        System.out.print(text);
    }

    public static void numberOfWords(){
        String text = Poem.lukomor;
        String[] mastext = text.split("[^а-яА-ЯёЁ]+");
        for (int i = 0; i < mastext.length; i++){
            if (mastext[i].length() > 0) {
                int count = 1;
                for (int j = i +1; j < mastext.length; j++){
                    if (mastext[i].equals(mastext[j])){
                        count++;
                        mastext[j] = "";
                    }
                }
                System.out.println("Число повторов слова \n" + mastext[i] + "\nсоставляет " + count);
            }
        }
    }

    static boolean beginEndWithVowels(String word){
        String g = "аоуиыэюяеё";
        g = g + g.toUpperCase();
        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);
        return (g.indexOf(first)>=0 && g.indexOf(last)>=0);
    }

    public static void vowel(){
        StringBuilder text =new  StringBuilder(Poem.lukomor);
        Pattern p = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher m = p.matcher(text);
        int counter = 0;
        while (m.find())
            if (beginEndWithVowels(m.group())){
                counter++;
                System.out.println(m.group());
            }
        System.out.println("Количество слов, начинающихся и заканчивающихся на гласные: " + counter);
    }
}
