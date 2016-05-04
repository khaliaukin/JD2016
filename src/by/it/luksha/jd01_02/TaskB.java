package by.it.luksha.jd01_02;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;

public class TaskB {

    /**
     * Метод определяет принадлежность числа к отрезку
     * @param number число int
     * @param n начало отрезка
     * @param m конец отрезка
     */
    public static void includeNumber(int number, int n, int m) {
        if (n < number && number < m)
            System.out.println("Число " + number + " входит в отрезок [" + n + ", " + m +"]");
        else
            System.out.println("Число " + number + " не входит в отрезок [" + n + ", " + m +"]");
    }

    /**
     * Метод выводит в консоль квадратную матрицу N x N заполненную числами от 1 до number
     * @param number число int
     */
    public static void matrix(int number) {
        //ищем размер size матрицы NxN
        int size = 1;
        while ((size*size) < number) {
            size++;
        }

        //первое число
        int count = 1;
        //массив NxN, заполняем числами от 1 до k, лишние ячейки заполняем нулями
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (count <= number) {
                    array[i][j] = count;
                    count++;
                }
                else
                    array[i][j] = 0;
            }
        }
        
        //вывод итоговой матрицы
        System.out.println("Для числа - " + number + " матрица:");
        for (int[] element: array) {
            for (int out: element) {
                System.out.printf("[%4d]", out);
            }
            System.out.println();
        }
    }

    /**
     * Метод вводит с консоли коэфициенты квадратного уравнения и находит его корни
     * @throws IOException
     */
    public static void quadEq() throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите значение коэфициента а:");
        //int a = Integer.parseInt(bufferedReader.readLine());
        int a = 2;
        System.out.println("Введите значение коэфициента b:");
        //int b = Integer.parseInt(bufferedReader.readLine());
        int b = -8;
        System.out.println("Введите значение коэфициента c:");
        //int c = Integer.parseInt(bufferedReader.readLine());
        int c = 3;
        //bufferedReader.close();
        System.out.printf("Квадратное уравнение %d*x^2 + %d*x + %d = 0", a, b, c);
        System.out.println();

        //считаем дискриминант
        double discr = b*b - 4*a*c;
        System.out.println("Дискриминант = " + discr);
        if (discr > 0)
        {
            double x1 =  ((0 - b) + Math.sqrt(discr))/(2*a);
            double x2 =  ((0 - b) - Math.sqrt(discr))/(2*a);
            System.out.printf("Уравнение имеет два корня х1=%.2f и х2=%.2f", x1, x2);
        }
        else if (discr == 0)
        {
            float x1 = (0 - b) / (2 * a);
            System.out.printf("Уравнение имеет один корень х1=х2=%.2f", x1);
        }
        else if (discr < 0)
        {
            System.out.println("Уравнение корней не имеет");
        }

    }

    /**
     * Метод читает из консоли номер месяца и выводит его название
     * @param num номер месяца 0 < int <=12
     * @throws IOException
     */
    public static void numberOfMonth(int num) throws IOException {
        /*System.out.println("Введите номер месяца:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();*/
        String month = null;
        if (1 <= num && num <= 12) {
            switch (num) {
                case 1:
                    month = "январь";
                    break;
                case 2:
                    month = "февраль";
                    break;
                case 3:
                    month = "март";
                    break;
                case 4:
                    month = "апрель";
                    break;
                case 5:
                    month = "май";
                    break;
                case 6:
                    month = "июнь";
                    break;
                case 7:
                    month = "июль";
                    break;
                case 8:
                    month = "август";
                    break;
                case 9:
                    month = "сентябрь";
                    break;
                case 10:
                    month = "октябрь";
                    break;
                case 11:
                    month = "ноябрь";
                    break;
                case 12:
                    month = "декабрь";
                    break;
            }
            System.out.println("Число: " + num + ", месяц: " + month);
        }
        else
            System.out.println("Число " + num + " некорректно.");
    }
}
