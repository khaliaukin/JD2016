package by.it.makevich.jd01_04;

public class TaskA {
	/**
	 * метод решения СЛАУ методом Жордана-Гауса
	 * @param mA входной массив матрицы
	 * @param mY входной вектор правых частей СЛАУ
	 * @return решенная СЛАУ
	 */
	public static double[]findRoot(double[][]mA,double[] mY){
		int n = mA.length;
		double[][] matrixA = new double[n][n+1];
		for (int row= 0;row<n;row++)
			for (int cols=0;cols<n;cols++)
				matrixA[row][cols] = mA[row][cols];

		for (int row=0;row<n;row++)
			matrixA[row][n]=mY[row];
		//прямой ход
		double k;
		for(int diag=0;diag<n-1;diag++) {
			for (int row = diag + 1; row < n; row++){
				k=matrixA[row][diag]/matrixA[diag][diag];
				for (int cols=0;cols<n+1;cols++)
					matrixA[row][cols]=matrixA[row][cols]-matrixA[diag][cols]*k;
			}
		}
		//обратный ход
		for (int diag=n-1; diag>0;diag--){
			for (int row=0;row<diag;row++){
				k=matrixA[row][diag]/matrixA[diag][diag];
				for (int cols= 0;cols<n+1;cols++)
					matrixA[row][cols] = matrixA[row][cols]-matrixA[diag][cols]*k;
			}
		}
//приводим диагональ к 1
		for (int i=0; i<n;i++){
			k=1/matrixA[i][i];
			for (int j=0;j<n+1;j++)
				matrixA[i][j]=matrixA[i][j]*k;
		}
		//возвращаем корни
		double [] x= new double[n];
		for (int i=0;i<n;i++)
			x[i]=matrixA[i][n];
		return x;
	}

	/**
	 * метод проверки
	 * @param mA матрица чисел
	 * @param y вектор решения метода findRoot
	 * @return
	 */
	public static double[] arrayMulVector(double[][]mA, double y[]){
	double[] z=new double[mA.length];
		for (int i=0;i<mA.length;i++)
			for (int j=0;j<y.length;j++)
				z[i]= z[i]+mA[i][j]*y[j];
		return z;
	}
}
