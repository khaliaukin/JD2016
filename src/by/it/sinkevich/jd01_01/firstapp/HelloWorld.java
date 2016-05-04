package by.it.sinkevich.jd01_01.firstapp;

public class HelloWorld {

    public static void main(String[] args) {
        MyFirstClass myFirstClass = new MyFirstClass();
        myFirstClass.setSlogan("Hello World!");
        myFirstClass.printSlogan();
        myFirstClass.setSlogan("Привет Мир!");
        myFirstClass.printSlogan();

        new PrintArgs().showArgs(args);
    }
}
