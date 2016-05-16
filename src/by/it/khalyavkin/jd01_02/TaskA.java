package by.it.khalyavkin.jd01_02;

/**
 * Created by user_2 on 27.04.2016.
 */
public class TaskA {
    static String getMax (int array []) {
        int lenMax = 0;
        Integer max = Integer.MIN_VALUE;
        for ( int i : array ) {
            if (max < i) {
                max = i;
            }
        }
        return "MAX=" + max.toString()+"length=" + max.toString().length();
    }

    static String getMin (int array []) {
        int lenMax = 0;
        Integer min = Integer.MAX_VALUE;
        for ( int i : array ) {
            if (min >i) {
                min = i;
            }
        }
        return "MIN=" + min.toString()+"length=" + min.toString().length();
    }

    static double mean (int array[]) {
        double res = 0;
        for (int i: array) res+=i; // res = res + i;
        res/=array.length; // res = res/array.lengh
        return res;
    }
}
