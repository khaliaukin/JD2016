package by.it.vasilevich.jd01_02;

import java.io.IOException;


public class Runner {
    public static void main(String[] args) throws IOException {
        String line = Util.getOneLine();
        // Вводим в консоль числа через пробел;
        // Пример: String line = "2 5 9 12 5 123 95 77 19 88 108 30";
        int arr[] = Util.lineToIntArray(line);
        //получаем массив чисел
        String max=TaskA.getMax(arr);
        System.out.println(max);
        String min=TaskA.getMin(arr);
        System.out.println(min);

        double mean = TaskA.mean(arr);
        System.out.print("Числа меньше "+mean+" таковы: ");
        for (int i:arr){
            if (i<mean){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        for (int i:arr){
            if(TaskA.uniqueDigits(i)){
                System.out.print("Найдено число из разных цифр: "+i);
                break;
            }
        }
    }
}



