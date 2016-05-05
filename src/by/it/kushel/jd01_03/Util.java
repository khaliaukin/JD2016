package by.it.kushel.jd01_03;


public class Util {
    /**
     * @param mas исходный массив
     * @param upDirection если true то по-возрастанию, если false, то по убыванию
     * @return sorted array
     */
    public  static double[] sortIntArray (double[] mas, boolean upDirection) {
        for (int i = mas.length-1; i>0; i--) {/*Внешний цикл каждый раз сокращает фрагмент массива,
                                              так как внутренний цикл каждый раз ставит в конец
                                              фрагмента максимальный элемент*/
            for (int j = 0; j < i; j++){      /*Сравниваем элементы попарно,
                                              если они имеют неправильный порядок,
                                              то меняем местами*/
                if ((upDirection && mas[j] > mas[j + 1]) || (!upDirection && mas[j] < mas[j + 1])) {
                    double temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
        }
    }
        return mas;
    }

    /**
     * Поиск максимума для массива double
     * @param mas - одномернвй массив
     * @return максимум
     */

    public static double searchOfMaximum(double[] mas){
        double max= mas[0];
      for(int i=0; i< mas.length-1;i++){

          if (max<mas[i+1]){
              max=mas[i+1];
          }
      }
        return max;
    }
    /**
     * Поиск максимума для массива double
     * @param mas - одномернвй массив
     * @return минимум
     */
    public static double searchOfMinimum(double[] mas){
        double min= mas[0];
        for(int i=0; i< mas.length-1;i++){
            if (min>mas[i+1]){
                min=mas[i+1];
            }
        }
        return min;
    }
    /**
     * Умножение матрицы на вектор
     * @param mas - двумерный массив
     * @param vector - одномерный массив
     * @return минимум
     */
    public static double[] multiplicationArrays(double[][] mas, double[] vector) {

        double[] result = new double[mas.length];
        if (mas[0].length==vector.length) {
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[i].length; j++) {
                    result[i] += mas[i][j] * vector[j];
                }
            }
        }else {
            System.out.println("Длина столбцов матрицы должна равняться длине строк (длине) вектора");
        }
        return result;

    }


}