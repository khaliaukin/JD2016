package by.it.makevich.jd01_03;


public class Util {
	public static Double[]arraySortFromMinToMax(Double[] arr){
		/**
		 * метод сортировки от минимального к максимальному
		 */
		for(int i = arr.length-1 ; i > 0 ; i--){
			for(int j = 0 ; j < i ; j++){//
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
				if( arr[j] > arr[j+1] ){
					double tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}
	/**
	 * метод сортировки от максимального значения к минимальному
	 * @param arr отсортированный массив
	 */
	public static Double[]arraySortFromMaxToMin(Double[] arr){

		for(int i = arr.length-1 ; i > 0 ; i--){
			for(int j = 0 ; j < i ; j++){//
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
				if( arr[j] < arr[j+1] ){
					double tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}
	public static double findMaxValueInArray(Double[] arr){
		if (0==arr.length){
			return Double.MAX_VALUE;}
			else {
			double max=arr[0];
			for (double m:arr) {
			if (max<m){
				max=m;
			}
			}
			return max;
		}
		}

	public static double findMinValueInArray(Double[] arr){
		if (0==arr.length){
			return Double.MIN_VALUE;}
		else {
			double min=arr[0];
			for (double m:arr) {
				if (min>m){
					min=m;
				}
			}
			return min;
		}
	}
	}


