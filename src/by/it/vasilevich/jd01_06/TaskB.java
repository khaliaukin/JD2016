package by.it.vasilevich.jd01_06;


import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class TaskB {
    public static void main (String[]args) throws IOException {
        /**
         *задание B1
         */
        System.out.println("Из текста удалить все слова длины 5, начинающиеся на согласную букву:\n");
        StringBuilder sb = new StringBuilder(Utils.lukomor);//для работы над текстом создаем StringBuilder
        Pattern p = Pattern.compile("[а-яА-ЯёЁ]+");//создаем паттерн,в которм прописываем требования для отбора слов
        Matcher matcher = p.matcher(sb);//при помощи маттчера находим слова по требованию паттерна
        while (matcher.find())
            if (matcher.group().length() == 5)//отбираем слова длинной 5 символов
                if (Utils.Otbor2(matcher.group())) {//отбираем слова начинающиеся на согласную
                    //System.out.println(matcher.group());
                    sb.delete(matcher.start(), matcher.end() + 1);//удаляем слово, а также пробел идущий после него
                    matcher.reset();//перегружаем шаблон текста, в котором уже отсутствует удаленное слово
                }
        System.out.println(sb);//выводим текст с изменениями
        System.out.println("\n-----------------------------------");

        /**
         *задание B2
         */
        System.out.println("Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них. В предложениях убрать переносы строк:\n");
        sb = new StringBuilder(Utils.lukomor);//для работы над текстом создаем StringBuilder
        String[] array = sb.toString().trim().split("[.!?]+\\s*");
        //String[]words;
        int[] arr = new int[array.length];
        int[] quantity = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int x = 0;
            String[] words = array[i].trim().split(" ");
            for (int j = 0; j <= words.length-1; j++) {
                x++;
            }
            quantity[i] = x;
            arr[i] = x;
        }
        for (int i = 0; i < quantity.length; i++){
            for (int j = i+1; j < quantity.length; j++){
                if (quantity[i] > quantity[j]){
                    int x = quantity[i];
                    quantity[i]=quantity[j];
                    quantity[j]=x;
                }
            }
        }
        for (int i = 0; i<quantity.length; i++){
            for (int j = 0; j<quantity.length; j++){
                if (arr[i]==quantity[j]){
                    System.out.println(array[j].replaceAll("\n", " "));
                }
            }
        }
        System.out.println("\n-----------------------------------");

        /**
         *задание B3
         */
        System.out.println("Отсортировать слова в тексте по убыванию количества вхождений заданного символа, а в случае равенства — по алфавиту:\n");
        System.out.println("Введите заданный символ:");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));//вводим заданный символ
        String n = r.readLine();
        sb = new StringBuilder(Utils.lukomor.toLowerCase());//для работы над текстом создаем StringBuilder и приводим текст к нижнему регистру
        String[] list = sb.toString().trim().split("[^а-яА-ЯЁё]+");//создаем массив из слов
        Arrays.sort(list);//сортируем слова по алфавиту
        for (int i = 0; i < list.length; i++) {//сортируем массив из слов по уменьшению количества вхождений заданного символа
            for (int j = 0; j < list.length - 1; j++) {
                int x = Utils.repeat(list[j], n);//с помощью метода repeat узнаем количество повторений
                int y = Utils.repeat(list[j+1], n);
                if (x < y)//сравниваем количество повторений и проводим сортировку
                {
                    String s = list[j];
                    list[j] = list[j+1];
                    list[j+1] = s;
                }
            }
        }
        System.out.println("Слова отсортированы по количеству вхождений символа " + n + ":");
        for (String abs: list) {
            System.out.println((abs));
            //выводим массив слов, отсортированый по количеству вхождений символа
        }
    }
}
