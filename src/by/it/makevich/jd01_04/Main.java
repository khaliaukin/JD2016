package by.it.makevich.jd01_04;

public class Main {
	public static void main(String[] args) {
		double[][] matrixA = {{43.4,32.3,32.43,23.4},{43.2,543.54,643.32,654.4},{65.3,23.3,65.4,2.3},{32.3,43.2,54.2,23.2}};
		double[] vectorY = {43.34,23.5,23.12,43.3};
		TaskA.findRoot(matrixA, vectorY);
		double[] x = TaskA.findRoot(matrixA,vectorY);
		TaskA.printArray(x,"x",1);
	}
}
