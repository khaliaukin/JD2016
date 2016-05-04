package by.it.sinkevich.jd01_02;

class TaskC {
    private int[][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public TaskC() {
        this(10);
    }

    public TaskC(int length) {
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
        System.out.println("Поворот матрица на 90 градусов: ");
        printMatrix();
    }

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
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            max = Math.max(max, new TaskA().getMax(row));
        }
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

    }
}
