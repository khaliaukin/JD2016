package by.it.sergeev.jd01_02;

/**
 * Created by user_2 on 27.04.2016.
 */
public class TaskA {
    //А1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длинну.
    static String getMax(int array[])
    {
        Integer max = Integer.MIN_VALUE;
        for (Integer i : array)
        {
            if (max < i)
            {
                max = i;
            }
        }
        return "Max =" + max.toString() + " length=" + max.toString().length();
    }
    static String getMin(int array[])
    {
        Integer min = Integer.MAX_VALUE;
        for (Integer i : array)
        {
            if (min > i)
            {
                min = i;
            }
        }
        return "Min =" + min.toString() + " length=" + min.toString().length();
    }
    //А2. Вывести на консоль те числа, длина которых меньше среднего арфметического.
    static double mean (int array[])
    {
        double res = 0;
        for (int i: array)
        {
            res+=i;
        }
        res = res / array.length;
        return res;
    }
    //А3. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
    static boolean uniqueDigits(Integer value)
    {
        char ch[] = value.toString().toCharArray();
        for (int j=0; j<ch.length;j++)
            for (int b=j+1; b<ch.length; b++) {
                if (ch[j] == ch[b])
                    return false;
            }
        return true;
    }
}
