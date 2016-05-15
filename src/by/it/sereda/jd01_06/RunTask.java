package by.it.sereda.jd01_06;

/**
 * Created by Igor on 15.05.2016.
 */
public class RunTask {
    public static void main(String[] args) {
        A1 a1 = new A1();
        System.out.println("Задание А1:");
        System.out.println();
        System.out.println("В каждом слове текста буквы №5-ю и 7-ю заменить символом #.");
        System.out.println("Для слов короче 5, корректировку не выполнять.");
        System.out.println();
        System.out.println("Результат A1:");
        A1.changeLetters();
        System.out.println();

        System.out.println();
        System.out.println("Задание А2:");
        System.out.println();
        System.out.println("Определить, сколько раз повторяется в тексте каждое слово,");
        System.out.println("которое встречается в нем.");
        System.out.println();
        System.out.println("Результат A2:");
        A2.countWordRepeat();
        System.out.println();

        System.out.println();
        System.out.println("Задание А3:");
        System.out.println();
        System.out.println("В стихотворении найти количество слов,");
        System.out.println("начинающихся и заканчивающихся гласной буквой.");
        System.out.println();
        System.out.println("Результат A3:");
        A3.countWordsWithTheVowelBegins();
        System.out.println();

        System.out.println();
        System.out.println("Задание B1:");
        System.out.println();
        System.out.println("Из текста удалить все слова длины 5,");
        System.out.println("начинающиеся на согласную букву.");
        System.out.println();
        System.out.println("Результат B1:");
        B1.removeWordsWithLength();
        System.out.println();

        System.out.println();
        System.out.println("Задание B2:");
        System.out.println();
        System.out.println("Вывести все предложения заданного текста");
        System.out.println("в порядке возрастания количества слов в каждом из них.");
        System.out.println("В предложениях убрать переносы строк.");
        System.out.println();
        System.out.println("Результат B2:");
        B2.sortSentenciesForMostWords();
        System.out.println();

        System.out.println();
        System.out.println("Задание B3:");
        char symbol = 'а';
        System.out.println();
        System.out.println("Отсортировать слова в тексте");
        System.out.println("по убыванию количества вхождений заданного символа \""+symbol+"\" ,");
        System.out.println("а в случае равенства — по алфавиту.");
        System.out.println();
        System.out.println("Результат B3:");
        B3.sortWordsForSymbol(symbol);
        System.out.println();






    }
}
