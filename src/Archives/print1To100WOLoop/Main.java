package Archives.print1To100WOLoop;

public class Main {
    static void printNo(int n){
       if(n>0){
           printNo(n-1);
           System.out.print(n+" ");
       }
    }
    public static void main(String[] args) {
        printNo(100);
    }
}
