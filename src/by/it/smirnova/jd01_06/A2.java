package by.it.smirnova.jd01_06;

public class A2 {
    public static void main(String[] args) {

        String text = Data.lukomor;

        String[] mastext = text.split("[^а-яА-ЯёЁ]+");

        for (int i = 0; i < mastext.length; i++) {
            {
                int count =  0;

                for (int j = 0; j < mastext.length; j++)
                {
                    if (mastext[i].equals(mastext[j]))
                    {
                        count++;
                    }
                }
                System.out.println("Число повторов слова \"" + mastext[i] + "\" составляет " + count);
            }
        }
    }
}