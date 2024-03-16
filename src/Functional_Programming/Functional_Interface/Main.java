package Functional_Programming.Functional_Interface;

import java.util.Random;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new HelloGreeting();

        greeting.sayHello();

        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hey...");
            }
        };
        greeting1.sayHello();


        Greeting greeting2 = () ->{
            System.out.println("Greeting 2");
        };
        greeting2.sayHello();

        Calculator calculator = (int x, int y) -> {
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            return x * y + randomNumber;
        };
        System.out.println(calculator.calculate(1,2));

        IntBinaryOperator calc = (x,y) ->{
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            return x*y+randomNumber;
        };
        System.out.println(calc.applyAsInt(1,2));
    }
}
