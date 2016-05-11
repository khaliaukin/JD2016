package by.it.makevich.jd01_05;
import java.util.Scanner;

import static java.lang.Math.*;
public class Task2 {
public static double calculate (double x, double f){
Double y=(sin(pow(PI/8-f,2))+pow(3+pow(x,2),1/4))/2;
	return y;
}
	public static double[] in(){
		Scanner scan= new Scanner(System.in);
		System.out.print("x=");
		double numberX=scan.nextInt();
		System.out.print("f=");
		double numberF=scan.nextInt();
	double[]numbers=new double[2];
		numbers[0]=numberX;
		numbers[1]=numberF;
		return numbers;

	}
}
