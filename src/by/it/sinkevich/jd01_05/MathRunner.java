package by.it.sinkevich.jd01_05;

import java.io.IOException;

/**
 * Created by Computer on 07.05.2016.
 */
public class MathRunner {

    public static void main(String[] args) throws IOException {
        TaskA taskA = new TaskA();
        double x = 234.1;
        taskA.task1(x, true);
        taskA.task1(x, false);
        System.out.println();
        taskA.task2(false);
        System.out.println("z = " + taskA.task2(true));
        System.out.println();
        taskA.task3();
        System.out.println();
        taskA.task4();
    }
}
