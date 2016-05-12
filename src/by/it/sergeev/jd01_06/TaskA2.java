package by.it.sergeev.jd01_06;

public class TaskA2 {
    public static void Pushkin2() {
        String text = Pushkin.getString().toUpperCase(); //переход всех слов в верхний регистр.
        String[] mastext = text.split("[^А-ЯЁ]+");

        for (int i = 0; i < mastext.length; i++) {
            if (mastext[i].length() > 0) {
                int count = 1;
                for (int j = i + 1; j < mastext.length; j++) {
                    if (mastext[i].equals(mastext[j])) {
                        count++;
                        mastext[j] = "";
                    }
                }
                String a = "Слово ";
                String b = a.concat(mastext[i] + " ");
                String c = b.concat("повторяется " + count);
                System.out.println(c);
            }
        }
    }
}

