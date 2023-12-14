package Basics.Inheritance;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Vaishnavi", "1234567890","vaishnavi.kale3011@gmail.com", "Pune", 1 );
        System.out.println(employee.email);
        Person person = new Person("Vaishnavi", "1234567890", "v@gmail.com", "Pune");
        System.out.println(person.email);
        Person person1 = new Employee("Vaishnavi", "343434343242", "vaish@gmail.com", "Pune", 1);
        System.out.println(person1.name);
        Employee emp = new Employee();
        Person per = new Person();
    }
}
