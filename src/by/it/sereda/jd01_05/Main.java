package by.it.sereda.jd01_05;
import by.it.sereda.jd01_05.math.*;

public class Main {
    //пример решения задачек по модулю Math (уровни A и B)
//это реальный образец работы студентов прошлых выпусков JD01
//вы можете реализовать свой вариант примерно таким же образом
        public static void main(String[] args) {
            // Задача 1
            double ainput1 = 756.13;
            double x = 0.3;
            System.out.println("Задание №1:");
            System.out.println("a="+ainput1);
            System.out.println("x="+x);
            System.out.println("Результат:");
            System.out.println(Task1.optionA(ainput1,x));
            System.out.println(Task1.optionB(ainput1,x));

            // Задача 2
            double ainput2 = 0.3;
            double binput2 = -21.17;
            System.out.println("Задание №2:");
            System.out.println("a="+ainput2);
            System.out.println("b="+binput2);
            System.out.println("Результат:");
            System.out.println(Task2.calculate(ainput2, binput2));

            // Задача 3
            System.out.println("Задание №3:");
            Task3.printTable();

            // Задача 4
            System.out.println("Задание №4:");
            System.out.println("m="+Task4.calculate());

            // Задача 5
            System.out.println("Задание №5:");
            double r = 10000*0.491;
            Task5.calculate(r);

            // Задача 6
            System.out.println("Задание №6:");
            double a[] = Task6.getArray();
           //Task6 task6 = new Task6();
            System.out.println("Массив элементов попадающих в заданный интервал");
            Task6.arrayPrint(a,"Элемент", 5);
           // task6.printArray(a, "testname", true);
            //double b[] = task6.getEveryThirdElement(a);
           // task6.printArray(b, "array", true);
            double[] geoarray = Task6.getArrayMoreThan(a);
            System.out.println("Массив элементов отвечающих условию >3.5");
            Task6.arrayPrint(geoarray,"Элемент", 5);
            double geom = Task6.geometricMean(geoarray);
            System.out.println("Среднее геометрическое массива элементов >3.5 составляет:=:"+geom);
        }
}
