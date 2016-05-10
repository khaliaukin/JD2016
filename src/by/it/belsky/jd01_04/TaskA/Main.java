package by.it.belsky.jd01_04.TaskA;

import java.io.IOException;

/**
 * r
 * Created by misha on 05.05.2016.
 */
public class Main {
    public static void main(String args[]) throws IOException {
        double[] y = {20, 11, 40, 37};
        double[][] m = {
                {2, 5, 4, 1},
                {1, 3, 2, 1},
                {2, 10, 9, 7},
                {3, 8, 9, 2}

        };
        //InOut.arrayPrint2D(m);
        //InOut.arrayPrint2D(m, "m");
        double[] x = Util.findRoot(m, y, false);
        InOut.arrayPrint(x, "X", 1);
        System.out.println();
        InOut.arrayPrint(InOut.arrayMulVector(m, x), "Y", 4);

    }
}

