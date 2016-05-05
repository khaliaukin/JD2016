package by.it.makevich.jd01_04;

public class InOut {
	/**
	 * метод вывода на экран входного массива
	 * @param arr входной массив
	 */
	public static void printArray(double[]arr,String x){
		System.out.println();
		for (int i=0;i<arr.length;i++)
			System.out.println(x+"["+i+"]="+arr[i]);
	}
}
