package by.it.sinkevich.jd01_05;

import by.it.sinkevich.jd01_03.Utils;

import static java.lang.Math.*;

/**
 * Задание С.
 *
 * @author Sinkevich Denis
 */
class TaskC {

    void task() {
        double[] array = getRandomNumbersArray(29, 7, 9); //Инициализируем массив с исходными данными
        roundArray(array); //Округляем элементы массива
        System.out.println("Результат задания №7: ");
        System.out.println("Исходный массив: ");
        Util.printFunctionForTask6(array, "M");
        double[] sortedArray = get2PercentArray(array); //Инициализируем второй массив
        Utils.sortArray(sortedArray, false); //Сортировка по убыванию
        System.out.println("Отсортированный массив: ");
        Util.printFunctionForTask6(sortedArray, "K");
    }

    /**
     * Создание и инициализация одномерного массива со случайными числами в заданном дипазоне
     *
     * @param arrayLength требуемая длина массива
     * @param leftBorder  левая граница диапазона(включительно)
     * @param rightBorder правая граница диапазона(не включая)
     * @return проинициализированный массив заданной длины
     */
    private double[] getRandomNumbersArray(int arrayLength, int leftBorder, int rightBorder) {
        double[] array = new double[arrayLength];
        for (int index = 0; index < arrayLength; index++) {
            array[index] = random() * (rightBorder - leftBorder) + leftBorder;
        }
        return array;
    }

    /**
     * Округляет элементы переданного массива до сотых
     *
     * @param array массив типа {@code double}
     */
    private void roundArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = rint(array[i] * 100) / 100;
        }
    }

    /**
     * Заполняет новый массив данными из переданного, в который попадают только элементы дробная часть которых
     * больше, чем 2% от индекса элемента
     *
     * @param array массив типа {@code double}
     * @return результирующий массив
     */
    private double[] get2PercentArray(double[] array) {
        //Делаем временный массив, в который будем писать все подходящие элементы
        double[] temp = new double[array.length];
        //Счётчик размера результирующего массива
        int resultArraySize = 0;
        for (int index = 0; index < array.length; index++) {
            double afterFloat = array[index] - floor(array[index]);
            if (afterFloat > 0.02 * index) {
                temp[index] = array[index];
                resultArraySize++;
            }
        }
        double[] result = new double[resultArraySize];
        //Обнуляем счётчик для записи из временного хранилища в результирующий массив
        resultArraySize = 0;
        for (double aTemp : temp) {
            if (aTemp != 0) {
                result[resultArraySize] = aTemp;
                resultArraySize++;
            }
        }
        return result;
    }
}
