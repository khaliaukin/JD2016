package by.it.khalyavkin.jd01_04;

public class Utils {




	/**
	 * Поіск максімума для массіва INT
	 *
	 * @param mas - одномерный массив
	 * @return максимум или Integer.MAX_VALUE если массив пустой
	 */

	public static int maxIntArray(int[] mas) {
		if (0 == mas.length) {
			return Integer.MAX_VALUE; // еслі дліна массіва равна 0, возврат максімального значенія інт.
		} else {
			int max = mas[0];
			for (int m : mas) {
				if (max < m) max = m;
			}
			return max;

		}

	}

	/**
	 *Поиск минимума для массива INT
	 *@param mas - одномерный массив
	 *@return минимум или Integer.MIN_VALUE если массив пустой
	 *
	 */
	public static int minIntArray (int[] mas) {
		if (0 == mas.length) {
			return Integer.MIN_VALUE; // еслі дліна массіва равна 0, возврат максімального значенія інт.
		} else {
			int min = mas[0];
			for (int m: mas) {
				if (min > m) min = m;
			}
			return min;

		}

	}


	// upDirection true up, false down
	public static int[] sortIntArray(int[] mas, boolean upDirection) {
		for (int i = 0; i < mas.length-1; i++)
			for (int j = i+1; j < mas.length; j++)
				if ((upDirection && mas[i]>mas[j]) ||
						(!upDirection && mas[i]<mas[j]))
		{
			int m=mas[i];
			mas[i]=mas[j];
			mas[j]=m;
		}

		return mas;
	}

	//  умножение матрицы на вектор
	public static double[] arrayMulVector(double[][] x, double[]y) {
		double[] z=new double[x.length];
		for (int i=0; i<x.length; i++)
			for (int j=0; j<y.length;j++)
				z[i]=z[i]+x[i][j]*y[j];
		return z;
	}
	//умножение матрицы на матрицу
	public static double[][] arrayMulVector(double[][] x, double[][]y) {
		double[][] z=new double[x.length][y[0].length];
		for (int i=0; i<x.length; i++)
			for (int j=0; j<y.length;j++)
				for (int k=0; k<y.length;k++)
					z[i][j]=z[i][j]+x[i][k]*y[k][j];
		return z;
	}

	public static double [] findRoot (double[][] mA, double[]mY, boolean showSteps) {
		int n=mA.length; // размер системы уравнений
		double [][] m=new double[n][n+1];
		//перенос матрицы mA в операционную матрицу m
		for (int row=0; row<n; row++)
			for (int col=0; col<n; col++)
				m[row][col]=mA[row][col];
		//перенос вектора mY в операционную матрицу m
		for (int row = 0; row < n; row++)
			m[row][n]=mY[row];
		//если показ есть, то вывод
		if (showSteps) InOut.arrayPrint2D(m,"m");
		if (showSteps) InOut.arrayPrint2D(m);
		double k;
		//прямой ход
		for (int diag = 0;diag <n-1; diag++) {
			for (int row=diag+1;row<n;row++)
			{
				k=m[row][diag]/m[diag][diag];
				for (int col=0;col<n+1;col++)
					m[row][col]=m[row][col]-m[diag][col]*k;
			}
		}

		//обратный ход
		for (int diag = n-1; diag>0; diag--) {
			for (int row =0; row<diag; row++) {
				k=m[row][diag] / m [diag][diag];
				for (int col=0;col<n+1;col++)
					m[row][col]=m[row][col]-m[diag][col]*k;
			}
			if (showSteps) InOut.arrayPrint2D(m);// если показ есть,то показ
		}
		//приведение главной диагонали к 1
		for (int i=0; i<n;i++) {
			k=1/m[i][i];
			for (int j=0;j<n+1;j++)
				m[i][j]=m[i][j]*k;
		}
		if (showSteps) InOut.arrayPrint2D(m); //если показ есть, то покажем

		// в последней колонке корни.Вернем их в качестве результата ход
		double[] x=new double[n];
		for (int i=0;i<n;i++)
			x[i]=m[i][n];
		return x;
	}



}