package Advanced_Java_Programming_LL.Method_References;

public class Main {
    public static void main(String[] args) {
        Square s = new Square(4);
//        Shapes shapes = (Square square) ->{
//            return square.calculateArea();
//        };
        Square s1 = new Square(3);
        Shapes shapes = Square::calculateArea;
        System.out.println("Area: "+shapes.getArea(s));
        System.out.println("Area: "+shapes.getArea(s1));
    }
}
