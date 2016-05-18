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
        String regex = "([А-Яа-яёЁ])+"; // regular expressions
        Pattern p1 = Pattern.compile(regex);

        Matcher m1 = p1.matcher(s);

        boolean b1 = m1.find(0);

        int cur=0; // курсор

        int schetchik = 0;
        int counterWord = 0;
        StringBuilder subWord = new StringBuilder(m1.group());

        boolean b2 = m1.find(0);

        String wordCursor = new String(m1.group());
        while (b1) {
            wordCursor= new String(m1.group());
            counterWord = m1.end()+1;
            schetchik=0;
            while (b2) {
                subWord = new StringBuilder(m1.group());
                if (wordCursor.equalsIgnoreCase(subWord.toString())) {
                    schetchik++;
                    for (int i=m1.start();i<m1.end();i++ ) {
                      s.setCharAt(i,'#');
                    }
                   // System.out.println("wordCursor="+wordCursor+" subWord="+subWord+" schetchik="+schetchik);
                    // отладочная
                }
                cur = m1.end()+1; //курсор на конец слова
                b2 = m1.find(cur); //проверка соответствія заданному регексу после последнего слова
            }

            b1=m1.find(counterWord);
            b2=m1.find(counterWord);
            //System.out.println(" schetchik="+ schetchik +" counterWord="+counterWord +" wordCursor=" + wordCursor + " subWord="+subWord+" b1=" +b1 );
            // отладочная
            System.out.println(wordCursor+" "+schetchik);
        }

        return s;

    }

    static void calculateGlasWords (StringBuilder s) {
        String regex = "([А-Яа-яёЁ])+"; // regular expressions
        String regex2 = "([АЕЁИОУЭЮЯаеёиуэюя][а-я][ё][аеёиуэюя])"; // regular expressions
        Pattern p1 = Pattern.compile(regex);
        Pattern p2 = Pattern.compile(regex2);
        Matcher m1 = p1.matcher(s);

        boolean b = m1.find();
        // System.out.println(b);// debug

        int cur=0; // курсор


        String wordCursor = new String(m1.group());
            wordCursor= new String(m1.group());

String wordGlas = new String ();



        while (b) {
            wordCursor= new String(m1.group());
            //Matcher m2 = p2.matcher(wordCursor);
            //wordGlas = new String(m2.group());
            System.out.println(wordCursor+"-");
            if (p2.matches(regex2,wordCursor)) {
               System.out.println(wordCursor+"=");
                }
            }

            cur=m1.end(); //курсор на конец слова
            b = m1.find(cur); //проверка соответствія заданному регексу после последнего слова
            //System.out.println(subWord.length());// тестовая дліна
        }
        // System.out.println(s.length()); // тестовая дліна




    static StringBuilder calculateGlasWords2 (StringBuilder s) {

        //System.out.println(s); // debug
        String regex = "([А-Яа-яёЁ])+"; // regular expressions
        String glas ="[АЕЁИОУЭЫЮЯаеёиоуэыюя]";
        Pattern p1 = Pattern.compile(regex);
        Pattern p2 = Pattern.compile(glas);

        Matcher m1 = p1.matcher(s);
        boolean b = m1.find();
        // System.out.println(b);// debug
int sch=0; // первічное значеніе счетчіка
        int cur=0; // курсор

        while (b) {


            //StringBuilder subWord = new StringBuilder(m1.group());
/*
            System.out.println(subWord);
            System.out.println(m1.start());
            System.out.println(m1.end());
*/
            if (s.charAt(m1.start())=p2) { //первічная проверка начала слова на гласную
                s.setCharAt((m1.start()+4),'#'); //замена
                if ((m1.end()-m1.start()) >=7) { //вторічная проверка конца слова на гласную
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


    }


