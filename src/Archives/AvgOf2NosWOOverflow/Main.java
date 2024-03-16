package Archives.AvgOf2NosWOOverflow;

public class Main {
    static int average(int a , int b){
        return (a + b)/2;
    }
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        System.out.println("Actual Avg: "+Integer.MAX_VALUE);
        System.out.println("Computed Avg: "+average(a, b));
    }
}
