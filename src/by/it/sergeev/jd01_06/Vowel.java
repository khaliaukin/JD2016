package by.it.sergeev.jd01_06;

/**
 * Created by Дмитрий on 07.05.2016.
 */
public class Vowel {
    static boolean vowel(String word) {
        //паттерн для гласных букв
        String vowel = "ёЁуУеЕыЫаАоОэЭяЯиИюЮ";
        //добавим туда еще и большие
        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);
        //вернем true если гласная в начале и в конце
        return (vowel.indexOf(first) >= 0 && vowel.indexOf(last) >= 0);
    }
}
