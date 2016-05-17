package by.it.sinkevich.jd01_09;

import by.it.sinkevich.jd01_09.manipulator.Manipulator;
import by.it.sinkevich.jd01_09.variables.MathLabFloat;
import by.it.sinkevich.jd01_09.variables.MathLabMatrix;
import by.it.sinkevich.jd01_09.variables.MathLabVariable;
import by.it.sinkevich.jd01_09.variables.MathLabVector;

/**
 * @author Sinkevich Denis
 */
public class ConsoleRunner {

    public static void main(String[] args) {
        MathLabVariable floatVar1 = new MathLabFloat(3.34);
        MathLabVariable floatVar2 = new MathLabFloat(6.66);
        MathLabVariable matrix = new MathLabMatrix();
        MathLabVariable vector = new MathLabVector();
        MathLabVariable result;
        Manipulator manipulator = new Manipulator();
        result = manipulator.addition(floatVar1, floatVar2);
        System.out.println(result);
        result = manipulator.addition(floatVar1, matrix);
        System.out.println(result);
        System.out.println(manipulator.addition(matrix, floatVar2));
        System.out.println(manipulator.addition(vector, floatVar2));
    }
}
