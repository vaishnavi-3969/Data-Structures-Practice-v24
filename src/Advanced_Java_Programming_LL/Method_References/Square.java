package Advanced_Java_Programming_LL.Method_References;

public class Square {
    int sideLength;
    public Square(int sideLength){
        this.sideLength = sideLength;
    }
    public int calculateArea(){
        return (int)Math.pow(sideLength, 2);
    }
}
