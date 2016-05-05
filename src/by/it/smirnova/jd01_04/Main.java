package by.it.smirnova.jd01_04;

/**
 * Created by Evgenia on 01.05.2016.
 */
public class Main {

    public static void main(String[] args) {

        //String line=InOut.consoleReadline();

        String line = "71 12 14 789 6 565 76 712";

        double v[] = InOut.stringLineToDoubleArray(line);


        System.out.println("массив v");

        InOut.arrayPrint(v, "v", 5);


        v=Utils.sortDoubleArray(v, true);


        System.out.println("Массив v отсортированный по возрастанию");
        InOut.arrayPrint(v, "v", 5);

        v=Utils.sortDoubleArray(v, false);
        System.out.println("Массив v отсортированный по убыванию");
        InOut.arrayPrint(v, "v", 5);

        System.out.println("Максимум массива Max="+Utils.maxDoubleArray(v));
        System.out.println("Минимум массива Min="+Utils.minDoubleArray(v));

    }
}
