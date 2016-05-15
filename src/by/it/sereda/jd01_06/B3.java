package by.it.sereda.jd01_06;

import java.util.Arrays;

public class B3 {
    public static void sortWordsForSymbol(char symb) {

        StringBuilder textsb = new StringBuilder(Data.lukomor);
        String text = textsb.toString();
        String wordspatt = "[^а-яА-ЯёЁ]+";
        String[] arraywords = text.split(wordspatt);
        //для сортировки слов с использованием Arrays.sort
        //все слова из массива arraywords (массив хранит отдельные слова) переводим в строчные буквы
        for (int i = 0; i < arraywords.length; i++)
            arraywords[i] = arraywords[i].toLowerCase();

        Arrays.sort(arraywords);

        //массив, который будет хранить количество вхождений заданного символа в каждое из слов
        int[] numberofletters = new int[arraywords.length];

        //каждое слово, являющееся элементом массива слов arraywords проверем на количество вхождений заданного символа

        for (int i = 0; i < arraywords.length; i++) {
            int number = 0;
            for (int j = 0; j < arraywords[i].length(); j++) {
                if (arraywords[i].charAt(j) == symb || arraywords[i].charAt(j) == Character.toUpperCase(symb)) {
                    //выше избыточное условие проверки буквы слова,
                    //на соответствие заданному символу в прописной форме записи
                    number++;
                }
                //это значение number, заносим в массив к-ва вхождений numberofletters с тем же индексом i
                numberofletters[i] = number;
            }
        }

        //цикл сортировки значений массива numberofletters (массив к-ва вхождений символа в слово)
        // цикл по убыванию

                for (int i = 0; i < arraywords.length - 1; i++) {
            for (int j = i + 1; j < arraywords.length; j++) {
                if (numberofletters[i] < numberofletters[j]) {
                    // если условие выполняется - меняем соответсвтующие соседние ячейки в массиве numberofletters
                    int numberofletterstemp = numberofletters[i];
                    numberofletters[i] = numberofletters[j];
                    numberofletters[j] = numberofletterstemp;
                    // а также в массиве arraywords, в котором хранится соответствующее слово, с тем же индексом
                    String arraywordstemp = arraywords[i];
                    arraywords[i] = arraywords[j];
                    arraywords[j] = arraywordstemp;
                }
            }
        }
        System.out.println("Слова отсортированные по убыванию количества вхождений в них, символа \""+symb+"\"");

        //выводим результат на консоль
        for (int i = 0; i < arraywords.length; i++) {
            System.out.println("В слове: \""+arraywords[i]+"\" символ \""+symb+"\" входит "+numberofletters[i]+"-раз");
        }
    }
}
