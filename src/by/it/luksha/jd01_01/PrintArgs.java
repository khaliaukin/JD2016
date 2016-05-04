package by.it.luksha.jd01_01;


public class PrintArgs {
    public void showArgs(String[] args){
        for (String str: args)
            System.out.printf("Argument => %s%n", str);
    }
}
