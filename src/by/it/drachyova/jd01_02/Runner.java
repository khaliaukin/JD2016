package by.it.drachyova.jd01_02;

import java.io.IOException;
//import java.util.Scanner;

public class Runner {

    public static void main(String[] args) throws IOException{
	// Ввести n чисел с консоли через пробел
    // String line = Util.getOneLine();
        String line = "11 2876 3433 1276543 67 4516 333 22 4853";
        int arr[]=Util.lineToArray(line);

        // A1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        String minLen=TaskA.getMinLenght(arr);
        System.out.println(minLen);
        String maxLen=TaskA.getMaxLenght(arr);
        System.out.println(maxLen);

        //A2.Вывести на консоль те числа, длина которых меньше среднего арифметического.
        Double mean = TaskA.meanLenght(arr);
        System.out.println("Числа, длина которых меньше  "+mean+" символов таковы: ");
        for(Integer i:arr){
            if(i.toString().length()<mean)
                System.out.print(i+" ");
        }

        //A3.Найти число, состоящее только из различных цифр. Если таких чисел несколько, вывести первое из них
        for (Integer i:arr){
            if(TaskA.uniqueDigits(i)) {
                System.out.println("\n" + "Найдено число из разных цифр " + i);
                break;
            }
        }

        //B1. Определить принадлежность некоторого значения k интервалу [n,m].
        //Scanner numberK = new Scanner(System.in);
        //Scanner numberN = new Scanner(System.in);
        //Scanner numberM = new Scanner(System.in);
        //System.out.println("\n" +"Введите целое число k: ");
        // int k = numberK.nextInt();
        //System.out.println("\n" +"Введите целое число n: ");
        // int n = numberN.nextInt();
        // System.out.println("\n" +"Введите целое число m: ");
        //
        // int m = numberM.nextInt();
        int k=5;
        int n=1;
        int m=9;
        TaskB.isItInRange(k,n,m);

        //B2. Вывести числа от 1 до k в виде матрицы NxN слева направо и сверху вниз.
        // Scanner scannerK = new Scanner(System.in);
        // Scanner scannerN = new Scanner(System.in);
        // System.out.println("\n" +"Введите целое число k: ");
        // int scK = scannerK.nextInt();
        // System.out.println("\n" +"Введите целое число n: ");
        //int scN = scannerN.nextInt();
        int scK=7;
        int scN=3;
        TaskB.toMatrix(scK,scN);

        //B3.Найти корни квадратного уравнения. Параметры уравнения
        // передавать с коммандной строкой.
        // int a =Integer.parseInt(args[0]) ;
        // int b = Integer.parseInt(args[1]);
        // int c = Integer.parseInt(args[2]);
        int a=2;
        int b=-5;
        int c=3;
        TaskB.adjustRoots(a, b, c);

        //B4.Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего
        // данному числу. Осуществить проверку корректности ввода чисел.
        // Scanner month = new Scanner(System.in);
        // System.out.println("\n" +"Введите номер месяца: ");
        //  if(month.hasNextInt()) {
        //      int numberMonth = month.nextInt();
        //          if((numberMonth > 0) && (numberMonth <= 12))
                        int numberMonth=3;
                        TaskB.whatMonthIsIt(numberMonth);
        // }
        // else
        // System.out.println("Вы ввели некорректное число");

        //Ввести с консоли n-размерность матрицы a[n][n]
        //Задать значения элементов матрицы в интервале значений от -n до n с помощью датчика случайных чисел

        //Scanner size = new Scanner(System.in);
        //System.out.println("\n" +"Введите размерность матрицы: ");
        // int nSize = size.nextInt();
        int nSize=5;
        int ar[][]=new int[nSize][nSize];
        for(int i=0;i<ar.length;i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = (int) ((nSize*2+1) * Math.random()-nSize);
            }
        }
        Util.showMatrix(ar);
        //С2. Транспонировать матрицу
        TaskC.transpMatrix(ar);
    }
}
