package by.it.drachyova.jd01_02;

class TaskA {

    //поиск самого длинного числа и его длины
    static String getMaxLenght(int array[]) {
        Integer lenghtMax = 0;
        for (Integer i : array) {
            if (lenghtMax.toString().length() < i.toString().length()) {
                lenghtMax = i;
            }
        }
        return "Самое длинное число = " + lenghtMax + " Его длина = " + lenghtMax.toString().length();
    }

    //поиск самого короткого числа и его длины
    static String getMinLenght(int array[]) {
        Integer lenghtMin = Integer.MAX_VALUE;
        for (Integer i : array) {
            if (lenghtMin.toString().length() > i.toString().length()) {
                lenghtMin = i;
            }
        }
        return "Самое короткое число = " + lenghtMin + " Его длина = " + lenghtMin.toString().length();
    }

    //вычисление среднего арифметического
    static double meanLenght(int array[]) {
        double res = 0;
        for (Integer i : array) {
            res += i.toString().length();
        }
        res /= array.length;
        return res;
    }

    //метод проверяет состоит ли число из разных цифр
    static boolean uniqueDigits(Integer value) {
        char ch[] = value.toString().toCharArray();
        for (int i = 0; i < ch.length; i++){
            for(int j=i+1;j<ch.length;j++)
                if (ch[i] == ch[j])
                    return false;
        }
        return true;
    }
}
