package by.it.sinkevich.jd01_06;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание В.
 *
 * @author Sinkevich Denis
 */
public class TaskB {

    String task1() {
        //Создаём стрингбилдер с текстом стиха для последующего удаления слов в нём
        StringBuilder poem = new StringBuilder(PoemText.getPoemtext());
        //Паттерн для поиска нужных слов
        Pattern pattern = Pattern.compile("\\b[[а-яА-Я]&&[^АаЕеЁёИиОоУуЫыЭэЮюЯя]][а-я]{4}\\b");
        Matcher matcher = pattern.matcher(PoemText.getPoemtext());
        //Список для хранения индексов вхождения паттерна
        List<Integer> index = new LinkedList<>();
        while (matcher.find()) {
            //Заполняем список в обратном порядке, для более удобной работы по удалению слов из poem
            index.add(0, matcher.start());
        }
        //Удаление слов
        for (int number : index) {
            poem.delete(number, number + 5);
        }
        System.out.println("Из текста удалить все слова длины 5, начинающиеся га согласную букву.");
        return poem.toString();
    }

    void task2() {
        //Паттерн для разделения всего текста на предложения
        Pattern pattern = Pattern.compile("[.!?;]+");
        String[] sentences = pattern.split(PoemText.getPoemtext());
        //Отсортированный словарь: ключ -- количество слов в предложении, значение -- предложения разделённые символом '#'
        Map<Integer, String> result = new TreeMap<>();
        String splitter = "#";
        //Перебираем все предложения, подсчитываем кол-во слов в каждом и заносим их в словарь
        for (String sentence : sentences) {
            //Убираем все переносы строк и лишние пробелы
            sentence = sentence.replaceAll("\\s+", " ").trim();
            //Паттерн для поиска слов в предложении
            pattern = Pattern.compile("\\b[А-Яа-яЁё]+\\b");
            Matcher matcher = pattern.matcher(sentence);
            int wordCount = 0;
            while (matcher.find()) {
                wordCount++;
            }
            //Заносим предложения в словарь, если в нём уже содержится предложения с таким количеством слов, то заносим его
            //через разделитель путём конкатенации к предыдущему предложению
            if (!result.containsKey(wordCount)) {
                result.put(wordCount, sentence);
            } else {
                result.put(wordCount, result.get(wordCount).concat(splitter).concat(sentence));
            }
        }
        System.out.println("Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них." +
                " В предложениях убрать переносы строк.");
        //Выводе уже автоматически отсортированной коллекции
        for (Integer key : result.keySet()) {
            System.out.println("Предложения в которых " + key + " слов(слова): ");
            if (result.get(key).contains("#")) {
                String[] values = result.get(key).split("#");
                for (String value : values) {
                    System.out.println(value);
                }
            } else {
                System.out.println(result.get(key));
            }
        }
    }
}
