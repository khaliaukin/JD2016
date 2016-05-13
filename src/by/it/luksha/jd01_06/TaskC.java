package by.it.luksha.jd01_06;


import java.util.Date;

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
    *    2. Сложить из случайных слов стихотворения строку ровно (!) в в миллион символов путем
    *    конкатенации. Слова через пробел. Последнее слово нужно подобрать по длине. Затем:
    *        • Определить время работы кода (тут удобно использовать System.currentTimeMillis() или аналог).
    *        • Ускорить процесс, используя класс StringBuilder (сделать второй метод).
    *        • Определить и вывести выигрыш в скорости (в микросекундах).
    */


    /**
     * Метод складывает из случайных слов стихотворения строку ровно (!) в в миллион символов путем
     * конкатенации. Слова через пробел. Рассчитывает затраченное время в миллисекундах.
     * @return время в миллисекундах
     */
    public static long createPoemByConcat() {
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


}
