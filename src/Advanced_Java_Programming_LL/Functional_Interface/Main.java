package Advanced_Java_Programming_LL.Functional_Interface;

public class Main {
    public static void main(String[] args) {
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello: "+name);
            }
        };
        gm.greet("Vaishnavi");
        GreetingMessage gm2 = (name) -> {
            System.out.println("Hello: "+name);
        };
        gm2.greet("Vaishnavi");
        MessagePrinter mp = () ->{
            System.out.println("This is a message");
        };
        mp.printMessage();
    }
}
