package by.it.starotitorov.jd01_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Vasiliy Starotitorov on 04.05.2016.
 */
public class TaskB_3 {


    //Вычисление корней квадратного уравнения
    public static void main (String[] args) throws IOException
    {
        double a, b, c, x1 = 0, x2 = 0;// х1 и х2 - это корни уравнения

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите переменные квадратного уравнения:");

        System.out.print("a= ");

        a = Double.parseDouble(br.readLine());
        System.out.print("b= ");
        b = Double.parseDouble(br.readLine());
        System.out.print("c= ");
        c = Double.parseDouble(br.readLine());

        double D =b*b - 4* a * c;//вычисляем дискриминант
        if (D>0){
            x1 =(-b - Math.sqrt(D))/2*a;
            x2 =(-b+Math.sqrt(D))/2*a;
            System.out.println("X1 = " + x1+" " + "X2 = " + x2);//если дискриминант полож. то ур-е
            //имеет два корня
        }
        if (D==0){
            x1 = -b/(2*a);
            System.out.println("X0 = "+x1+ " " + "D = 0");//если равен нулю - то корни равны
        }
        if (D<0){
            System.out.println("действительных корней нет!!" +" "+"D<0");//если отрицательный -
            //ур-е не имеет действительных корней
        }

        System.out.println("еще?" );
    }
}
