package by.it.kushel.jd01_06;

import java.util.regex.*;

/**
 * Created by Diomn on 09.05.2016.
 */

public class TaskA1
{
    public static void main(String[] arg) {
        Pattern pat;
        Matcher mat;
        boolean found;

        String str = new String(Data.lukomor);
pat =Pattern.compile("(^|[^А-яа-яЁё])([А-Яа-яЁё]{5,})");
        mat=pat.matcher(str);
        char[] masStr=str.toCharArray();
        while(mat.find()) {
            int indexOfWordStart = mat.start(2);
            //System.out.println(indexOfWordStart);
            int index5 = indexOfWordStart + 4;
            int index7 = indexOfWordStart + 6;
            int sizeOfWord = mat.end()-mat.start();
            if (sizeOfWord>=7) {
                masStr[index7]='#';
            }
            masStr[index5]='#';

        }

            for(int i=0; i<masStr.length; i++){
                System.out.print(masStr[i]);
            }

System.out.println();
        String modifiedStr=new String(masStr);
            System.out.println(modifiedStr);



        //String[] words=str.split("[\\p{Punct}\\p{Blank}]");


        /*char[] masStr=new char[str.length()];
            for(int i=0; i<str.length(); i++) {
              masStr[i]= str.char(i)
            }
            System.out.println(str);*/


    }
}
