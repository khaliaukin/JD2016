package by.it.khalyavkin.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by TECHNODOCTOR on 07.05.2016.
 */
public class TextUtils {

    static StringBuilder replaceWord57(StringBuilder s) {

        //System.out.println(s); // debug
        String regex = "([А-Яа-яёЁ])+"; // regular expressions
        Pattern p1 = Pattern.compile(regex);

        Matcher m1 = p1.matcher(s);
        boolean b = m1.find();
        // System.out.println(b);// debug

        int cur=0; // курсор

        while (b) {


            //StringBuilder subWord = new StringBuilder(m1.group());
/*
            System.out.println(subWord);
            System.out.println(m1.start());
            System.out.println(m1.end());
*/
            if ((m1.end()-m1.start()) >= 5) { //первічная проверка дліны слова 5
                s.setCharAt((m1.start()+4),'#'); //замена
                if ((m1.end()-m1.start()) >=7) { //вторічная проверка дліны слва 7
                    s.setCharAt((m1.start()+6),'#');//замена
                }
            }

            cur=m1.end(); //курсор на конец слова
            b = m1.find(cur); //проверка соответствія заданному регексу после последнего слова
            //System.out.println(subWord.length());// тестовая дліна
        }
        // System.out.println(s.length()); // тестовая дліна
        return s;
    }


    static StringBuilder calculateWords (StringBuilder s) {
        //System.out.println(s); // debug
        String regex = "([А-Яа-яёЁ])+"; // regular expressions
        Pattern p1 = Pattern.compile(regex);

        Matcher m1 = p1.matcher(s);

        boolean b1 = m1.find();
        boolean b2 = m1.find();
        // System.out.println(b);// debug

        int cur=0; // курсор

        int schetchik = 0;
        int counterWord = 0;
        StringBuilder subWord = new StringBuilder(m1.group());
        String wordCursor = new String(m1.group());
        while (b1) {
            wordCursor= new String(m1.group());
            counterWord = m1.end();
            schetchik=0;
            while (b2) {
                subWord = new StringBuilder(m1.group());
                if (wordCursor.equalsIgnoreCase(subWord.toString())) {
                    schetchik++;
                    System.out.println("wordCursor="+wordCursor+" subWord="+subWord+" schetchik="+schetchik);
                }
            /*    System.out.println(" subWord"+subWord);
                System.out.println(" wordCursor"+wordCursor);
                System.out.println(" m1.start="+m1.start());
                System.out.println(" m1.end="+m1.end());
                System.out.println(" schetchik="+schetchik);
*/
                cur = m1.end(); //курсор на конец слова
                b2 = m1.find(cur); //проверка соответствія заданному регексу после последнего слова
                //System.out.println(subWord.length());// тестовая дліна
            }
            // System.out.println(s.length()); // тестовая дліна
            //

            //m1.reset();
            b1=m1.find(counterWord);
            b2=m1.find(counterWord);
            System.out.println(" schetchik="+ schetchik +" counterWord="+counterWord +" wordCursor=" + wordCursor + " subWord="+subWord+" b1=" +b1 );
            // нужно удалить слово и все его

        }



        return s;

    }


}
