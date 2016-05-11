package by.it.makevich.jd01_05;
import static java.lang.Math.*;

public class Task1 {
	public static double optionA(double a, double b){
		double nA = pow(cos(PI/4-1)/sin(PI/4-1),4);
		double nB = pow(a+1.5,1/3);
		double nC = pow(a-b, 8);
		double nD = b/asin(pow(abs(a), 2));
		double y = nA+nB+nC-nD;
		return y;
	}
	public static double optionB (double a, double b){
		double y=pow(cos(PI/4-1)/sin(PI/4-1),4)+pow(a+1.5,1/3)+pow(a-b, 8)-b/asin(pow(abs(a), 2));
		return y;
	}

}
