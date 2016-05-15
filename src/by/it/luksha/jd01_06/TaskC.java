package by.it.luksha.jd01_06;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskC {

    /**
     * Метод выполняет форматирование с выравниванием по обоим краям. Для этого добавляет дополнительные пробелы между словами.
     */
    public static void formatEdgewise() {
        System.out.println("1. Выполнить форматирование с выравниванием по обоим краям. Для этого добавить дополнительные пробелы между словами.");

        //разбитие строки с текстом на массив строк
        String[] lines = Data.lykomorie.split("\\n");

        //поиск самой длинной строки
        int maxLinesLeght = Integer.MIN_VALUE;
        for (String line: lines) {
            maxLinesLeght = maxLinesLeght > line.length() ? maxLinesLeght : line.length();
        }

        //перебор каждой строки и редактирование ее ширины
        for (int i = 0; i < lines.length; i++) {

            if (lines[i].length() < maxLinesLeght)
            {
                int counterSpace = maxLinesLeght - lines[i].length();//находит кол-во недостающих пробелов в данной строке
                String[] words = lines[i].split("\\s");//разбивает строку на массив слов

                int spaceBounden = counterSpace/(words.length - 1);//кол-во обязательных пробелов между словами
                counterSpace = counterSpace % (words.length - 1);//оставшиеся пробелы

                //Строка с обязательными после каждого слова пробелами
                String space = "";
                for (int j = 0; j < spaceBounden; j++) {
                    space += " ";
                }

                //SB для отфомартированной строки
                StringBuilder formattedLine = new StringBuilder();

                //форматируем строку
                for (int j = 0; j < words.length; j++) {
                    if (j != words.length - 1)
                    {
                        formattedLine.append(words[j]).append(" ").append(space);//после слова добавляется пробел, который был до форматирования
                        if (counterSpace != 0) {
                            formattedLine.append(" ");
                            counterSpace--;
                        }
                    }
                    else
                        formattedLine.append(words[j]);

                }

                //вывод в консоль отформатированной строки
                System.out.println(formattedLine);

            }
            else
                System.out.println(lines[i]);
        }
    }

    /**
     * Метод складывает из случайных слов стихотворения строку ровно (!) в в миллион символов путем
     * конкатенации. Слова через пробел. Рассчитывает затраченное время в миллисекундах.
     * @return время в миллисекундах
     */
    public static long createPoemByConcat() {
        /*
            2. Сложить из случайных слов стихотворения строку ровно (!) в в миллион символов путем
            конкатенации. Слова через пробел. Последнее слово нужно подобрать по длине. Затем:
                • Определить время работы кода (тут удобно использовать System.currentTimeMillis() или аналог).
                • Ускорить процесс, используя класс StringBuilder (сделать второй метод).
                • Определить и вывести выигрыш в скорости (в микросекундах).
        */

        String poem = "";
        String[] dictionary = Data.lykomorie.split("[^а-яА-ЯЁё]+");
        int count = 1000000;

        long start = System.currentTimeMillis();
        for (int i = count; i > 0;) {
            String word = dictionary[random(0, dictionary.length - 1)];
            if (word.length() < i) {
                poem = poem.concat(word).concat(" ");
                i -= (word.length()+1);
            }
            else if (word.length() == i) {
                poem = poem.concat(word);
                i -= (word.length()+1);
            }
        }
        long end = System.currentTimeMillis();

        long delta = (end - start);

        System.out.println("Длинна строки - " + poem.length());
        System.out.println(poem);

        return delta;
    }

    /**
     * Метод складывает из случайных слов стихотворения строку ровно (!) в в миллион символов используя
     * класс StringBuilder. Слова через пробел. Рассчитывает затраченное время в миллисекундах.
     * @return время в миллисекундах
     */
    public static long createPoemByAppend() {
        StringBuilder poem = new StringBuilder();
        String[] dictionary = Data.lykomorie.split("[^а-яА-ЯЁё]+");
        int count = 1000000;

        long start = System.currentTimeMillis();
        for (int i = count; i > 0;) {
            String word = dictionary[random(0, dictionary.length - 1)];
            if (word.length() < i) {
                poem.append(word).append(" ");
                i -= (word.length()+1);
            }
            else if (word.length() == i) {
                poem.append(word);
                i -= (word.length()+1);
            }
        }
        long end = System.currentTimeMillis();

        long delta = (end - start);

        System.out.println("Длинна строки - " + poem.length());
        System.out.println(poem);

        return delta;
    }

    /**
     * Метод генерирует случайное число в интервале
     * @param start начало интервала
     * @param end конец интервала
     * @return случайное число
     */
    private static int random(int start, int end) {
        return start + (int)(Math.random() * ((end - start) + 1));
    }

    /**
     * Метод сортирует и выводит в консоль результат сортировки (условие согласно заданию №3).
     */
    public static void sort() {
        /**
         * 3. Все слова текста рассортировать в порядке убывания их длин, при этом все слова
         * одинаковой длины рассортировать в порядке возрастания в них количества гласных букв.
         * Одинаковые слова сгруппировать и выводить один раз с числом их повторов в тексте.
         * Регистр неважен.
         */

        //деление текста на массив слов
        String[] words = Data.lykomorie.split("[^а-яА-ЯЁё]+");

        //перевод всех символов слов в нижний регистр
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }

        //группировка слов имеющих повторения и оставшихся
        ArrayList<String> listRepeatWords = new ArrayList<>();
        ArrayList<String> listWords = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            int count = 1;
            if (words[i].length() != 0)
            {
                for (int j = i+1; j < words.length; j++) {
                    if (words[i].equals(words[j]))
                    {
                        count++;
                        words[j] = "";
                    }
                }
                if (count > 1)
                    listRepeatWords.add("Слово \"" + words[i] + "\" встречается " + count + " раз(а)");
                else
                    listWords.add(words[i]);
            }
        }

        //сортировка с созданием Компаратора
        Collections.sort(listWords, new Comparator<String>() {
            @Override
            public int compare(String string1, String string2) {
                if (string1.length() != string2.length()) {
                    //слова разной длинны - сравниваем по длинне
                    return string1.length() > string2.length() ? -1 : 1;
                }
                else if (string1.length() == string2.length()) {
                    //слова одинаковой длинны - сравниваем по кол-ву гласных букв
                    Pattern pattern = Pattern.compile("[ёуеыаоэяию]{1}");
                    Matcher matcher1 = pattern.matcher(string1);
                    Matcher matcher2 = pattern.matcher(string2);
                    int count1 =0;
                    while(matcher1.find())
                    {
                        count1++;
                    }
                    int count2 =0;
                    while(matcher2.find())
                    {
                        count2++;
                    }
                    return count1 > count2 ? 1 : -1;
                }
                else
                    return 0;
            }
        });

        //вывод повторяющихся слов
        for (String out: listRepeatWords) {
            System.out.println(out);
        }

        //вывод остальных слов после сортировки
        for (String out: listWords) {
            System.out.println(out);
        }
    }
}
