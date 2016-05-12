package by.it.kust.jd01_05;
import static java.lang.Math.*;


public class Task6 {
    /**
     * форирование массива по функции с аргументом из интервала (0;7)
     * @return одном.массив
     */
    public static double[] getArray(){
        int arrLength = 30;
        double[] array = new double[arrLength];
        for (double x = 0.0, j = 0; x < 7.0; x += 0.23, j+=1){
            array[(int)j] = x + sin(x);
            if (j == arrLength -1) break;
        }
        return array;
    }

    /**
     * печатаем массив
     * @param mas одном.массив
     * @param name имя массива
     * @param cols кол-во столбцов для вывода на печать
     */
    public static void arrayPrint(double[] mas, String name, int cols) {
        int col = 0;
        for (int i = 0; i<mas.length; i++) {
            System.out.print(name);     //печатаем имя массива
            System.out.printf("[% -3d]=%-9.4f ",i,mas[i]);    //печатаем значения
            col++;
            if ((0==col%cols)              //если конец колонки
                    || (mas.length-1==i))   //или конец массива
            {
                System.out.println();      //тогда напечатаем перевод строки
            }
        }
    }

    /**
     * находим сумму элементов больше 3, помещаем эти эл-ты в новый массив и печатаем его
     * @param arr одномерный массив, сформированный по функции с интервалом
     */
    public static void newArray(double[] arr){
        int l = 0;  //кол-во эл-тов больше 3
        double sum = 0;  //сумма этих эл-тов
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 3){
                sum = sum + arr[i];
                l++;
            }
        }
        double[] newArr = new double[l];  //новый массив
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 3){
                newArr[count] = arr[i];
                count++;
            }
        }
        System.out.println("Сумма элементов больше 3:" + "\n" + sum);
        Task6.arrayPrint(newArr,"new", 3);
    }
}
