package by.it.sergeev.jd01_01;

public class Main {

    public static void main(String[] args) {
        NewClass newclass = new NewClass();
        newclass.setSlogan("Hello World!");
        newclass.printSlogan();
        newclass.setSlogan("Привет мир!");
        newclass.printSlogan();

        new PrintArgs().showArgs(args);
    }
}
