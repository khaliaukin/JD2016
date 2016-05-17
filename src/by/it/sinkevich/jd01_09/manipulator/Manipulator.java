package by.it.sinkevich.jd01_09.manipulator;

import by.it.sinkevich.jd01_09.operations.IAriphmeticOperation;
import by.it.sinkevich.jd01_09.variables.MathLabFloat;
import by.it.sinkevich.jd01_09.variables.MathLabMatrix;
import by.it.sinkevich.jd01_09.variables.MathLabVariable;
import by.it.sinkevich.jd01_09.variables.MathLabVector;

/**
 * Created by Computer on 17.05.2016.
 *
 * @author Sinkevich Denis
 */
public class Manipulator implements IAriphmeticOperation {
    @Override
    public MathLabVariable addition(MathLabVariable first, MathLabVariable second) {
        return chooseAdditionMethod(first, second);
    }

    @Override
    public MathLabVariable substraction(MathLabVariable first, MathLabVariable second) {
        return null;
    }

    @Override
    public MathLabVariable multiplication(MathLabVariable first, MathLabVariable second) {
        return null;
    }

    @Override
    public MathLabVariable division(MathLabVariable first, MathLabVariable second) {
        return null;
    }

    private MathLabVariable chooseAdditionMethod(MathLabVariable first, MathLabVariable second) {
        if (first instanceof MathLabFloat) {
            if (second instanceof MathLabFloat) {
                return addition((MathLabFloat) first, (MathLabFloat) second);
            } else if (second instanceof MathLabVector) {
                return addition((MathLabFloat) first, (MathLabVector) second);
            } else {
                return addition((MathLabFloat) first, (MathLabMatrix) second);
            }
        } else if (first instanceof MathLabVector) {
            if (second instanceof MathLabFloat) {
                return addition((MathLabFloat) second, (MathLabVector) first);
            } else if (second instanceof MathLabVector) {
                return addition((MathLabVector) first, (MathLabVector) second);
            } else {
                return addition((MathLabVector) first, (MathLabMatrix) second); //УЗНАТЬ ЕСТЬ ЛИ ТАКАЯ ОПЕРАЦИЯ
            }
        } else if (first instanceof MathLabMatrix) {
            if (second instanceof MathLabFloat) {
                return addition((MathLabFloat) second, (MathLabMatrix) first);
            } else if (second instanceof MathLabVector) {
                return addition((MathLabVector) second, (MathLabMatrix) first); //УЗНАТЬ ЕСТЬ ЛИ ТАКАЯ ОПЕРАЦИЯ
            } else if (second instanceof MathLabMatrix) {
                return addition((MathLabMatrix) first, (MathLabMatrix) second);
            }
        }
        return null; //Что вернуть
    }

    private MathLabFloat addition(MathLabFloat aFloat1, MathLabFloat aFloat2) {
        MathLabFloat result = new MathLabFloat();
        result.setValue(aFloat1.getValue() + aFloat2.getValue());
        return result;
    }

    private MathLabVector addition(MathLabFloat aFloat, MathLabVector vector) {
        System.out.println("Сложение числа и вектора");
        return new MathLabVector();
    }

    private MathLabMatrix addition(MathLabFloat aFloat, MathLabMatrix matrix) {
        System.out.println("Сложение числа и матрицы");
        return new MathLabMatrix();
    }

    private MathLabVector addition(MathLabVector vector1, MathLabVector vector2) {
        System.out.println("Сложение векторов");
        return new MathLabVector();
    }

    private MathLabFloat addition(MathLabVector vector, MathLabMatrix matrix) {
        System.out.println("Сложение вектора и матрицы??? Шта???");
        return null;
    }

    private MathLabMatrix addition(MathLabMatrix matrix1, MathLabMatrix matrix2) {
        System.out.println("Сложение матриц");
        return new MathLabMatrix();
    }
}
