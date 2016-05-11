package by.it.makevich.jd01_06;

import java.io.IOException;

public class B2 {
	public static void main(String[] args) throws IOException {
		StringBuilder str = new StringBuilder(Content.lukomor);
		String[] sentance = Content.lukomor.trim().split("[;.!?]+");//создали массив из предложений
		String[] words;//массив слов в предложениях
		int[] count = new int[sentance.length];//
		for (int i = 0; i < sentance.length; i++) {
			words = sentance[i].trim().split("[^а-яА-ЯёЁ]+");
			count[i] = words.length;

		}
		int temp=0;
		String[] out = new String[sentance.length];
		for (int i = 0; i < sentance.length - 1; i++) {
			for (int j = i + 1; j < sentance.length; j++)
				if (count[i] > count[j]) {
					temp=count[i];
					count[i]=count[j];
					count[j]=temp;
					out[i] = sentance[i];
					sentance[i] = sentance[j];
					sentance[j] = out[i];
				}
		}

		for (String i : sentance) {
			System.out.print(i);

		}


	}
}




