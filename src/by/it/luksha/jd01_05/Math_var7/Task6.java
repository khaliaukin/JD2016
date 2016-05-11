package by.it.luksha.jd01_05.Math_var7;


public class Task6 {
    public static double[] createArray() {
        int size = 35;
        double[] array = new double[size];

        for (double i = 0, x = 12; i < 35; i++, x+=1.85)
        {
            array[(int)i] = Math.sqrt(x/3 + 1);
        }

        return array;
    }

    public static void printArray (double[] array, String name) {
        System.out.printf("┌────────────────────┐\n");
        System.out.printf("%-10s%-28s%-1s\n","│", name, "│");
        System.out.printf("├─────────┬─────────┤\n");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-10s%-10d%-5s%-10.5f%-10s\n", "│", i+1, "│", array[i], "│");
        }
        System.out.printf("└──────────┴──────────┘\n");
    }

    public static double[] selectedNewElement(double[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (4 < array[i] && array[i] < 5)
                count++;
        }

        double[] arrayNew = new double[count];

        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (4 < array[i] && array[i] < 5) {
                arrayNew[count] = array[i];
                count++;
            }
        }

        return arrayNew;
    }

    public static int calcEven(double[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0)
                count++;
        }

        return count;
    }
}
