package Basics.Inheritance;

public class Person {
    String name, mobile, email, address;
    Person(String name, String mobile, String email, String address){
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
    }

    public Person() {
        System.out.println("Default constructor of Person");
    }
}
