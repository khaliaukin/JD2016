package by.it.makevich.jd01_02;

import java.io.IOException;

public class Runner {
	public static void main(String[] args) throws IOException {
		String line = "3242 12 321 23434 434254 4534523 34453453 34534 53534 46445 3434 4343";
		int[] arr = Util.lineToIntArray(line);
		String max = TaskA.getMax(arr);
		System.out.println(max);
		String min = TaskA.getMin(arr);
		System.out.println(min);

		Double mean = TaskA.getArifm(arr);
		System.out.print("Числа длина которых меньше "+mean+" таковы: ");
		for (Integer i:arr) {
			if (i.toString().length() < mean) {
				System.out.print(i+" ");
			}
		}

		System.out.println();
		for (int i: arr) {
			if (TaskA.getNumberWithAllDiffrentDigits(i))
			{
				System.out.println("Найдено число из разных чисел " + i);
				break;
			}
		}
		System.out.println();
/**
 * Задание С.
 *
 */
		int[][] array2D = TaskC.get2DArrayFromLine(line);// получаем двухмерный массив из введенных с консоли чисел
		TaskC.array2DPrint(array2D);// выводим массив на экран
	}
}

