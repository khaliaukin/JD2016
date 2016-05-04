package by.it.makevich.jd01_02;

public class Util {
	/**
	 *
	 * @param line строка чисел с консоли
	 * @return возвращает массив чисел
	 */
	static int[] lineToIntArray(String line){
		String[] strMas = line.split(" ");
		int[] array = new int[strMas.length];
		for(int j = 0; j < strMas.length; j++) {
			array[j] = Integer.parseInt(strMas[j]);
		}
		return array;
	}
}
