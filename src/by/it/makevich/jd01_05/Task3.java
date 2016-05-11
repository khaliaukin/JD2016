package by.it.makevich.jd01_05;

import static java.lang.Math.*;


public class Task3 {
	public static void printTable(){
        double e=0.4;
		System.out.println("Задание 3:");
		System.out.println("┏━━━━━━━┳━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃ param ┃         value        ┃");
		System.out.println("┣━━━━━━━╋━━━━━━━━━━━━━━━━━━━━━━┫");
		for (double t = 2; t <= 3.01; t += 0.1){
			double s = log(abs(1.3+t))-pow(e,t);
			System.out.println(String.format("%-2s%-6.1f%-3s%-3.16f%3s", "┃", t, "┃", s, "┃"));
		}
		System.out.println("┗━━━━━━━┻━━━━━━━━━━━━━━━━━━━━━━┛");
	}
}
