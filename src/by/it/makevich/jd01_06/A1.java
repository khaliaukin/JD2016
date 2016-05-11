package by.it.makevich.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A1 {
		public static void main(String[] args) {
			StringBuilder str=new StringBuilder(Content.lukomor);
			Pattern pattern=Pattern.compile("[а-яА-ЯёЁ]{5,}");//создаем паттерн
			Matcher matcher=pattern.matcher(str);//получили все слова длинной 5 и более символов
			while (matcher.find()){
				int start=matcher.start();
				int length = matcher.group().length();
				str.setCharAt(start+4,'#');
				if (length>6)
					str.setCharAt(start+6,'#');
			}
			System.out.println(str);
		}
}
