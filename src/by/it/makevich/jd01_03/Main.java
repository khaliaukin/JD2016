package by.it.makevich.jd01_03;
import java.io.IOException;
public class Main {
	public static void main (String[] args) throws IOException {

		//String line = InOut.consoleReadLine(); //получили введенную строку с консоли

		String line = "32.43 34.3 12.65 12.43 45.34 543.3 23.3";
		Double[] arrayDouble = InOut.getArrayDoubleFromRline(line);//создали масив типа Double из введенной строки
		System.out.print("Числа введенные из консоли: ");
		InOut.printDoubleArray(arrayDouble); //вывели массив на экран
		System.out.println();
		//Double[][] arrayDouble2D = InOut.get2DArrayFromLine(line);

		System.out.print("Отсортированные по возрастанию числа: ");
		InOut.printDoubleArray(Util.arraySortFromMinToMax(arrayDouble));
		System.out.println();
		System.out.print("Отсортированные по убыванию числа: ");
		InOut.printDoubleArray(Util.arraySortFromMaxToMin(arrayDouble));

		System.out.println();
		System.out.print("Самое большое введенное число: "+Util.findMaxValueInArray(arrayDouble));

		System.out.println();
		System.out.print("Самое маленькое введенное число: "+Util.findMinValueInArray(arrayDouble));

	}
}
