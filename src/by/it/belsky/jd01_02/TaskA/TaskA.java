package by.it.belsky.jd01_02.TaskA;
/* rrпоиск самого длинного числа */

public class TaskA {
    public static String getMax(int array[]) {
        int LenMax = 0;
        Integer max = Integer.MIN_VALUE;
        for (Integer i : array) {
            if (max < i) {
                max = i;
            }
        }
        return "MAX=" + max.toString() + "  length=" + max.toString().length();
    }

    public static String getMin(int array[]) {
        int LenMax = 0;
        Integer min = Integer.MAX_VALUE;
        for (Integer i : array) {
            if (min > i) {
                min = i;
            }
        }
        return "MIN=" + min.toString() + "  length=" + min.toString().length();
    }
    public static double mean(int array[]) {
        double res = 0;
        {
            for (Integer i : array)
                res = res + i;
        }
        res = res / array.length;
        return res;
    }
    public static boolean uniqueDigits(Integer value) {
        char ch[] = value.toString().toCharArray();
        for (int i=0; i <ch.length; i++)
            for (int j=i+1; j < ch.length; j++)
                if (ch[i]==ch[j]) return false;
        return true;
    }
}
//Task A