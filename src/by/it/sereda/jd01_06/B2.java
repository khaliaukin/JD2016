package by.it.sereda.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class B2 {
    public static void sortSentenciesForMostWords() {
        StringBuilder text = new StringBuilder(Data.lukomor);
        Pattern p = Pattern.compile("[\n]");
        Matcher m = p.matcher(text);
        while (m.find())
            text.replace(m.start(), m.start() + 1, " ");

        String sentancies[] = text.toString().trim().split("([^\\.][\\.]{1}\\s)|(! )");

        System.out.println("Выборка предложений:");

        printSentancies(sentancies);

        String[] arrayofwords;
        int[] numberwordsinsentencies = new int[sentancies.length];
        for (int i = 0; i < sentancies.length; i++) {
            arrayofwords = sentancies[i].trim().split("[^а-яА-ЯёЁ]+");
            numberwordsinsentencies[i] = arrayofwords.length;
        }

        for (int i = 0; i < sentancies.length - 1; i++) {
            for (int j = i + 1; j < sentancies.length; j++) {
                if (numberwordsinsentencies[i] > numberwordsinsentencies[j]) {
                    int numbertemp = numberwordsinsentencies[i];
                    numberwordsinsentencies[i] = numberwordsinsentencies[j];
                    numberwordsinsentencies[j] = numbertemp;
                    String sentanciestemp = sentancies[i];
                    sentancies[i] = sentancies[j];
                    sentancies[j] = sentanciestemp;
                }
            }
        }

        System.out.println("Результат:");

        printSentancies(sentancies);
    }

    public static void printSentancies(String arryforprint[]){
        int counterforprint = 1;

        for (String element : arryforprint) {
            System.out.println(counterforprint + ". " + element);
            counterforprint++;
        }
    }
}
