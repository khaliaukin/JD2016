package by.it.makevich.jd01_02;

public class TaskC {
	/**
	 *
	 * @param line входная строка числовых значений
	 * @return возвращает двумерный массив
	 */
	public static int[][] get2DArrayFromLine(String line){
		String[] array = line.split(" ");
		int[][] array2D = new int[3][4];
		int k = 0;
		while (k<array.length) {
			for (int i = 0; i < array2D.length; i++) {
				for (int j = 0; j < array2D[i].length; j++) {
					array2D[i][j] = Integer.parseInt(array[k]);
					k++;
				}
			}

		}
		return array2D;
	}

	/**
	 * выводим массив на экран
	 * @param arr
	 */
	public static void array2DPrint(int[][] arr){
		for (int i = 0; i< arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
