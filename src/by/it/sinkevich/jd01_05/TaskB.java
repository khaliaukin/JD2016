package by.it.sinkevich.jd01_05;

import static java.lang.Math.*;

/**
 * Задание В.
 * @author Sinkevich Denis
 */
class TaskB {

    void task1() {
        double r = 4.73;
        //Счётчик для элементов массива
        int index = 0;
        //Создаём матрицу из 2-х строк, 1-ая строка -- массив аргументов, 2-ая строка -- массив результатов
        double[][] zfuncp = new double[2][8];
        //Циклический вычислительный процесс с разветвлением
        for (int p = -6; p < 25; p = p + 4) {
            double x;
            if (p + r > 3) {
                x = sqrt(r + 87.34);
            } else if (0.5 <= p + r && p + r <= 3) {
                x = 0;
            } else {
                x = pow(sin(r), 5);
            }
            double z = x + pow(E, r) / 2;
            zfuncp[0][index] = p;
            zfuncp[1][index] = z;
            index++;
        }
        System.out.println("Результат задания №5: ");
        Util.printFunctionTable(zfuncp, "z", 4);
    }

    void task2() {
        //Задаём начальные значения
        double leftBorder = 5.33;
        double rightBorder = 9.0;
        int iterations = 40;
        //Вычисляем величину изменения переменной функции в зависимости от кол-ва итераций
        double dx = (rightBorder - leftBorder) / iterations;
        double[] function = new double[iterations];
        //В цикле считаем значения функции и сразу подсчитываем размер второго массива со хначениями больше 3.5
        int newArraySize = 0;
        for (int i = 0; i < iterations; i++) {
            double z = cbrt(leftBorder * leftBorder + 4.5);
            if (z >= 3.5) {
                newArraySize++;
            }
            function[i] = z;
            leftBorder += dx;
        }
        double[] newArray = new double[newArraySize];
        //Перемнная для расчёта среднего геометрического значения
        double geomAvg = 1;
        int newArrayIndex = 0;
        //Заполняем второй массив нужными элементами и рассчитываем среднее геометрическое
        for (int i = 0; i < iterations; i++) {
            if (function[i] >= 3.5) {
                newArray[newArrayIndex] = function[i];
                geomAvg *= function[i];
                newArrayIndex++;
            }
        }
        geomAvg /= newArraySize;
        System.out.println("Результат задание №6: ");
        Util.printFunctionForTask6(function, "Z(x)");
        Util.printFunctionForTask6(newArray, "Z(x), где x >= 3.5");
        System.out.println("Среднее геометрическое значение элементов второго массива равно: " + geomAvg);
    }
}
