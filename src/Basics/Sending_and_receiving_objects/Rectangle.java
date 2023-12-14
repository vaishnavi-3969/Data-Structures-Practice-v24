package Basics.Sending_and_receiving_objects;
/*
Area of Rooms:
Redo HomeAreaCalc to include a
calculateArea() method that accepts
2 rectangles and a getRoom()
method that returns a rectangle
* */

import java.util.Scanner;

public class Rectangle {
    int length, width, area;
    Rectangle(){
        length = 0;
        width = 0;
        area = 0;
    }
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
        this.area = length * width;
    }
    Rectangle getRoom(Rectangle room1){
        Rectangle room = new Rectangle();
        room.length = room1.length + this.length;
        room.width = this.width + room1.width;
        room.area = room1.area + this.area;
        return room;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and width of the first room: ");
        int room1L = sc.nextInt();
        int room1W = sc.nextInt();
        Rectangle room1 = new Rectangle(room1L, room1W);
        System.out.println("Enter the length and width of the second room: ");
        int room2L = sc.nextInt();
        int room2W = sc.nextInt();
        Rectangle room2 = new Rectangle(room2L, room2W);
        Rectangle room = room1.getRoom(room2);
        System.out.println("Final area of the room: "+room.area);
    }
}
