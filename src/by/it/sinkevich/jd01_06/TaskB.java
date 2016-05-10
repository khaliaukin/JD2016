package by.it.sinkevich.jd01_06;

import java.util.LinkedList;
import java.util.List;
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
}
