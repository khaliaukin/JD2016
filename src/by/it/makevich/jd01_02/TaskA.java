package by.it.makevich.jd01_02;

public class TaskA {
	static String getMax(int array[]) {
		Integer max = Integer.MIN_VALUE;
		for (Integer i : array){
			if (max<i){
				max = i;
			}
		}
		return "Самое длинное введенное число="+ max.toString()+ ", длина числа="+max.toString().length()+" цифр";
	}

	static String getMin(int array[]) {
		Integer min = Integer.MAX_VALUE;
		for (Integer i : array){
			if (min>i){
				min = i;
			}
		}
		return "Самое короткое введенное число="+ min.toString()+ ", длина числа="+min.toString().length()+" цифр";
	}

	/**
	 *
	 * @param array входной массив чисел с консоли
	 * @return возвращает отформатированное среднее арифметическое значение от суммы длин всех чисел массива
	 */
	static Double getArifm (int array[]){
		double length = 0;
		for (Integer i : array){
			length = length+i.toString().length(); //узнали сумму длин чисел всего массива
		}
		double mean = length/array.length; //узнали среднее арифметическое
		String formatedString = String.format("%.2f",mean);
		formatedString = formatedString.replace(',','.');
		Double formatedDouble = Double.parseDouble(formatedString);
		return formatedDouble;
	}

	/**
	 *
	 * @param value входной массив чисел с консоли
	 * @return true возвращает числа с разными цифрами
	 */
	static boolean getNumberWithAllDiffrentDigits (Integer value){
		char[] chars = value.toString().toCharArray();
		for (int i=0;i<chars.length-1;i++)
			for (int j = i+1; j<chars.length; j++)
				if (chars[i] == chars[j]) return false;
		return true;
	}
}

