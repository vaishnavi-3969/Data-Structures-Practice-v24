package Basics.Polymorphism;
/*
Transforming Animals:
Demonstrate an e.g. of polymorphism
b/w an animal, dog and cat
*/
public class Zoo {
    public static void main(String[] args) {
        Animal animal;
        animal = new Animal();
        animal.makeSound();

        animal = new Dog();
        animal.makeSound();
        ((Dog)animal).fetch();

        animal = new Cat();
        animal.makeSound();
        ((Cat)animal).scratch();
        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Dog);
    }
}
class Animal {
    void makeSound(){
        System.out.println("Unknown animal sound...");
    }
}

class Dog extends Animal {
    void makeSound(){
        System.out.println("bow bow...");
    }
    void fetch(){
        System.out.println("Fetch is fun..");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("meow meow...");
    }
    void scratch(){
        System.out.println("I'm a cat. I scratch..");
    }
}