package by.it.smirnova.jd01_04;

import java.io.IOException;

/**
 * Created by Evgenia on 03.05.2016.
 */
public class MatrixMain {

    public static void main (String[] args) throws IOException {

        double [] y={20, 11, 40, 37};

        double[][] m={

                {2, 5,  4, 1},
                {1, 3,  2, 1},
                {2, 10, 9, 7},
                {3, 8,  9, 2}

        };

        double[] x=Utils.findRoot(m,y,false);

        InOut.arrayPrint(x, "X", 1);

        InOut.arrayPrint(Utils.arrayMulVector(m,x), "yy", 4);
    }
}
