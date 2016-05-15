package by.it.drachyova.jd01_06;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskC {
    public static void sortWords(String text) {
        String[] wordsArray = text.split("[^а-яА-ЯёЁ]+");
        for (int i = 0; i < wordsArray.length-1; i++) {
            for (int j = i + 1; j < wordsArray.length; j++) {
                if (wordsArray[i].length() < wordsArray[j].length()) {
                    String temp = wordsArray[i];
                    wordsArray[i] = wordsArray[j];
                    wordsArray[j] = temp;
                    }
                else {
                    if (wordsArray[i].length() == wordsArray[j].length()) {
                        int countVowelsI = 0;
                        int countVowelsJ = 0;
                        Pattern patt = Pattern.compile("[яыуаиеоюэЯЫУАИЕОЮЭ]");
                        Matcher matchI = patt.matcher(wordsArray[i]);
                        while (matchI.find()) {
                            countVowelsI++;
                        }
                        Matcher matchJ = patt.matcher(wordsArray[i]);
                        while (matchJ.find()) {
                            countVowelsJ++;
                        }
                        if (countVowelsI > countVowelsJ) {
                            String temp = wordsArray[i];
                            wordsArray[i] = wordsArray[j];
                            wordsArray[j] = temp;
                        }
                    }
                    if (wordsArray[i].equalsIgnoreCase(wordsArray[j])) {
                        wordsArray[j] = "";
                    }
                }
            }
        }
        for (int i = 0; i < wordsArray.length; i++) {
            if (!(wordsArray[i].isEmpty())) {
            System.out.println(wordsArray[i]);
            }
        }
    }
}

