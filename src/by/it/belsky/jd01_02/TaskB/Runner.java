package by.it.belsky.jd01_02.TaskB;

import java.io.IOException;

/**
 * Created by misha on 01.05.2016.
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        String line = "12 345 67 49 57 89 456";
        int v[] = TaskB2.stringLineToIntArray(line);
        System.out.println("Maccив v");
        TaskB2.arrayPrint(v, "v", 5);

        {

            String mas = TaskB2.ConsoleReadline();
            System.out.println("Введенная строка" + mas);
            int v2[] = TaskB2.stringLineToIntArray(mas);
            System.out.println("Maccив v2");
            TaskB2.arrayPrint(v2, "v", 5);
        }
    }

}
//Чтение строки с консоли и вывод массива