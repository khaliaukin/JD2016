package by.it.kust.jd01_05;
import static java.lang.Math.*;

public class Task4 {
  public static double calculate(){
      double m = 1;
      for (double b = 0; b <= 2; b += 0.2){
          for (int c = 2; c <= 8; c++){
              double f = pow(E, c) - 2.11 * b;
              m = m * f;
          }
      }
      return m;
  }
}