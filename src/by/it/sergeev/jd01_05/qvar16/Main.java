package by.it.sergeev.jd01_05.qvar16;

import by.it.sergeev.jd01_05.qvar16.TaskA.*;

public class Main {
    public static void main(String[] args) {
        // A1
        double x = 1.095961246;
        System.out.println("Результат уравнения разбитого на части:");
        System.out.println(A1.equationInPart(x));
        System.out.println("Результат полного уравнения:");
        System.out.println(A1.equationFull(x));
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            // A2
        System.out.println(A2.calculate(0.1,0.2));
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            //A3
            A3.printTable();

            //A4
            System.out.println(A4.calculate());
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            //A5
            A5.calculate();
        }
    }
