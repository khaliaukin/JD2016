package by.it.luksha.jd01_01;

public class HelloWorld {

    public static void main(String[] args) {
        MyFirstClass myFirstClass = new MyFirstClass();
        myFirstClass.printSlogan();
        myFirstClass.setSlogan("Hello, World!");
        myFirstClass.printSlogan();
        myFirstClass.setSlogan("Privet, Mir!");
        myFirstClass.printSlogan();

        new PrintArgs().showArgs(args);
    }
}
