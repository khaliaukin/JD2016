package by.it.drachyova.jd01_02;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;


class Util {

    //чтение одной строки с консоли
    //private static String getOneLine() throws IOException{
    //    BufferedReader stin = new BufferedReader(new InputStreamReader(System.in));
    //   String line =stin.readLine();
    //   stin.close();
    //  return line;
    //}

    //преобразование одной строки в массив чисел
     static int[] lineToArray(String line){
         String[] strArray = line.split(" ");
         int[] array=new int[strArray.length];
         for(int j=0; j<strArray.length; j++){
             array [j]=Integer.parseInt(strArray[j]);
         }
         return array;
     }
     //вывод матрицы в консоль
     static void showMatrix(int arr[][]) {
         System.out.println();
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 System.out.print(arr[i][j] + " ");
             }
             System.out.println();
         }
    }
}