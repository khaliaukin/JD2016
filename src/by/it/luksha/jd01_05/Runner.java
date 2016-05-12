package by.it.luksha.jd01_05;

import by.it.luksha.jd01_05.Math_var7.Task7;
import by.it.luksha.jd01_05.Math_var7.*;

public class Runner {
    public static void main(String[] args) {
        //1
        System.out.printf("Результат для разбивки на части %4.5f \n", Task1.theFirst(12.75));
        System.out.printf("Результат для целой записи %4.5f \n", Task1.theSecond(12.75));

        //2
        System.out.printf("Решение функции %4.5f \n", Task2.calculate(1.21, 0.371));

        //3
        Task3.createTable(3.67, -10, 1, 1.25);

        //4
        Task4.multiply();

        //5
        Task5.calculate();

        //6
        double[] array = Task6.createArray();
        Task6.printArray(array, "ARRAY");
        double[] arrayNew = Task6.selectedNewElement(array);
        Task6.printArray(arrayNew, "ARRAX");
        System.out.println("Количествоэлементов с четным индексом - "+Task6.calcEven(arrayNew));

        //7
        double[] cos = Task7.createCosArray();
        double[] newCos = Task7.sortArray(cos);
        Task7.printArrayC(cos);
        System.out.println();
        Task7.printArrayB(newCos);
    }
}
