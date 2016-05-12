package by.it.sergeev.jd01_01;

public class PrintArgs {
    public void showArgs(String[] args)
    {
        for (String str : args)
            System.out.printf("%s%n", str);
    }
}
