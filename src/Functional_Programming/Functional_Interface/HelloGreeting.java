package Functional_Programming.Functional_Interface;

public class HelloGreeting implements Greeting{

    @Override
    public void sayHello() {
        System.out.println("Hello World");
    }
}
