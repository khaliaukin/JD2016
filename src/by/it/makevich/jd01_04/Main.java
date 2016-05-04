package by.it.makevich.jd01_04;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		double[][] matrixA = {{4,2,5,3},{5,5,2,6},{6,12,4,8},{3,3,4,9}};
		double[] vectorY = {1,14,32,23};
		double[] x = TaskA.findRoot(matrixA,vectorY);
		InOut.printArray(x,"X");//выводим на экран решенную СЛАУ
		double[]z=TaskA.arrayMulVector(matrixA, x);
		InOut.printArray(z,"YY");
	}
}
