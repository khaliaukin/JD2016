package by.it.drachyova.jd01_06;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB {
    static boolean consonants(String word) {
        String consonants = "бвгджзйклмнпрстфхцчшщ";
        consonants = consonants + consonants.toUpperCase();
        char first = word.charAt(0);
        return (consonants.indexOf(first) >= 0);
    }

    public static void deleteWords(String text) {
        StringBuilder poem = new StringBuilder(text);
        Pattern patt = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher match = patt.matcher(text);
        while (match.find()) {
            if (match.group().length() == 5 && consonants(match.group())) {
                poem.replace(match.start(), match.end(), "     ");
            }
        }
        System.out.println(poem);
    }
}
