package Basics.ObjectAndEncapsulation;

import java.util.Scanner;

public class Rectangle {
    private static int area, perimeter;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        setArea(length, breadth);
        setPerimeter(length, breadth);
        System.out.println("Area: "+getArea());
        System.out.println("Perimeter: "+getPerimeter());
        scanner.close();
    }
    private static void setArea(int length, int breadth){
        area = length * breadth;
    }
    private static void setPerimeter(int length, int breadth){
        perimeter = 2 * (length + breadth);
    }
    private static int getArea(){
        return area;
    }
    private static int getPerimeter(){
        return perimeter;
    }
}
