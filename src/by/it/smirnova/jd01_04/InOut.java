package by.it.smirnova.jd01_04;

/**
 * Created by Evgenia on 01.05.2016.
 */
public class InOut {
/**
    * @param mas входной массив
    * @param name имя на экране
    * @param cols число столбцов для выода
*/

    public static void arrayPrint(double[] mas, String name, int cols) {

        int col = 0;

        for (int i = 0; i < mas.length; i++) {

            System.out.print(name);                               //печатаем имя массива

            System.out.printf("[% -3d]=%-9.4f ", i, mas[i]);      //печатаем значения

            col++;

            if ((0==col%cols)                                     //если конец колонки

                    || (mas.length-1==i))                         //или конец массива

            {
                System.out.println();                             //тогда напечатаем перевод строки
            }
        }
    }

    public static void arrayPrint2D(double[][] m) {

        for (int i = 0; i < m.length; i++) {                     //перебираем строки массива

            for (int j = 0; j < m[0].length; j++)                //перебираем столбцы массива

                System.out.printf("%6.2f ",m[i][j]);             //печатаем один элемент

            System.out.println();                                //в конце столбца
        }

        System.out.println();                                    //в конце массива выводится пустая строка

    }

    /**
     * @param m Печать двумерного массива с заданным именем и индесами
     */
    public static void arrayPrint2D(double[][] m, String name) {

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[0].length; j++)

                System.out.printf(name +"[%1d,%1d]=%-6.1f ", i, j, m[i][j]);

            System.out.println();
        }
        System.out.println();

    }

    public static double[] stringLineToDoubleArray(String line) {

        String[] strMas = line.split(" ");

        double[] doubleMas = new double[strMas.length];

        for(int j = 0; j < strMas.length; j++){

            doubleMas[j] = Double.parseDouble(strMas[j]);
        }
        return doubleMas;
    }
}
