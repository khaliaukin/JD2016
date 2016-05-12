package by.it.sinkevich.jd01_06;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание А.
 *
 * @author Sinkevich Denis
 */
class TaskA {

    String task1() {
        //Создаём обект типа StringBuider, т.к. в нём будем изменять символы, а String для этого не подходит
        StringBuilder poem = new StringBuilder(PoemText.getPoemtext());
        //Паттерн для поиска всех русских слов в текстке длиной больше 5
        Pattern pattern = Pattern.compile("[А-Яа-яЁё]{5,}");
        //Matcher на основе нашего паттерна ищет все его вхождения в тексте
        Matcher matcher = pattern.matcher(PoemText.getPoemtext());
        while (matcher.find()) {
            //После получения слова, с помощью методов .start и .end вычисляем длину слова и меняем нужные индексы
            //в poem на '#'
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
        //Обратный паттерн для поиска слов, подходит для разбивания строки на слова
        Pattern pattern = Pattern.compile("[^А-Яа-яЁё]+");
        String[] words = pattern.split(PoemText.getPoemtext());
        //Создаём словарь, где ключ -- это слово в тексте, а значение -- количество его повторений
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            //Преобразовываем все слова в один регистр
            word = word.toLowerCase();
            //Заполняем словарь
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

    //Этот метод я решил реализовать так: сначала найти все слова в тексте, а уже потом проверять их на гласные
    int task3() {
        //Делим текст на слова
        Pattern pattern = Pattern.compile("[^А-Яа-яЁё]+");
        String[] words = pattern.split(PoemText.getPoemtext());
        //Паттерн который проверит слово на наличие гласных в начале и в конце слова учитывая, что оно может состоять
        //из одной гласной буквы
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
