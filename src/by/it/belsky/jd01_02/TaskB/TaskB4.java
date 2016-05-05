package by.it.belsky.jd01_02.TaskB;

import java.util.Scanner;

/**
 * Created by misha on 04.05.2016.
 */
public class TaskB4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a;
        float x;
        System.out.println("Введите число от 1 до 12:");
        a = sc.nextInt();
        switch ( a) {
            case 1:
                System.out.println("Месяц, соответствующий данному числу:  Январь");
                break;
            case 2:
                System.out.println("Месяц, соответствующий данному числу:  Февраль");
                break;
            case 3:
                System.out.println("Месяц, соответствующий данному числуе:  Март");
                break;
            case 4:
                System.out.println("Месяц, соответствующий данному числу:  Апрель");
                break;
            case 5:
                System.out.println("Месяц, соответствующий данному числу:  Май");
                break;
            case 6:
                System.out.println("Месяц, соответствующий данному числу:  Июнь");
                break;
            case 7:
                System.out.println("Месяц, соответствующий данному числу:  Июль");
                break;
            case 8:
                System.out.println("Месяц, соответствующий данному числу: Август");
                break;
            case 9:
                System.out.println("Месяц, соответствующий данному числу: Сентябрь");
                break;
            case 10:
                System.out.println("Месяц, соответствующий данному числу: Октябрь");
                break;
            case 11:
                System.out.println("Месяц, соответствующий данному числу: Ноябрь");
                break;
            case 12:
                System.out.println("Месяц, соответствующий данному числу: Декабрь");
                break;
            default:

                System.out.println("Месяца, соответствующего данному числу, не существует");
        }

    }
}
