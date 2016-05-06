package by.it.belsky.jd01_04.TaskB;

import java.io.IOException;

/**
 * Created by misha on 05.05.2016.
 */
public class Main {
    public static void main(String args[]) throws IOException {
        double[][] m = {
                {2, 5, 4, 1,9},
                {1, 3, 2, 1,9},
                {2, 10, 9, 7,9},
                {3, 8, 9, 2,9}

        };
        Util.arrayPrint2D(m, "m");
        Util.Matrix(m, true);
       Util.determinant(m);
    }
}

//rr