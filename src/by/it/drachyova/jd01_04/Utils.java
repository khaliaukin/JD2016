package by.it.drachyova.jd01_04;

class Utils {

    /**
     * Сортировка массива по возрастанию
     * @param mas входной массив
     * @return возвращает отсортированный массив
     */
   static double[] sortUpDoubleArray(double[] mas){
       for(int i = mas.length-1 ; i > 0 ; i--){
           for(int j = 0 ; j < i ; j++){
                if( mas[j] > mas[j+1] ){
                    double tmp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = tmp;
                }
           }
       }
       return mas;
   }

    /**
     * Сортировка массива по убыванию
     * @param mas входной массив
     * @return возвращает отсортированный массив
     */

    static double[] sortDownDoubleArray(double[] mas){
        for(int i = mas.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( mas[j] < mas[j+1] ){
                    double tmp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = tmp;
                }
            }
        }
        return mas;
    }
    /**
     * Поиск максимального числа
     * @param mas входной массив
     * @return возвращает максимальное значение
     */
    public static double maxDoubleArray(double[] mas){
        if(0==mas.length) {
            return Double.MAX_VALUE;
        }
        else{
            double max=mas[0];
            for (double m:mas) {
               if(max<m)
                   max=m;
            }
            return max;
        }

    }

    /**
     * Поиск минимального числа
     * @param mas входной массив
     * @return возвращает минимальное значение
     */
    public static double minDoubleArray(double[] mas){
        if(0==mas.length) {
            return Double.MIN_VALUE;
        }
        else{
            double min=mas[0];
            for (double m:mas) {
                if(min>m)
                    min=m;
            }
            return min;
        }

    }
    /**
     * Умножение матрицы на вектор
     * @param x входной массив
     * @param y  входной вектор
     * @return возвращает результат
     */
    static double[] arrayMulVector(double[][] x, double[] y){
        double[] z=new double[x.length];
        for (int i = 0; i <x.length; i++) {
            for (int j = 0; j <y.length; j++) {
               z[i]+=x[i][j] * y[j];
            }
        }
        return z;
    }

    /**
     * Умножение матрицы на матрицу
     * @param x входной массив
     * @param y  входной массив
     * @return возвращает результат
     */
    static double[][] arrayMulVector(double[][] x, double[][] y){
        double[][] z=new double[x.length][y[0].length];
        for (int i = 0; i <x.length; i++) {
            for (int j = 0; j <y[0].length; j++) {
                for (int k = 0; k <y.length ; k++) {
                    z[i][j] += x[i][k] * y[k][j];
                }
            }
        }
        return z;
    }

    /**
     * Поиск корней
     * @return  возврашаяет массив корней
    */
    static double[] findRoot(double[][]mA, double[]mY, boolean showSteps){

        int n = mA.length;
        double[][] m=new double[n][n+1];
        for(int row=0; row<n; row++) {
            for (int col = 0; col < n; col++) {
                m[row][col] = mA[row][col];
            }
        }
        for (int row=0;row<n;row++) {
            m[row][n] = mY[row];
        }
        if (showSteps)InOut.arrayPrint2D(m,"m");
        double k;
        for(int diag=0;diag<n-1;diag++){
            for(int row=diag+1; row<n; row++){
                k=m[row][diag]/m[diag][diag];
                for(int col=0;col<n+1;col++){
                    m[row][col]=m[row][col]-m[diag][col]*k;
                }
            }
        }
        for (int diag=n-1;diag>0; diag--){
            for(int row=0; row<diag; row++){
                k=m[row][diag]/m[diag][diag];
                for(int col=0;col<n+1; col++)
                    m[row][col]=m[row][col]-m[diag][col]*k;
            }
            if (showSteps)InOut.arrayPrint2D(m,"m");
        }
        for(int i=0; i<n; i++) {
            k = 1 / m[i][i];
            for (int j = 0; j < n + 1; j++)
                m[i][j] = m[i][j] * k;
        }
        if (showSteps) InOut.arrayPrint2D(m,"m");
        double[] x= new double[n];
        for(int i=0; i<n;i++){
            x[i]=m[i][n];
        }
        return x;
    }

    /**
     * Поиск определителя матрицы
     *
     * @return детерминант
     */
    static double findDeterminant( double[][]mA, double[] mY){
        int n = mA.length;
        double[][] m=new double[n][n+1];
        for(int row=0; row<n; row++) {
            for (int col = 0; col < n; col++) {
                m[row][col] = mA[row][col];
            }
        }
        for (int row=0;row<n;row++) {
            m[row][n] = mY[row];
        }
        double k;
        for(int diag=0;diag<n-1;diag++){
            for(int row=diag+1; row<n; row++){
                k=m[row][diag]/m[diag][diag];
                    for(int col=0;col<n+1;col++){
                        m[row][col]=m[row][col]-m[diag][col]*k;
                }
            }
        }
        double determinant=1;
        for(int rows=0;rows<m.length;rows++){
            for(int cols=0; cols<m[rows].length;cols++){
                if(rows==cols)
                    determinant=determinant*m[rows][cols];
            }
        }
        return determinant;
    }

    /**
     * поиск обратной матрицы
     */
   static double[][] inverseMatrix(double[][]mA){
        int n = mA.length;//размер системы уравнений
        double[][] m=new double[n][2*n];
        for(int row=0; row<n; row++) {//перенос матрицы mA в m
            for (int col = 0; col < n; col++) {
                m[row][col] = mA[row][col];
            }
        }
        for (int row=0;row<n;row++) {//добавляем единичную матрицу
            for (int col=0; col < 2*n; col++)
                if (col == row+n)
                    m[row][col] = 1;
        }
        double k;
        for(int diag=0;diag<n-1;diag++){// прямой ход
            for(int row=diag+1; row<n; row++){
                k=m[row][diag]/m[diag][diag];
                for(int col=0;col<2*n;col++){
                    m[row][col]=m[row][col]-m[diag][col]*k;
                }
            }
        }

        for (int diag=n-1;diag>0; diag--){//обратный ход
            for(int row=0; row<diag; row++){
                k=m[row][diag]/m[diag][diag];
                for(int col=0;col<2*n; col++)
                    m[row][col]=m[row][col]-m[diag][col]*k;
            }
        }

        for(int i=0; i<n; i++) {//приводим главную диагональ к 1
            k = 1 / m[i][i];
            for (int j = 0; j < 2*n; j++)
                m[i][j] = m[i][j] * k;
        }

        double[][] invMatrix= new double[n][n];//перенос обратной матрицы в invMatrix
        for(int i=0; i<n;i++){
            for (int j=0; j<n; j++)
            invMatrix[i][j]=m[i][j+n];
        }
        return invMatrix;
    }

}
