package by.it.makevich.jd01_05;

import static java.lang.Math.*;

public class Task5 {
public static void calculate(){
	double x;
	for (double p = -1.0; p < 11.0; p += 3.0){

		if (1.5*p < 1.5){
			x = pow(acos(p),2);
		} else if (1.5*p >= 1.5 && 1.5*p < 3){
			x = pow(2.718,p)+3.5;
		} else if (1.5*p > 3){
			x = p+4.76;
		} else{
			continue;
		}
		double y = 0.491*pow(10,4)+1.39*x;
		System.out.println(String.format("%1s%25s", p, y));
	}
}
}
