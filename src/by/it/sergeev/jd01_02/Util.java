package by.it.sergeev.jd01_02;


/**
 * Created by user_2 on 27.04.2016.
 */
public class Util {
    static int[] lineToIntArray(String line){
        String []strArray = line.split(" ");
        int [] array = new int[strArray.length];
        for (int j = 0; j < strArray.length; j++)
        {
            array[j] = Integer.parseInt(strArray[j]);
        }
        return array;
    }
}
