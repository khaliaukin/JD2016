package by.it.belsky.jd01_02.TaskB;

import java.io.IOException;

/**
 * Created by misha on 01.05.2016.
 */
public class Util {
    public static void main(String[] args) throws IOException {
        String line ="12 345 67 49 57 89 456";
        int v[] = TaskB2.stringLineToIntArray(line);
        System.out.println( "Maccив v" );
        TaskB2.arrayPrint(v, "v", 5);

        {

            TaskB2.ConsoleReadline();

        }
    }

}
