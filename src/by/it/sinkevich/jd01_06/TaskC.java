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

    private int getMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }
}
