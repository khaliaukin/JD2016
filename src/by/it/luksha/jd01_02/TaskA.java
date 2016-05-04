package by.it.luksha.jd01_02;

public class TaskA {
    /**
     *Метод ищет число с максимальным числом цифр
     * @param array массив для поиска
     * @return максимальный элемент
     */
    public static int maxLength(int[] array) {
        int maxLength = 0;
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maxLength < String.valueOf(array[i]).length())
            {
                maxNumber = array[i];
                maxLength = String.valueOf(array[i]).length();
            }
        }

        return maxNumber;
    }

    /**
     * Метод ищет число с минимальным числом цифр
     * @param array массив для поиска
     * @return минимальный элемент
     */
    public static int minLength(int[] array) {
        int minLength = Integer.MAX_VALUE;
        int minNumber = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (minLength > String.valueOf(array[i]).length())
            {
                minNumber = array[i];
                minLength = String.valueOf(array[i]).length();
            }
        }

        return minNumber;
    }

    /**
     * Метод выводит в консоль элементы длинна которых меньше среднего арифметического длинн всех элементов массива
     * @param array массив с элементами int
     */
    public static void lessThanMean(int[] array) {
         //считаем среднее длинн всех элементов массива
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += String.valueOf(array[i]).length();
        }
        double mean = 1.0*sum/array.length*1.0;
        System.out.println("Среднее арифметическое длинн - " + mean);
        System.out.print("Числа короче среднего арифметического: ");

        //выводим числа меньше среднего
        for (int number: array) {
            if (String.valueOf(number).length() < mean)
                System.out.print(number + " ");
        }
    }

    /**
     * Метод ищет в массиве все числа, состоящие из различных цифр
     * @param array массив int для поиска
     */
    public static void differentNums(int[] array) {
        for (int i = 0; i < array.length; i++) {
            char[] ch = String.valueOf(array[i]).toCharArray();
            //если число состоит из одной цифры - удовлетворяет условие
            if (ch.length == 1)
                System.out.print(array[i] + " ");

            //isDiff - флаг числа с различными цифрами
            boolean isDiff = false;
            for (int j = 0; j < ch.length-1; j++) {
                for (int k = 1; k < ch.length; k++) {
                    if (ch[j] != ch[k])
                        isDiff = true;
                    else
                    {
                        isDiff = false;
                        break;
                    }
                }
                if (isDiff)
                    System.out.print(array[i] + " ");
            }
        }
    }

}
