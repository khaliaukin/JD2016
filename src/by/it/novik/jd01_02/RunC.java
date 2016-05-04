package by.it.novik.jd01_02;

import by.it.novik.jd01_02.Tasks.TaskC;

/**
 * Created by Kate Novik on 28.04.2016.
 */
public class RunC {

    public static void main(String[] args) {
        /**
         * Создание объекта класса TaskC
         */
        TaskC taskC = new TaskC();
        /*TaskC taskC = new TaskC(new int[][]{
                {-3, -2, 6, 9, 9, 8},
                {-3, -2, 6, 9, 9, 8},
                {-3, -2, 6, 10, 9, 8},
                {-3, -2, 6, 9, 9, 8},
                {-3, 10, 6, 9, 9, 8},
                {-3, 10, 6, 9, 9, 8}
        }, 6);*/

        taskC.task1();
        taskC.task2();
        taskC.task3();
        taskC.task4();
        taskC.task5();
        taskC.task6();
        taskC.task7();
    }
}
