package Basics.Inheritance;

public class Employee extends Person{
    Employee(){
        super();
        System.out.println("Default constructor of Employee");
    }
    int id;
    Employee(String name, String mobile, String email, String address, int id) {
        super(name, mobile, email, address);
        this.id = id;
    }
}
