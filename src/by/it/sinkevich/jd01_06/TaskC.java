package by.it.sinkevich.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание С
 *
 * @author Sinkevich Denis
 */
class TaskC {

    String task1() {
        //Разбиваем текст на строки для определения самой длинной строки
        String[] lines = PoemText.getPoemtext().split("\\n");
        //Массив содержащий значения длин каждой строки
        int[] lineLengths = new int[lines.length];
        for (int i = 0; i < lines.length; i++) {
            //Убираем лишние пробелы по краям строк, так последующий алгоритм будет добавлять пробелы к уже существующим
            lines[i] = lines[i].trim();
            lineLengths[i] = lines[i].length();
        }
        int maxLength = getMax(lineLengths);
        //Создаём объект типа StringBuilder. В нём будут проходить основные изменения
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern;
        Matcher matcher;
        String regex = " ";
        for (int i = 0; i < lines.length; i++) {
            //Паттерн для поиска пробелов в строке
            pattern = Pattern.compile(regex);
            //Вычисляем сколько пробелов нужно добавить в каждую строку
            int difference = maxLength - lineLengths[i];
            if (difference > 0) {
                stringBuilder.append(lines[i]);
                matcher = pattern.matcher(lines[i]);
                //Счётчик для количества вхождений паттерна, нужен для правильного пробега и вставки символов в StringBuilder.
                int countOfFinds = 0;
                for (int diff = 0; diff < difference; diff++) {
                    //Если находим пробел, вставляем в это же место ещё один
                    if (matcher.find()) {
                        int spaceIndex = matcher.start() + countOfFinds;
                        countOfFinds++;
                        stringBuilder.insert(spaceIndex, " ");
                    } else {
                        //Если пробелов в строке больше нет, то меняем паттерн на поиск большего числа пробелов,
                        //обнуляем счётчик вхождений и уменьшаем итератор diff на единицу
                        pattern = Pattern.compile(regex.concat(" "));
                        matcher = pattern.matcher(stringBuilder.toString());
                        countOfFinds = 0;
                        diff--;
                    }
                }
                lines[i] = stringBuilder.toString();
                //Очищаем StringBuuilder
                stringBuilder.delete(0, stringBuilder.length());
            }
        }
        String result = "";
        for (String line : lines) {
            result = result.concat(line).concat("\n");
        }
        System.out.println("Выполнить форматирование с выравниванием по обоим краям. " +
                "Для этого добавить дополнительные пробелы между словами.");
        return result;
    }

    long task2(boolean isStringBuiderOn) {
        //Засекаем время начала выполнения метода
        long startTime = System.currentTimeMillis();
        //Делим текст на слова
        String[] words = PoemText.getPoemtext().split("[^А-Яа-яЁё]+");
        String result;
        //Делаем разветвление программы в зависимости от того, надо ли использовать StringBuilder
        if (isStringBuiderOn) {
            StringBuilder stringBuilder = new StringBuilder();
            concatMillionSymbols(stringBuilder, words);
            result = stringBuilder.toString();
        } else {
            result = concatMillionSymbols(words);
        }
        System.out.println("Сложить из случайных слов стихотворения строку ровно (!) в миллион символов путём конкатенации. " +
                "Слова через пробел. Последнее слово нужно подобрать по длине.");
        System.out.println("Проверка длины строки(должна быть равна 1'000'000): " + result.length());
        long endTime = System.currentTimeMillis();
        //Время выполнения метода
        return endTime - startTime;
    }

    private int getMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Класс создаёт строку в миллион символов используя StringBuilder
     *
     * @param builder StringBuilder в котором проводятся все изменения
     * @param words   массив слов, из которых, случайным образом создаётся строка
     */
    private void concatMillionSymbols(StringBuilder builder, String[] words) {
        //Создаём массив в котором будут хранится все длины слов массива words
        int[] wordsLengths = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            wordsLengths[i] = words[i].length();
        }
        //Максимальная длина слова, нужна для того, чтобы не выйти за переделы длины в 1000000 символов
        int maxLength = getMax(wordsLengths);
        //Создание строки
        while (builder.length() < 1000000 - maxLength) {
            builder.append(getRandomWord(words)).append(" ");
        }
        //Длина последнего слова
        int lastWordLength = 1000000 - builder.length();
        //Находим нужное слово
        for (int i = 0; i < wordsLengths.length; i++) {
            if (wordsLengths[i] == lastWordLength) {
                builder.append(words[i]);
                break;
            }
        }
    }

    /**
     * Класс создаёт строку в миллион символов путём конкатенации
     *
     * @param words массив слов, из которых, случайным образом создаётся строка
     * @return сроку длиной в миллион символов
     */
    private String concatMillionSymbols(String[] words) {
        int[] wordsLengths = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            wordsLengths[i] = words[i].length();
        }
        int maxLength = getMax(wordsLengths);
        String result = "";
        while (result.length() < 1000000 - maxLength) {
            result = result.concat(getRandomWord(words).concat(" "));
        }
        int lastWordLength = 1000000 - result.length();
        for (int i = 0; i < wordsLengths.length; i++) {
            if (wordsLengths[i] == lastWordLength) {
                result = result.concat(words[i]);
                break;
            }
        }
        return result;
    }

    /**
     * Класс возвращает случайное слово из переданного массива слов
     *
     * @param words массив слов, из которых, случайным образом выбирается одно слово
     * @return возвращает случайное слого из введённого массива
     */
    private String getRandomWord(String[] words) {
        int randomIndex = (int) (Math.random() * words.length);
        return words[randomIndex];
    }
}
