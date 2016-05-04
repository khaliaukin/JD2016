package by.it.kushel.jd01_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InOut {
    /**
     * Процедура чтения одной строки с консоли
     * @return Возвращает строку с консоли
     * @throws   IOException - some description
    */
    public static String consoleReadLine() throws IOException {
        InputStreamReader iStreamReader = new InputStreamReader(System.in);
        BufferedReader line  = new BufferedReader(iStreamReader);
        String out = line.readLine();
        line.close();
        return  out;
    }

    /**
     * @param line Строкка чисел (целых) разделенных пробелом
     * @return  на выходе массив таких чисел
     */

    public static  double[] stringLineToDoubleArray(String line){
        line=line.trim();                   //Удаление пробелов в начале и конце строки
        String[] elemString=line.split(" "); //Преобразование строки в массив
        int count=elemString.length; // Находим длину строки
        double[] mas = new double[count]; // создаем массив для чисел
        for(int i=0; i<count; i++){ //заполняем массив
            mas[i]=Double.parseDouble(elemString[i]);
        }
     return mas;
    }

    /**
     * @param mas входной массив
     *@param  name имя на экране
     * @param cols число столбцов для вывода
     */
    public  static void  arrayPrint(int[] mas, String name, int cols){
        int col=0;
        for(int i=0; i<mas.length; i++){
            System.out.print(name);
            System.out.printf("[% -3d]=%-4d",i,mas[i]);
            col++;
            if((0==col%cols)||(mas.length-1==i)){
                System.out.println();
            }
        }
    }

    /**
     * @param mas входной массив
     *@param  name имя на экране
     * @param cols число столбцов для вывода
     */
    public  static  void  arrayPrint(double[] mas, String name, int cols){
        int col=0;
        for(int i=0; i<mas.length; i++){
            System.out.print(name);
            System.out.printf("[%-1d]=%-7.2f",i,mas[i]);
            col++;
            if((0==col%cols)||(mas.length-1==i)){
                System.out.println();
            }
        }
    }

    /**
     *
     * @param mas Печать двумерного массива
     */
    public  static  void  arrayPrint2D(double[][] mas){
        for(int i=0; i<mas.length; i++){
            for(int j =0; j<mas.length; j++){
                System.out.printf("%6.2f", mas[i][j]);

            }
            System.out.println();
        }
    }

    /**
     *
     * @param mas Печать двумерного массива с именем и параметрами
     * @param name
     */
    public  static  void  arrayPrint2D(double[][] mas, String name){
        for(int i=0; i<mas.length; i++){
            for(int j =0; j<mas.length; j++){
                System.out.printf(name+"[%1d,%1d]=%6.1f ", i, j, mas[i][j]);
                System.out.println();
            }
            System.out.println();
        }
    }
}
