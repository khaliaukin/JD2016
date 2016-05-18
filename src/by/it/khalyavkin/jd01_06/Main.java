package by.it.khalyavkin.jd01_06;

import java.util.regex.Pattern;

import static jdk.nashorn.internal.objects.NativeString.length;

/**
 * Created by user_2 on 06.05.2016.
 */
public class Main {
    public static void main (String[]args) {
        StringBuilder s= new StringBuilder("У лукоморья дуб зелёный;\n" +
                "Златая цепь на дубе том:\n" +
                "И днём и ночью кот учёный\n" +
                "Всё ходит по цепи кругом;\n" +
                "Идёт направо - песнь заводит,\n" +
                "Налево - сказку говорит.\n" +
                "Там чудеса: там леший бродит,\n" +
                "Русалка на ветвях сидит;\n" +
                "Там на неведомых дорожках\n" +
                "Следы невиданных зверей;\n" +
                "Избушка там на курьих ножках\n" +
                "Стоит без окон, без дверей;\n" +
                "Там лес и дол видений полны;\n" +
                "Там о заре прихлынут волны\n" +
                "На брег песчаный и пустой,\n" +
                "И тридцать витязей прекрасных\n" +
                "Чредой из вод выходят ясных,\n" +
                "И с ними дядька их морской;\n" +
                "Там королевич мимоходом\n" +
                "Пленяет грозного царя;\n" +
                "Там в облаках перед народом\n" +
                "Через леса, через моря\n" +
                "Колдун несёт богатыря;\n" +
                "В темнице там царевна тужит,\n" +
                "А бурый волк ей верно служит;\n" +
                "Там ступа с Бабою Ягой\n" +
                "Идёт, бредёт сама собой,\n" +
                "Там царь Кащей над златом чахнет;\n" +
                "Там русский дух... там Русью пахнет!\n" +
                "И там я был, и мёд я пил;\n" +
                "У моря видел дуб зелёный;\n" +
                "Под ним сидел, и кот учёный\n" +
                "Свои мне сказки говорил.");

        StringBuilder s1= new StringBuilder("аплпдвьы4442 пплпллеадвввпекеппп апп444 паывввввввпрра алалал44444");
        //s=s.trim();
        //String [] slova = s.split(" ");

        //StringBuilder sd = new StringBuilder(s);
        //String regex = ("[А-Я][а-я][Ёё]");
        //Pattern p1 = Pattern.compile(regex);
        //for (int cos.charAt(counter);unter=0;counter<s.length();counter++ ) {
            // if проверка длины слова
            // s.group (int)  нумерация группы
          //
        //}

        //TextUtils.replaceWord57(s);
        //System.out.println(s);

        //TextUtils.calculateWords(s);
       //System.out.println(s);
        TextUtils.calculateGlasWords(s);
    }
}
