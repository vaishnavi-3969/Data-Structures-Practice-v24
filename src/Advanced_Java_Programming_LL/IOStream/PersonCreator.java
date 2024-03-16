package Advanced_Java_Programming_LL.IOStream;

import java.util.Scanner;

public class PersonCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name: ");
        String name = scanner.next();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("enter phone no.: ");
        long phoneNumber = scanner.nextLong();
        Person p = new Person(name, age, phoneNumber);

    }
}
