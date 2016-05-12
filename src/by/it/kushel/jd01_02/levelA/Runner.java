package by.it.kushel.jd01_02.levelA;

public class Runner {
    public static void main(String[] arg){
        String line="-2 -4 50 19 17 -500";

        int arr[]=Util.lineToIntArray(line);
        System.out.println("Вывод масива");
        Util.printArray(arr);
        System.out.println();

        String max = TaskA.getMax(line);
        System.out.println(max);
        System.out.println();


        String min = TaskA.getMin(line);
        System.out.println(min);
        System.out.println();

        TaskA.nLessOfMean(line);

        /*TaskA1.nWithDiffCharacter(line);*/

    }



}
