package Basics.Overloading;

import java.util.Scanner;

/*
Overload
* */
class Rectangle{
    int length, breadth;
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void print(){
        System.out.println("This is a rectangle.");
    }
    int area(){
        return length * breadth;
    }
    int perimeter(){
        return 2 * (length + breadth);
    }
}
class Square extends Rectangle{
    int side;
    Square(int side) {
        super(side, side);
        this.side = side;
    }
    //overload
    void print(String what){
        System.out.println("I am "+what);
    }
    @Override
    int area(){
        return side * side;
    }
    @Override
    int perimeter(){
        return 4 * side;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the side of square: ");
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        Square square = new Square(side);
        System.out.println(square.area());
        System.out.println(square.perimeter());
        System.out.println("Enter the dimensions of a rectangle: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        Rectangle rectangle = new Rectangle(length, breadth);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        rectangle.print();
        square.print("Square");
        square.print();
    }
}
