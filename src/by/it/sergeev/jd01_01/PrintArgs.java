package by.it.sergeev.jd01_01;

/**
 * Created by Дмитрий on 26.04.2016.
 */
public class PrintArgs {
    public void showArgs(String[] args)
    {
        for (String str : args)
            System.out.printf("%s%n", str);
    }
}
