package by.it.drachyova.jd01_05;



import static java.lang.Math.abs;
import static java.lang.Math.exp;

public class Task6 {

    //формируем массив из 20-40 элементов
   public static double[] getArray(){
        int arrLength = 30;
        double[] array = new double[arrLength];
        for (double b =-1.9, i=0; b < 2; b+=0.1, i++){
            array[(int)i] = exp(abs(2*b+1));
            if (i == arrLength - 1) break;
        }
        return array;
   }
    //форматный вывод массива с заголовком и индексами
    public static void printArray (double[] array){

        for (int i=0,columns=1;i<array.length;i++,columns++){
            System.out.format("Array[%-2d]=%-6.2f",i,array[i]);
            if(columns%6==0) {
                System.out.println();
            }
        }
        System.out.println("");
    }

    //Формируем новыймассив из элементов меньше 3 и имеющих нечетный индекс,
    // находим произведение его элементов
    static double[] getLessThenThreeAndOddIndex(double[] array){
        int count=0;
        for (int i = 0; i < array.length; i++){
            if (array[i] <3 && i%2==1){
                count++;
            }
        }
        double[] newArray = new double[count];
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] <3 && i%2==1){
                newArray[index] = array[i];
                index++;
            }
        }
        double mul=1;
        for (double element:newArray) {
            mul *= element;
        }
        System.out.println("Произведение элементов, меньших 3, имеющих нечетные индексы равно "+mul);

        return newArray;
    }
}


