package by.it.kust.jd01_02;

import com.sun.org.apache.bcel.internal.generic.I2F;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
       //Задания A
        //String line = "11 22 343 123 67 456 333 22 853";
        TaskA.beginTaskA();
        System.out.println();

        //Задания B
        TaskB.beginTaskB1();
        TaskB.beginTaskB2();
        TaskB.beginTaskB3();
        TaskB.beginTaskB4();

        //Задания С
        TaskC.beginTaskC();

    }
}
