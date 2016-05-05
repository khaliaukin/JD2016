package by.it.kushel.jd01_02.levelA;

public class TaskA {
    public static String getMax (String line) {
        String[] str=line.split(" ");
        int lenghtMax = str[0].length();
        String element=str[0];
        int k=0;
        for (int i=0; i<str.length-1;i++) {
           if (lenghtMax <str[i+1].length()){
               lenghtMax=str[i+1].length();
               element =str[i+1];
               k=0;
           }
            if (lenghtMax == str[i+1].length()){
                k++;}// счетчик количества чисел одинаковой максимальной длины
           }

        if(k>1){
            System.out.println("В строке нескольк чисел одинаковой длины = " + lenghtMax + ", выведено первое число");
        }
        return "MAX= " + element + " lenght= " + lenghtMax;

    }

    public static String getMin (String line){
        String[] str=line.split(" ");
        int lenghtMin = str[0].length();
        String element=str[0];
        int k=0;
        for (int i=0; i<str.length-1;i++) {
            if (lenghtMin>str[i+1].length()){
                lenghtMin=str[i+1].length();
                element =str[i+1];
                k=0;
            }
            if (lenghtMin == str[i+1].length()){
                k++;}// счетчик количества чисел одинаковой минимальной длины
        }
        if(k>0){
            System.out.println("В строке нескольк чисел одинаковой длины = " + lenghtMin + ", выведено первое число");
        }

        return "MIN=" + element + " lenght=" + lenghtMin;
    }
    public static void nLessOfMean (String line) {
        int sumOfLenght = 0;
        double arMean = 0;
        String[] str = line.split(" ");
        int lenghtMin = str[0].length();
        String element = str[0];
        for (int i = 0; i < str.length; i++) {
            sumOfLenght = sumOfLenght + str[i].length();
        }
        arMean = sumOfLenght / str.length;
        System.out.println("Среднее арифметическое длин строк = " + arMean);
        System.out.println("Числа, длина которых меньше среднего арифметического длин всех элементов:");
        int n = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() < arMean) {
                n = n + 1;

                String[] newMas = new String[n];
                newMas[n - 1] = str[i];
                System.out.print(newMas[n - 1] + "; ");
            }
        }
        if (n == 0) {
            System.out.println("строка не содержит таких чисел");
        }
    }


    private  static String[] getTokens(String line) {
        String str = line.trim();
        return str.split(" ");
    }

        /*public static void nWithDiffCharacter (String[] numbers) {


            for (int i = 0; i < numbers.length; i++) {
                int lengthOfNumber = numbers[i].length();
                for (int j = 0; j < lengthOfNumber; j++) {

                   char[] elementsOfNumber = new char[lengthOfNumber];
                    elementsOfNumber = numbers[i].toCharArray();

                    char[] elementsOfNumber = new char[lengthOfNumber - 1];
                    elementsOfNumber[j] = numbers[i].charAt(j);

                    System.out.println(elementsOfNumber[j]);
                    for (int k=j+1; k<lengthOfNumber;k++){
                        if (elementsOfNumber[k]==(elementsOfNumber[j])){

                        }
                    }
                    }
                }
        }
             return numbers;
                */
}





