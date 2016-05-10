package by.it.sereda.jd01_05.math;

import static java.lang.Math.pow;

public class Task6 {

    public static double[] getArray(){
        int arrLength = 25;
        double[] array = new double[arrLength];
        for (double x = 5.34, j = 0; x < 9.0; x += 0.1, j += 1){
            array[(int)j] = pow((pow(x,2)+4.5),1.0/3);
            if (j == arrLength - 1) break;
        }
        return array;
    }

    private double getLastTenAvg(double[] array){
        double sum = 0;

        for (int j = array.length - 1; j >= array.length - 10; j--){
            sum += array[j];
        }
        return sum / 10.0;
    }

    public void printArray(double[] array, String arrayName, boolean printAvg){
        double avg;
        String tableHeader = "Array: " + arrayName + ".";
        if (printAvg && array.length >= 10){
            avg = getLastTenAvg(array);
            tableHeader += " Average of last ten elements: " + avg;
        }
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println(tableHeader);
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        for (int index = 0; index < array.length; index++){
            System.out.println(String.format("%-1s%-1s%-1s%2s%20s", "[", index, "]", "=", array[index]));
        }
    }

    public double[] getEveryThirdElement(double[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (i % 3 == 0){
                count++;
            }
        }
        double[] newArray = new double[count];
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (i % 3 == 0){
                newArray[index] = array[i];
                index++;
            }
        }

        return newArray;
    }

    public static void arrayPrint (double[] mas, String name, int cols) {
        int col=0;
        for (int i = 0; i < mas.length; i++) {
            System.out.print(name);                             //печатаем имя массива
            System.out.printf("[% -3d]=%-9.4f ", i, mas[i]);     //печатаем значения
            col++;
            if ((0==col%cols)                                   //если конец колонки
                    || (mas.length-1==i))                              //или конец массива
            {
                System.out.println();               //тогда печатаем перевод строки
            }
        }
    }


    public static double[] getArrayMoreThan (double[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>3.5){
                count++;
            }
        }
        double[] newArray = new double[count];
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i]>3.5){
                newArray[index] = array[i];
                index++;
            }
        }
        return newArray;
    }

    public static double geometricMean(double[] array){
        int n = 0;
        double multiple = 1.0;
        for (int i = 0; i < array.length; i++){
            multiple = multiple * array[i];
            n++;
        }
        double geomean = pow(multiple, 1 / (double) array.length);
        return geomean;
    }
}