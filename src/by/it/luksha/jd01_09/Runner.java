package by.it.luksha.jd01_09;

import by.it.luksha.jd01_09.io.Parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static  void main(String[] args) throws IOException {
        System.out.println("Калькулятор");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        Parser.parser(str);
    }
}
