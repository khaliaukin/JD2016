package by.it.sereda.jd01_04;

public class Utils {
    /**
     * @param mas исходный массив
     * @param upDirection если true то по-возрастанию, если false - по-убыванию
     * @return
     */
    public static double[] sortArray(double[] mas, boolean upDirection) {
        for (int i = 0; i < mas.length-1; i++)
            for (int j = i+1; j < mas.length; j++)
                if ((upDirection && mas[i]>mas[j]) ||
                        (!upDirection && mas[i]<mas[j]))
                {
                    double m=mas[i];
                    mas[i]=mas[j];
                    mas[j]=m;
                }
        return mas;
    }

    public static double[] sortArray2method (double[] mas) {
        // в методе в качестве параметра вводим массив
        boolean swapped = true;
        // swapped - переменная, которая отвечает за упорядоченность эелемнтов в массиве
        double temp;
        // temp - временное хранение, где будут меняться элементы по возрастанию
        int j = 0;
        // j - переменная для цикла while
        do {
            // входим в while цикл
            swapped = false;
            // назначаем swapped на false
            j++;
            // инкремент
            for (int i = 0; i < mas.length - 1; i++) {
                // входим в цикл for
                if (mas[i] > mas[i + 1]) {
                    temp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        // делаем пока все элементы в массиве не будут соответсвовать условию

        return mas;
    }


    /**
     * Поиск максимума для массива Int
     * @param mas - одномерный массив
     * @return максимум или Integer.MAX_VALUE если массив пустой
     */
    public static double maxArray(double[] mas) {
        if (0 == mas.length) {
            return Double.MAX_VALUE;
        } else {
            double max = mas [0];
            for (double m : mas) {
                if (max < m) max = m;
            }
            return max;
        }
    }
    /**
     * Поиск минимума для массива Int
     * @param mas - одномерный массив
     * @return минимум или Integer.MIN_VALUE если массив пустой
     */
    public static double minArray(double[] mas) {
        if (0 == mas.length) {
            return Double.MIN_VALUE;
        } else {
            double min = mas [0];
            for (double m : mas) {
                if (min > m) min = m;
            }
            return min;
        }
    }

    public static double[] findRoot (double[][] mA, double[] mY, boolean showSteps) {
        int n=mA.length; //размер системы уравнений
        double[][] m=new double[n][n+1];
        //перенос матрицы mA в операционную матрицу m
        for (int row = 0; row < n; row++)
            for (int col = 0; col < n; col++)
                m[row][col]=mA[row][col];
        //перенос вектора mY в операционную матрицу m
        for (int row = 0; row < n; row++)
            m[row][n]=mY[row];
        //если показ есть, то покажем
        if (showSteps) InOut.arrayPrint2D(m, "m");
        if (showSteps) InOut.arrayPrint2D(m);
        double k;
        //прямой ход
        for (int diag = 0; diag < n-1; diag++) {
            for (int row = diag+1; row < n; row++) {
                k=m[row][diag]/m[diag][diag];
                for (int col = 0; col < n+1; col++)
                    m[row][col]=m[row][col]-m[diag][col]*k;
            }
        }
        //обратный ход
        for (int diag = n-1; diag > 0; diag--) {
            for (int row = 0; row < diag; row++) {
                k=m[row][diag]/m[diag][diag];
                for (int col = 0; col < n+1; col++)
                    m[row][col]=m[row][col]-m[diag][col]*k;
            }
            if (showSteps) InOut.arrayPrint2D(m); //если показ есть, то покажем
        }
        //теперь нужно привести главную диагональ к 1
        for (int i = 0; i < n; i++) {
            k = 1 / m[i][i];
            for (int j = 0; j < n + 1; j++) {
                m[i][j] = m[i][j] * k;
            }
        }
        if (showSteps) InOut.arrayPrint2D(m); //если показ есть, то покажем

        //в последней колонке корни. Вернем их в качестве результата x
        double[] x= new double[n];
        for (int i = 0; i < n; i++)
            x[i]=m[i][n];
        return x;
    }

    public static double findDeterminant (double[][] m) {
        int n=m.length; //размер системы уравнений
        double k;
        //прямой ход
        for (int diag = 0; diag < n-1; diag++) {
            for (int row = diag+1; row < n; row++) {
                k=m[row][diag]/m[diag][diag];
                for (int col = 0; col < n; col++)
                    m[row][col]=m[row][col]-m[diag][col]*k;
            }
        }
        //перемножение элементов главной диагонали для нахождения определителя
        double determinant=1;
        for (int diag = 0; diag<n; diag++)
            determinant=determinant*m[diag][diag];
        return determinant;
    }


    public static double[][] inverseMatrix (double[][] mA, boolean showSteps) {
        int n=mA.length; //размер системы уравнений
        double[][] m=new double[n][n];
        //создаем будущую единичную матрицу, той же размерности
        double[][] matrixOne=new double[n][n];
        //перенос матрицы mA в операционную матрицу m
        for (int row = 0; row < n; row++)
            for (int col = 0; col < n; col++)
                m[row][col]=mA[row][col];
        //заполняем единицами главную диагональ единичной матрицы
        for (int row = 0; row < n; row++)
            matrixOne[row][row]= Double.valueOf(1.0);
        //если показ есть, то покажем
        if (showSteps) InOut.arrayPrint2D(m, "m");
        if (showSteps) InOut.arrayPrint2D(matrixOne, "matrixOne");

        double k;
        //прямой ход
        for (int diag = 0; diag < n-1; diag++) {
            for (int row = diag+1; row < n; row++) {
                k=m[row][diag]/m[diag][diag];
                for (int col = 0; col < n; col++) {
                    m[row][col] = m[row][col] - m[diag][col] * k;
                    //проводим те же элементарные операции с единиичной матрицей
                    matrixOne[row][col] = matrixOne[row][col] - matrixOne[diag][col] * k;
                }
            }
        }
        //обратный ход
        for (int diag = n-1; diag > 0; diag--) {
            for (int row = 0; row < diag; row++) {
                k=m[row][diag]/m[diag][diag];
                for (int col = 0; col < n; col++) {
                    m[row][col] = m[row][col] - m[diag][col] * k;
                    //проводим те же элементарные операции с единиичной матрицей
                    matrixOne[row][col] = matrixOne[row][col] - matrixOne[diag][col] * k;
                }
            }
            if (showSteps) InOut.arrayPrint2D(m, "m"); //если показ есть, то покажем
            if (showSteps) InOut.arrayPrint2D(matrixOne, "matrixOne");
        }
        //теперь нужно привести главную диагональ к 1
        for (int i = 0; i < n; i++) {
            k = 1 / m[i][i];
            for (int j = 0; j < n ; j++) {
                m[i][j] = m[i][j] * k;
                //проводим те же элементарные операции с единиичной матрицей
                matrixOne[i][j] = matrixOne[i][j] * k;
            }
        }
        if (showSteps) InOut.arrayPrint2D(m); //если показ есть, то покажем
        if (showSteps) InOut.arrayPrint2D(matrixOne, "matrixOne");
        return matrixOne;
    }

    public static double[] arrayMulVector(double[][] x, double[] y) {
        double[] z=new double[x.length];
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < y.length; j++)
                z[i] = z[i] + x[i][j]*y[j];
        return z;
    }

    public static double[][] arrayMulVector(double[][] x, double[][] y) {
        double[][] z=new double[x.length][y[0].length];
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < y[0].length; j++)
                for (int k = 0; k < y.length; k++)
                    z[i][j] = z[i][j] + x[i][k]*y[k][j];
        return z;
    }


}
