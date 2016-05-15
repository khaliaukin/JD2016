package by.it.kust.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 15.05.2016.
 */
public class TaskB {
    public static void deleteWords(){
        StringBuilder text =new StringBuilder(Poem.lukomor);
        String regex = "\\b([а-яА-ЯёЁ^аоуиыэюяеёАОУИЫЭЮЯЕЁ]{1})([а-яА-ЯёЁ]{4})\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        while (m.find()) {
            text.delete(m.start(), m.start()+6);
            m.reset();
        }
        System.out.println("Из текста удалены все слова из 5 букв, начинающиеся с согласной:\n" + text);
        System.out.println("=========================================================================================");
    }

    public static void sortSentences(){
        StringBuilder text =new StringBuilder(Poem.lukomor);
        //убираем перенос строк
        String regex1 = "\\n";  //поиск переноса строк
        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p1.matcher(text);
        while (m1.find()){
            int start = m1.start();
            text.replace(start, start+1, " ");
        }
        //выводим каждое предложение с новой строки
        String regex2 = "([^...][\\.]\\s)|(!\\s)";  //поиск конца предложения
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(text);
        int sent = 1;
        while (m2.find()) sent++;   //считаем кол-во предложений
        System.out.print("Количество предложений = " + sent);
        //поместим предложения в массив
        String[] arr = p2.split(text);
        String regex3 = "\\b[а-яА-ЯёЁ]+\\b";  //поиск слов в предлодениях
        Pattern p3 = Pattern.compile(regex3);
        //массив для хранения кол-ва слов предложений, размерность = размерности массива с предложениями
        int[] num = new int[arr.length];
        int words = 0;  //счетчик слов в предложении
        for (int i = 0; i<arr.length; i++){
            Matcher m3 = p3.matcher(arr[i]); //ищем слова в каждом предложении
            while (m3.find()) words++;
            num[i] = words;   //получим массив с кол-вом слов для каждого предложения
            words = 0;
            m3.reset();
        }
        for (int i = 0; i < num.length; i++){  //пузырьковая сортировка по возрастанию сразу 2-х массивов
            for (int j = i+1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int temp1 = num[i];
                    String temp2 = arr[i];
                    num[i] = num[j];
                    arr[i] = arr[j];
                    num[j] = temp1;
                    arr[j] = temp2;
                }
            }
        }
        System.out.println("\nПредложения после сортировки по возрастанию кол-ва слов в каждом предложении:");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        System.out.println("=========================================================================================");
    }

    public static void sortWords(){
        String s = "л";
        System.out.println("Сортируем слова по убыванию кол-ва вхождений символа: " + s);
        String[] arr = Poem.lukomor.toLowerCase().split("[^а-яА-ЯёЁ]+");
        Arrays.sort(arr);
        Pattern p = Pattern.compile(s);
        int[] kol = new int[arr.length];  //массив для хранения кол-ва повторений в каждом слове символа "о"
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;  //счетчик повторений символа
            Matcher m = p.matcher(arr[i]);  //ищем символ в каждом слове
            while (m.find()){
                counter++;
            }
            kol[i] = counter;   //кол-во повторений помещвем в отдельный массив
            m.reset();
        }

        int temp1;
        String temp2;
        for (int i = 0; i<kol.length; i++) {   //сортируем массив по кол-ву повторений символа
            for (int j = i + 1; j < kol.length; j++) {
                if (kol[i]<kol[j]){
                    temp1 = kol[i];
                    temp2 = arr[i];
                    kol[i] = kol[j];
                    arr[i] = arr[j];
                    kol[j] = temp1;
                    arr[j] = temp2;
                }
            }
        }

        for (int i = 0; i < arr.length; i++)
            System.out.println("\"" + arr[i] +"\"" + " " + kol[i] + " символ(ов) " + "\"" + s + "\"");
        System.out.println("=========================================================================================");
    }
}
