package Basics.instanceOf_Operator;
public class Zoo {
    public static void main(String[] args) {
        Animal animal;
        animal = new Animal();
        animal.makeSound();

        animal = new Dog();
        animal.makeSound();
        ((Dog)animal).fetch();
        Animal dog = new Dog();
        feed(dog);

        animal = new Cat();
        animal.makeSound();
        ((Cat)animal).scratch();
        Animal cat = new Cat();
        feed(cat);
    }
    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Here's your dog food.");
        }else if(animal instanceof Cat){
            System.out.println("Here's your cat food.");
        }
    }
}

