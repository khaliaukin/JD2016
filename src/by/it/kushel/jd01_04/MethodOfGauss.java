package by.it.kushel.jd01_04;

import by.it.kushel.jd01_03.InOut;

public class MethodOfGauss {
    public static double[] findRoots (double[][] masA, double[] masY, boolean showSteps){

        int n=masA.length;
        double[][] mas = new double[n][n+1];
        //Перенос матрицы mA (левой части) в матрицу mas
        for(int row=0; row < n; row++){
          for(int col=0; col < n; col++){
              mas[row][col]=masA[row][col];
          }
        }
        // Перенос вектора mY (правой части) в матрицу mas
        for(int row=0; row < n; row++){
                mas[row][n]=masY[row];
        }
        if (showSteps){
            System.out.println("Матрица А");
            InOut.arrayPrint2D(mas);

        }

        //Прямой ход
        double k;
        for(int diag=0; diag<n-1; diag++) {
            for (int row = diag + 1; row < n; row++) {
                k = mas[row][diag] / mas[diag][diag];
                for (int col = 0; col < n + 1; col++) {
                    mas[row][col] = mas[row][col] - mas[diag][col] * k;
                }
            }
        }
            // Обратный ход
            for(int diag=n-1; diag>0; diag--){
                for (int row=0; row<diag; row++){
                  k=mas[row][diag]/mas[diag][diag];
                    for (int col=0; col<n+1; col++){
                        mas[row][col]=mas[row][col]-mas[diag][col]*k;
                    }
                }
                if(showSteps){
                    System.out.println("Диагональная матрица");
                    InOut.arrayPrint2D(mas);

                }

            }
        //Приведение главной диагонали к 1
        for (int i=0; i<n; i++){
            k=1/mas[i][i];
            for (int j=0; j<n+1; j++){
                mas[i][j]=mas[i][j]*k;
            }
        }

        if(showSteps){
            System.out.println("Главная диагональ приведена к 1");
            InOut.arrayPrint2D(mas);
        }
        // в последней колонке корни. Вернем их в качкестве результата x
        double[] x=new double[n];
        for (int i =0; i<n; i++){
            x[i]=mas[i][n];
        }
        return x;
    }
}
