package by.it.sinkevich.jd01_02;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {
        //String line = Util.getString();
        String line = "77 23 45 321 -111 -586 7 16 77 999 -555 18 56 777 422 342";
        int[] arr = Util.lineToIntArray(line);

        System.out.println("Задание А!");
        TaskA taskA = new TaskA();
        int min = taskA.getMin(arr);
        int max = taskA.getMax(arr);
        System.out.printf("Наименьшее число: %d%nНаибольшее: %d%n", min, max);

        int[] shortest = taskA.getShortestNumbers(arr);
        int[] longest = taskA.getLongestNumbers(arr);
        System.out.print("Самое короткое число(числа): ");
        for (int num : shortest) {
            System.out.print(num + " ");
        }
        System.out.println("Его(их) длина: " + Util.getNumberLength(shortest[0]));
        System.out.print("Самое длинное число(числа): ");
        for (int num : longest) {
            System.out.print(num + " ");
        }
        System.out.println("Его(их) длина: " + Util.getNumberLength(longest[0]));

        double average = taskA.getAverage(arr);
        System.out.print("Числа, которые меньше среднего арифметического(" + average + "): ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        boolean isUniqueNumberFound = false;
        for (int num : arr) {
            if (taskA.hasUniqueDigits(num)) {
                System.out.println("Найдено число с различными цифрами: " + num);
                isUniqueNumberFound = true;
                break;
            }
        }
        if (!isUniqueNumberFound) {
            System.out.println("Чисел с различными цифрами найдено не было.");
        }
        /*
        System.out.println();
        System.out.println("Задание B!");
        TaskB taskB = new TaskB();
        taskB.isKBetweenMN();

        int[][] matrix = taskB.counterMatrix();
        System.out.println("Вывод матрицы от 1 до k");
        Util.matrixOut(matrix);

        System.out.println("Введите коэффициенты квадратного уравнения по очереди: ");
        System.out.print("a = ");
        int a = Util.getInt();
        System.out.print("b = ");
        int b = Util.getInt();
        System.out.print("c = ");
        int c = Util.getInt();
        taskB.findSquareRoots(a, b, c);

        System.out.print("Введите число от 1 до 12, для определения месяца: ");
        int monthNumber = Util.getInt();
        taskB.getMonthFromInt(monthNumber);
        */
        System.out.println();
        System.out.println("Задание С!");
        System.out.print("Введите размерность матрицы: ");
        int matrixLength = Util.getInt();
        TaskC taskC = new TaskC(matrixLength);
        taskC.sumBetweenTwoPositives();
        taskC.transpondMatrix();
        taskC.rotateMatrix();
        taskC.averageDifference();
    }
}
