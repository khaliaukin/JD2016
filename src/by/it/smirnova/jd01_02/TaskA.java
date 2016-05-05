package by.it.smirnova.jd01_02;

/**
 * Created by user_2 on 27.04.2016.
 */
public class TaskA {

    static String getMax(int array[])
    {
        int lenMax = Integer.MIN_VALUE;
        for (Integer i : array) {
            if (lenMax < i.toString().length()) {
                lenMax = i.toString().length();
            }
        }

        return "MAX length=" + lenMax;
    }

    static String getMin(int array[])
    {
        int lenMin = Integer.MAX_VALUE;
        for (Integer i : array){
            if (lenMin > i.toString().length()){
                lenMin = i.toString().length();

            }
        }
        return "Min length=" + lenMin;
    }

    static double mean(int array[])
    {
        double res = 0;

        for (int i=0; i<array.length; i++)
            res = res + array[i];


        res = res / array.length;

        return res;
    }

    static boolean uniqueDigits(Integer value)
    {
        char ch[] = value.toString().toCharArray();

        for (int i = 0; i < ch.length; i++)
        {
            for (int j = i + 1; j < ch.length; j++)
            {
                if (ch[i] == ch[j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
