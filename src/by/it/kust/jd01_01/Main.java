package by.it.kust.jd01_01;
//подкдючение класса не требуется, т.к. класс main и класс NyFirstClass находятся в одной папке.
public class Main {
    public static void main(String[] args) {
        //создаем экземпляр класса
        MyFirstClass myFirstClass = new MyFirstClass();
        //и используем два экземплярных метода
        myFirstClass.setSlogan("Hello, world!");
        myFirstClass.printSlogan();
        myFirstClass.setSlogan("Привет, мир!");
        myFirstClass.printSlogan();
        //покажем аргументы
        new PrintArgs().showArgs(args);
    }
}