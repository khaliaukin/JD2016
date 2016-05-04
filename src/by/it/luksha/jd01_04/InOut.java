package by.it.luksha.jd01_04;

public class InOut {
    /**
     *Метод парсит строку из чисел double через пробел в одномерный массив ("1 2.0 33 4.37")
     * @param data строка со значениями для одномерного массива
     * @return одномерный массив
     */
    public static double[] inArray1D(String data) {
        String[] strArray = data.split(" ");
        double[] doubleArray = new double[strArray.length];
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = Double.parseDouble(strArray[i]);
        }

        return doubleArray;
    }

    /**
     *Метод парсит строку из чисел double через пробел в двумерный массив row*col ("1 2.0 33 4.37")
     * @param col кол-во столбцов
     * @param row кол-во строк
     * @param data строка с данными через пробел для заполнения двухмерного массива (кол-во значений должно быть равно col*row)
     * @return двумерный массив
     */
    public static double[][] inArray2D(int row, int col, String data) {

        String[] strArray = data.split(" ");
        double[] doubleArray = new double[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            doubleArray[i] = Double.parseDouble(strArray[i]);
        }

        double[][] array = new double[row][col];
        int count = 0;
        for (int i = 0; i <= row-1; i++) {
            for (int j = 0; j <= col-1; j++) {
                if (count <= (doubleArray.length - 1))
                {
                    array[i][j] = doubleArray[count];
                    count++;
                }
                else
                {
                    array[i][j] = 0;
                }
            }
        }

        return array;
    }

    /**
     * Метод выводи одномерный массив в консоль
     * @param array одномерный массив для вывода в консоль
     * @param name имя массива
     */
    public static void outArray1D(double[] array, String name) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf(name + "[%1d]=%-3.1f ",i+1, array[i]);
        }
    }

    /**
     *Метод выводи двумерный массив в консоль
     * @param array двумерный массив для вывода в консоль
     * @param name имя массива
     */
    public static void outArray2D(double[][] array, String name) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf(name + "[%1d,%1d]=%-6.2f",i+1, j+1, array[i][j]);
            }
            System.out.println();
        }
    }
}
