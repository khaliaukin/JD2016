package by.it.makevich.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B1 {
	public static void main(String[] args) {

		StringBuilder str = new StringBuilder(Content.lukomor);//создали объект StringBuilder с исходным текстом
		String[] arr = Content.lukomor.split("[^а-яА-ЯёЁ]+");// создали массив слов из исходного текста
		Pattern pattern = Pattern.compile("[бвгджзклмнпрстфхцчшщБВГДЖЗКЛМНПРСТФХЦЧШЩ]");//паттерн согласных букв
		int index=0;
		for (int i = 0; i < arr.length; i++) {//перебираем массив
			String p = String.valueOf(arr[i].charAt(0));//нашли первую букву слова
			Matcher matcher = pattern.matcher(p);//сравниваем найденную ранее букву в шаблоном паттерна
			while (matcher.find()) {//пока находим соответсвия
				if (arr[i].length() == 5) {//если длина слова 5 символов
					index=str.indexOf(arr[i]);//находим индекс первой буквы слова в исходном тексте
					str.deleteCharAt(index);//удаляем букву 5 раз
					str.deleteCharAt(index);
					str.deleteCharAt(index);
					str.deleteCharAt(index);
					str.deleteCharAt(index);

				}
			}
		}
		System.out.println(str);

	}
}