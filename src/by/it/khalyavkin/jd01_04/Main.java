package by.it.khalyavkin.jd01_04;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        // String line=InOut.consoleReadLine();
        String line = "71 12 14 789 6 565 76 712";
        int v[]=InOut.stringLineToIntArray(line);

        System.out.println("Массив v");
        InOut.arrayPrint(v,"v",5);

        v= Utils.sortIntArray(v, true);
        System.out.println("Массив v отсортированный по возрастанию");
        InOut.arrayPrint(v,"v",5);

        v= Utils.sortIntArray(v, false);
        System.out.println("Массив v отсортированный по убыванию");
        InOut.arrayPrint(v,"v",5);

        System.out.println("Максімум массіва Max="+ Utils.maxIntArray(v));
        System.out.println("Минимум массіва Min="+ Utils.minIntArray(v));



        String s=InOut.consoleReadLine();//тест ввода
        System.out.println(s);//тест вывода
    }
}

// gittest update
// gittest update 2