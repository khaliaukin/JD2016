package by.it.sinkevich.jd01_06;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Sinkevich Denis on 06.05.2016.
 */
class TaskA {

    String task1() {
        StringBuilder poem = new StringBuilder(PoemText.getPoemtext());
        Pattern pattern = Pattern.compile("[А-Яа-яЁё]{5,}");
        Matcher matcher = pattern.matcher(PoemText.getPoemtext());
        while (matcher.find()) {
            int startIndex = matcher.start();
            int endIndex = matcher.end();
            poem.setCharAt(startIndex + 4, '#');
            if (endIndex - startIndex >= 7) {
                poem.setCharAt(startIndex + 6, '#');
            }
        }
        System.out.println("В каждом слове текста буквы № 5-ю и 7-ю заменить символом #. " +
                "Для слов короче 5 корректировку не выполнять");
        return poem.toString();
    }

    Map<String, Integer> task2() {
        Pattern pattern = Pattern.compile("[^А-Яа-яЁё]+");
        String[] words = pattern.split(PoemText.getPoemtext());
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase();
            if (wordsMap.containsKey(word)) {
                wordsMap.put(word, wordsMap.get(word) + 1);
            } else {
                wordsMap.put(word, 1);
            }
        }
        System.out.println("Определить, сколько раз повторяется в тексте каждое слово, " +
                "которое встречается в нём.");
        for (String key : wordsMap.keySet()) {
            System.out.printf("Слово %s встречается в тексте %d раз(а).%n", key, wordsMap.get(key));
        }
        return wordsMap;
    }

    int task3() {
        Pattern pattern = Pattern.compile("[^А-Яа-яЁё]+");
        String[] words = pattern.split(PoemText.getPoemtext());
        pattern = Pattern.compile("^[АаЕеЁёИиОоУуЭэЮюЯя]([а-яё]*[аеёиоуыэюя]$)?");
        int count = 0;
        for (String word : words) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.matches()) {
                count++;
            }
        }
        System.out.println("В стихотворении найти количество слов, начинающихся и заканчивающихся гласной буквой.");
        return count;
    }
}
