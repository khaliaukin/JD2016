package by.it.kust.jd01_02;

import com.sun.org.apache.bcel.internal.generic.I2F;

import java.io.IOException;

/**
 * Created by User on 28.04.2016.
 */
public class TaskB {
    static void beginTaskB1() throws IOException {
        //задание B1 (Определить принадлежность некоторого значения k интервалу [n, m])
        System.out.println("Задание В1: Введите 3 целых числа через пробел: \nначальное значение " +
                "интервала n, конечное значение интервала n, определяемое значение k");
        String line2 = Util.getOneLine();
        int arr[] = Util.lineToIntArray(line2);
        if (arr.length != 3) {
            System.out.println("Вы ввели неверное количество чисел");
        } else if (arr[0] < arr[1] && arr[2] >= arr[0] && arr[2] <= arr[1]) {
            System.out.println("Значение k = " + arr[2] + " принадлежит промежутку от " + arr[0] +
                    " до " + arr[1]);
        } else if (arr[0] > arr[1] && arr[2] <= arr[0] && arr[2] >= arr[1]) {
            System.out.println("Значение k = " + arr[2] + " принадлежит промежутку от " + arr[0] +
                    " до " + arr[1]);
        } else if (arr[0] == arr[1] && arr[2] == arr[0]) {
            System.out.println("Значение k = " + arr[2] + " принадлежит промежутку от " + arr[0] +
                    " до " + arr[1]);
        } else {
            System.out.println("Значение k = " + arr[2] + " не принадлежит промежутку от " + arr[0] +
                    " до " + arr[1]);
        }
    }
    static void beginTaskB2() throws IOException{
        //задание B2 (Вывести числа от 1 до r в виде матрицы N x N слева направо и сверху вниз.)
       System.out.println("Задание В2: Введите целое число r - предел чисел квадратной матрицы N x N");
        String line3 = Util.getOneLine();
        int r = Integer.parseInt(line3);
        System.out.println("Введите целое число n - размер матрицы N x N");
        String line4 = Util.getOneLine();
        int nn = Integer.parseInt(line4);
        int rr = r;    //запомним введеное значение предела чисел
        if (r != nn*nn) {
            r = nn*nn;     //преобразуем предел чисел, чтобы получилась квадр.матрица, основа - размер квюматрицы
        }
        int[] arr2 = new int[r];
        for (int i=0; i<arr2.length; i++) {
            if (i <= (rr-1)) {
                arr2[i] = i + 1;
            } else  {
                arr2[i] = 0;  //заполняем 0 добавленные элементы, чтобы получилась квадр.матрица
            }
        }
        System.out.println("Получается матрица слева направо:");
        Util.arrayPrintLeftToRight(arr2, "v", nn);   //печатаем одном.массив как квадр.матрицу слева направо
        System.out.println("Получается матрица сверху вниз:");
        Util.arrayPrintTopToBottom(arr2, "v", nn);   //печатаем одном.массив как квадр.матрицу сверху вниз
    }

    //задание B3 (Найти корни квадратного уравнения) ax2 + bx + c = 0. дискриминант D=bb-4ac.
    /*Если D>0, то уравнение имеет два различных вещественных корня.
    Если D=0, то уравнение имеет один корень (x1=x2=(-b)/(2 * a)).
    Если D<0, то уравнение не имеет вещественных корней.
    Корни квадратного уравнения (решения квадратного уравнения) находятся по формуле
    x1,2=(-b±√D)/2a  */
    static void beginTaskB3() throws IOException{
        System.out.println("\nЗадание В3 - решение квадратного уравнения ax2 + bx + c = 0, где а не равно 0");
        System.out.println("Введите число a (отличное от 0): ");
        String aa = Util.getOneLine();
        System.out.println("Введите число b: ");
        String bb = Util.getOneLine();
        System.out.println("Введите число c: ");
        String cc = Util.getOneLine();
        System.out.println("Наше уравнение: " + aa + "x^2+ " + bb + "x+ " + cc + " = 0, где a != 0" );
        double a = Double.parseDouble(aa);
        double b = Double.parseDouble(bb);
        double c = Double.parseDouble(cc);
        double d = b*b - 4*a*c;
        if (d < 0)
            System.out.println("Корней нет");
        else if (d == 0){
            double x = (-b)/2*a;
            System.out.println("x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2*a);
            double x2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }

    //задание B4 (Ввести число от 1 до 12. Вывести на консоль название месяца,
    // соответствующего данному числу
    static void beginTaskB4() throws IOException{
        System.out.println("\nЗадание B4: Введите целое число от 1 до 12, обозначающее месяц");
        String line5 = Util.getOneLine();

        try {   //проверка корректности ввода чисел.
            int r = Integer.parseInt(line5);
            switch (r) {
                case 1:
                    System.out.println("Январь");
                    break;
                case 2:
                    System.out.println("Февраль");
                    break;
                case 3:
                    System.out.println("Март");
                    break;
                case 4:
                    System.out.println("Апрель");
                    break;
                case 5:
                    System.out.println("Май");
                    break;
                case 6:
                    System.out.println("Июнь");
                    break;
                case 7:
                    System.out.println("Июль");
                    break;
                case 8:
                    System.out.println("Август");
                    break;
                case 9:
                    System.out.println("Сентябрь");
                    break;
                case 10:
                    System.out.println("Октябрь");
                    break;
                case 11:
                    System.out.println("Ноябрь");
                    break;
                case 12:
                    System.out.println("Декабрь");
                    break;
                default:
                    System.out.println("Вы ввели неверное число, месяца с таким номерои не существует");
            }
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат числа " + e);
        }
    }
}
