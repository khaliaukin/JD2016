package by.it.akhmelev.jd01_02;

public class TaskA {
    //метод поиска максимального элемента и его длины
    //результат - строка для вывода на консоль
    static String getMax(int array[]) {
        Integer max = Integer.MIN_VALUE;
        for (Integer i : array) {
            if (max < i) {
                max = i;
            }
        }
        return "MAX=" + max.toString() + " length=" + max.toString().length();
    }


    //метод поиска минимального элемента и его длины
    //результат - строка для вывода на консоль
    static String getMin(int array[]) {
        Integer min = Integer.MAX_VALUE;
        for (Integer i : array) {
            if (min > i) {
                min = i;
            }
        }
        return "MIN=" + min.toString() + " length=" + min.toString().length();
    }

    //метод вычисления среднего арифметического
    static double mean(int array[]) {
        double res = 0;
        //все сложить
        for (int i : array) res = res + i; //можно и так: res+=i;
        //найти среднее
        res = res / array.length;          //можно и так: res/=array.length;
        return res;
    }

    //метод поиска числа, состоящего из разных цифр
    static boolean uniqueDigits(Integer value){
        char ch[]=value.toString().toCharArray();
        for (int i=0;i<ch.length;i++)
            for (int j=i+1;j<ch.length;j++)
                if (ch[i]==ch[j]) return false;
        //если не попалось одинаковых цифр, то они все разные
        return true;
    }



}










