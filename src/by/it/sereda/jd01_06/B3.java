package by.it.sereda.jd01_06;

import java.util.Arrays;

public class B3 {
    public static void sortWordsForSymbol() {
        String[] arrayofwords = Data.lukomor.toUpperCase().split("[^а-яА-ЯёЁ]+");
        Arrays.sort(arrayofwords);








    }
}
