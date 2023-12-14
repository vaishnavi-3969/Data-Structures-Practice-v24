package Basics.Instantiating_Objects;

import java.util.Scanner;

/*
Write a class that creates
instances of Rectangle to find the
total area of 2 rooms in a house
* */
public class Rectangle {
    int length, width, area, perimeter;
    Rectangle(){
        this.length = 0;
        this.width = 0;
    }
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    void calcArea(){
        this.area = this.length * this.width;
    }
    void calcPerimeter(){
        this.perimeter = 2 *(this.length + this.width);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and width of the first room: ");
        int room1L = sc.nextInt();
        int room1W = sc.nextInt();
        Rectangle room1 = new Rectangle(room1L, room1W);
        room1.calcArea();
        room1.calcPerimeter();
        System.out.println("Enter the length and width of the second room: ");
        int room2L = sc.nextInt();
        int room2W = sc.nextInt();
        Rectangle room2 = new Rectangle(room2L, room2W);
        room2.calcArea();
        room2.calcPerimeter();
        int totalArea = room1.area + room2.area;
        System.out.println("Total area of both rooms: "+totalArea);
        int totalPerimeter = room1.perimeter + room2.perimeter;
        System.out.println("Total perimeter of both room: "+totalPerimeter);
    }
}
