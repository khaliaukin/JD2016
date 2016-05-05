package by.it.drachyova.jd01_04;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;


public class InOut {
    /**
     * Процедура чтения одной строки с консоли
     * @return возвращает строку с консоли
     * @throws IOException
     */

   /* public static String consoleReadLine() throws IOException
    {
        InputStreamReader iStreamReader=new InputStreamReader(System.in);
        BufferedReader line=new BufferedReader(iStreamReader);
        String out=line.readLine();
        line.close();
        return out;
    }*/

    /**
     * Преобразование строки в массив чисел
     * @param line строка чисел разделенных пробелом
     * @return возвращает массив
     */
   /* public static double[] stringLineToDoubleArray(String line){
        line=line.trim();
        String[] elemString=line.split(" ");
        int count=elemString.length;
        double[] mas=new double[count];
        for (int i = 0; i < count; i++) {
            mas[i]=Double.parseDouble(elemString[i]);

        }
    return  mas;
    }*/

    /**
     * Печать массива с именем и индексом
     * @param mas входной массив
     * @param name имя на экране
     * @param cols число столбцов для вывода
     */
    static void arrayPrint(double[] mas, String name, int cols) {
    int col=0;
        for (int i = 0; i <mas.length ; i++) {
            System.out.print(name);
            System.out.printf("[% -3d]=%-9.4f", i, mas[i]);
            col++;
            if((0==col%cols) || (mas.length-1==i)){
                System.out.println();
            }
        }

    }


    /**
     * Печать двумерного массива с именем и индексами
     * @param mas входной массив
     * @param name имя массива
     */
    static void arrayPrint2D(double[][] mas, String name){
        for (int i = 0; i <mas.length ; i++) {
            for (int j = 0; j <mas[i].length ; j++) {
                System.out.printf(name+"[%1d,%1d]=%-6.1f ", i, j, mas[i][j]);
                System.out.println();
            }
            System.out.println();
        }
    }
}
