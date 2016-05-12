package by.it.makevich.jd01_05;

import static java.lang.Math.cos;

public class Task6 {
	/**
	 *
	 * @return массив значений решенного уравнения с подставленным аргументом от -8 до -2
	 */
	public static double[] getArray() {
		int arrLength = 30;
		double[] array = new double[arrLength];
		for (double i = -8.0, j = 0; i < -2; i += 0.1, j++) {
			array[(int) j] = cos(i / 2);

			if (j == arrLength - 1)
				break;
		}
		return array;
	}

	/**
	 * Вывод массива
	 * @param array входной массив
	 * @param arrayName имя массива
	 */
	public static void printArray(double[] array, String arrayName) {
		System.out.println("Array: " + arrayName);
		for (int index = 0; index < array.length; index++) {
			System.out.println(String.format("%-1s%-2s%-1s%2s%20s", "[", index, "]", "=", array[index]));
		}
	}

	/**
	 * счетчик значений массива с нечетным индексом
	 * @param array входной массив
	 * @return количество значений массива с нечетным индексом
	 */
	public static int count(double[] array) {
		int count=0;
		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Новый массив с числами, которые имели нечетный индекс в исходном массиве
	 * @param array входной массив
	 * @param count количество элементов массива
	 * @return
	 */
	protected static double[] newArray(double[] array, int count) {

		double[] newArray = new double[count];
		for (int i = 1, j=0; i < array.length; i+=2, j++) {
			newArray[j]=array[i];
		}
		return newArray;
	}

	/**
	 * получаем произведение всех чисел массива
	 * @param array входной массив
	 * @return произведение чисел массива
	 */
	protected static double toIncrease(double[]array){
		double increase=0.0;
		for (double i:array){
			increase=increase*i;
		}
		return increase;
	}
}
