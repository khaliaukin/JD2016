package by.it.sinkevich.jd01_02;

class TaskC {
    //Создаём отдельное поле класса для последовательных модификаций
    private int[][] matrix;

    public TaskC() {
        this(10);
    }

    TaskC(int length) {
        matrix = new int[length][length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.round(Math.random() * 2 * matrix.length - matrix.length));
            }
        }
    }

    private void printMatrix() {
        Util.matrixOut(matrix);
    }
    //Метод плохо отрабатывает для матриц маленького размера
    void sumBetweenTwoPositives() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int counter = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (counter == 1 && matrix[i][j] < 0) {
                    sum += matrix[i][j];
                }
                if (matrix[i][j] > 0 && counter != 1) {
                    counter++;
                } else if (matrix[i][j] > 0 && counter == 1) {
                    break;
                }
            }
        }
        System.out.println("Сумма между положительными элементами равна: " + sum);
        printMatrix();
    }

    void transpondMatrix() {
        int[][] copy = new int[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                copy[row][col] = matrix[col][row];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = copy[i][j];
            }
        }
        System.out.println("Транспонированная матрица: ");
        printMatrix();
    }

    void rotateMatrix() {
        int[][] copy = new int[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                copy[row][col] = matrix[col][matrix.length - row - 1];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = copy[i][j];
            }
        }
        System.out.println("Поворот матрицы на 90 градусов: ");
        printMatrix();
    }
    /*Округлял среднее арифметическое, так как в последующем задании очевидно,
    что тогда найдёт только одну строку и столбец для удаления, а это неинтересно*/
    void averageDifference() {
        for (int i = 0; i < matrix.length; i++) {
            double average = new TaskA().getAverage(matrix[i]);
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = matrix[i][j] - (int) Math.round(average);
            }
        }
        System.out.println("Результат построчного вычитания среднего арифметического: ");
        printMatrix();
    }

    void deleteRowsAndColsWithMaximum() {
        //Ищем максимальный элемент матрицы
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            max = Math.max(max, new TaskA().getMax(row));
        }
        //Помечаем строки и столбцы, которые надо будет удалить
        int[] deleteRowsIndex = new int[matrix.length];
        int[] deleteColsIndex = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == max) {
                    deleteRowsIndex[i] = 1;
                    deleteColsIndex[j] = 1;
                }
            }
        }
        System.out.println("Максимальный элемент матрицы: " + max);
        //Считаем сколько стобцов и строк надо оставить, чтобы правильно создать новый результирующий массив
        int resultRows = 0;
        int resultCols = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (deleteRowsIndex[i] == 0) {
                resultRows++;
            }
            if (deleteColsIndex[i] == 0) {
                resultCols++;
            }
        }
        int[][] result = new int[resultRows][resultCols];
        //Проходим основную матрицу и делаем счётчики resultRows и resultCols
        // для правильного индексирования рещультирующей матрицы
        resultRows = 0;
        for (int row = 0; row < matrix.length; row++) {
            if (deleteRowsIndex[row] == 1) {
                continue;
            }
            resultCols = 0;
            for (int col = 0; col < matrix.length; col++) {
                if (deleteColsIndex[col] == 1) {
                    continue;
                }
                result[resultRows][resultCols] = matrix[row][col];
                resultCols++;
            }
            resultRows++;
        }
        System.out.println("Матрица без строк и столбцов, содержащих максимальный элемент: ");
        Util.matrixOut(result);
    }
}
