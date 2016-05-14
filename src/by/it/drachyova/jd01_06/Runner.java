package by.it.drachyova.jd01_06;


public class Runner {
    public static void main(String[] args) {
        System.out.println("A1. В каждом слове текста буквы №5 и №7 заменить символом #. Для слов короче 5 " +
                "корректировку не выполнять.");
        TaskA.change5and7Letters(Text.lukomor);
        System.out.println();
        System.out.println("A2. Определить, сколько раз повторяется в тексте каждое слово, которое встречается в нём.");
        TaskA.howManyTimes(Text.lukomor);
        System.out.println();
        System.out.println("A3. В стихотворении найти количество слов, начинающихся и заканчивающихся гласной буквой.");
        TaskA.howManyWords(Text.lukomor);
        System.out.println();
        System.out.println("B1. Из текста удалить все слова длины 5, начинающиеся на согласную букву.");
        TaskB.deleteWords(Text.lukomor);
        System.out.println();
        System.out.println("C3. Все слова текста рассортировать впорядке убывания их длинн, при этом все слова " +
                "одинаковой длины, рассортировать в порядке возрастания в них количества гласных букв. Одинаковые " +
                "слова сгруппировать и выводить один раз с числом их повторов в тексте.");
        TaskC.sortWords(Text.lukomor);
    }
}
