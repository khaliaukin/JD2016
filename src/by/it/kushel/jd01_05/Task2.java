package by.it.kushel.jd01_05;

/**
 * Created by Diomn on 05.05.2016.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Math.*;

public class Task2 {

    public static double findOfY(double a, double b) {

        double y = 1 / (pow(tan(PI / 4 - 1), 4) + pow((a + 1.5), 1 / 3)) - b / asin(abs(a) * abs(a));
        return y;
    }

    //Scanner
    public static double findOfY() {
        while (true) {
            Scanner cs = new Scanner(System.in);
            double a = 0;
            double b = 0;
            try {
                System.out.print("Input a: ");
                if (cs.hasNext()) {
                    a = cs.nextDouble();//считываем число a
                }
                System.out.print("Input b: ");
                if (cs.hasNext()) {
                    b = cs.nextDouble();//считываем число b
                }
                double y = 1 / (pow(tan(PI / 4 - 1), 4) + pow((a + 1.5), 1 / 3)) - b / asin(abs(a) * abs(a));
                return y;
            } catch (Exception e) {
                System.out.println("Input correct numbers");
            }
        }
    }

    // BufferedReader
    public static String consoleReadLine() throws IOException {
        System.out.println("Input line of numbers a,b (0.3 -21.17 )");
        InputStreamReader iStreamReader = new InputStreamReader(System.in);
        BufferedReader line = new BufferedReader(iStreamReader);
        String out = line.readLine();

        //line.close();
        return out;
    }

    public static double findOfY(String line) {
        line = line.trim();
        double a = 0;
        double b = 0;
        double y = 0;
                String[] elemString = line.split(" ");
                a = Double.parseDouble(elemString[0]);
                b = Double.parseDouble(elemString[1]);
                y = 1 / (pow(tan(PI / 4 - 1), 4) + pow((a + 1.5), 1 / 3)) - b / asin(abs(a) * abs(a));
        return y;
    }
    public static double coordinator(){
        double y=0;

        while (true){

            try{
                y=findOfY(consoleReadLine());
                break;
            }
            catch (Exception e){
                System.out.println("Input correct line of numbers");
            }
        }
        return y;
    }
}
