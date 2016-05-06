package by.it.kust.jd01_04;

import java.io.IOException;

/**
 * Created by user_2 on 02.05.2016.
 */
public class Main {
    /**
     * Находим корни
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        double y[] = {20, 11, 40, 37};
       double m[][] = {
                {2, 5, 4, 1},
                {1, 3, 2, 1},
                {2, 10, 9, 7},
                {3, 8, 9, 2}
        };

        double[] x = Utils.findRoot(m, y, false);
        System.out.println("Произведение двух матриц:");
        InOut.arrayPrint(x, "X", 1);

        //проверка СЛАУ
        InOut.arrayPrint(Utils.arrayMulVector(m, x), "yy", 4);
    }
}