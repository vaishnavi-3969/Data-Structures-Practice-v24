package Basics.Abstraction.Shape;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(3,4);
        rectangle.print();
        System.out.println(rectangle.area());

    }
}
