package by.it.sinkevich.jd01_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Computer on 07.05.2016.
 */
class Util {

    static double getDoubleFromConsole() throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String line = consoleReader.readLine();
        return Double.parseDouble(line);
    }
    
    static void printFunctionTable(double[][] matrix, String functionName) {
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.printf("| %S[%3.1f]=%-7.2f |", functionName, matrix[0][i], matrix[1][i]);
            if ((i + 1) % 6 == 0 || i == matrix[0].length - 1) {
                System.out.println();
            }
        }
    }
}
