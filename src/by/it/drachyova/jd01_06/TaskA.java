package by.it.drachyova.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA {

    public static void change5and7Letters(String text){
        StringBuilder poem=new StringBuilder(text);
        Pattern patt=Pattern.compile("[а-яА-ЯёЁ]{5,}");
        Matcher match=patt.matcher(text);
        while (match.find()) {
            int start=match.start();
            int length=match.group().length();
            poem.setCharAt(start+4,'#');
            if (length>6)
                poem.setCharAt(start+6,'#');
        }
        System.out.print(poem);
    }

    public static void howManyTimes(String text){
        String[] wordArray = text.split("[^а-яА-ЯёЁ]+");
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].length()>0){
                int count=1;
                for (int j = i+1; j < wordArray.length; j++) {
                    if (wordArray[i].equals(wordArray[j])){
                        count++;
                        wordArray[j]="";
                    }
                }
                System.out.println("Слово \""+wordArray[i]+"\" повторяется "+count +" раз(а)");
            }
        }
    }
    static boolean vowels(String word) {
        String vowels = "яыуаиеоюэ";
        vowels = vowels + vowels.toUpperCase();
        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);
        return (vowels.indexOf(first) >= 0 && vowels.indexOf(last) >= 0);
    }

    public static void howManyWords(String text) {
        StringBuilder poem = new StringBuilder(text);
        Pattern patt = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher match = patt.matcher(text);
        int counter = 0;
        while (match.find())
            if (vowels(match.group())) {
                counter++;
            }
        System.out.println("Количество слов "+counter);
    }
}
