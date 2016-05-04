package by.it.makevich.jd01_03;


public class Util {
	/**
	 * метод сортировки от минимального значения к максимальному
	 * @param arr входной массив чисел
	 * @return возвращает отсортированный по возрастанию массив чисел
	 */
	public static Double[]arraySortFromMinToMax(Double[] arr){
		for(int i = arr.length-1 ; i > 0 ; i--){
			for(int j = 0 ; j < i ; j++){
				if( arr[j] > arr[j+1] ){double tmp = arr[j];arr[j] = arr[j+1];arr[j+1] = tmp;}
			}
		}
		return arr;
	}
	/**
	 * метод сортировки от максимального значения к минимальному
	 * @param arr входящий массив чисел
	 * @return возвращает отсортированный по убыванию массив чисел
	 */
	public static Double[]arraySortFromMaxToMin(Double[] arr){
		for(int i = arr.length-1 ; i > 0 ; i--){
			for(int j = 0 ; j < i ; j++){
				if( arr[j] < arr[j+1] ){double tmp = arr[j];arr[j] = arr[j+1];arr[j+1] = tmp;}
			}
		}
		return arr;
	}
	/**
	 * метод поиска самого большого числа в массиве
	 * @param arr входной массив чисел
	 * @return возвращает самое большое число в массиве
	 */
	public static double findMaxValueInArray(Double[] arr){
		if (0==arr.length){return Double.MAX_VALUE;}
			else {double max=arr[0];
			for (double m:arr) {if (max<m){max=m;}}
			return max;
		}
		}

	/**
	 * метод поиска самого маленького числп в массиве
	 * @param arr входной массив чисел
	 * @return возвращает минимальное число в массиве
	 */
	public static double findMinValueInArray(Double[] arr){
		if (0==arr.length){return Double.MIN_VALUE;}
		else {double min=arr[0];
			for (double m:arr) {if (min>m){min=m;}}
			return min;
		}
	}
	}


