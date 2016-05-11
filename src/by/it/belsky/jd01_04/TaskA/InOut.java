package by.it.belsky.jd01_04.TaskA;

/**
 * Created by misha on 05.05.2016.
 */
public class InOut {
    public static void arrayPrint(double m[], String name, int cols) {
        int col = 0;
        for (int i = 0; i < m.length; i++) {
            System.out.print(name);
            System.out.printf("[ %-1d ]=%-9.4f ", i, m[i]);
            col++;
            if ((0 == col % cols)
                    || (m.length - 1 == i)) {
                System.out.println();
            }
        }
    }

   public static void arrayPrint2D(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++)
                System.out.printf("%6.2f", m[i][j]);
            System.out.println();
        }
        System.out.println();
    }
    public static void arrayPrint2D(double[][] m, String name) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++)
                System.out.printf(name+"[%1d,%1d]=%-6.1f ", i,j, m[i][j] );
            System.out.println();
        }
        System.out.println();
    }
    public static double[] arrayMulVector ( double[][] x, double[] y){
        double[] z = new double[x.length];
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < y.length; j++)
                z[i] = z[i] + x[i][j] * y[j];
        return z;
    }

    public static double[][] arrayMulVector ( double[][] x, double[][] y){
        double[][] z = new double[x.length][y[0].length];
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < y[0].length; j++)
                for (int k = 0; k < y[0].length; k++)
                    z[i][j] = z[i][j] + x[i][k] * y[k][j];
        return z;
    }
}


