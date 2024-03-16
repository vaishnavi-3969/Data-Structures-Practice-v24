package Advanced_Java_Programming_LL.IOStream;

public class Person {
    private String name;
    private int age;
    private long phoneNumber;

    public Person(String name, int age, long phoneNumber){
        this.age = age;
        this.name = name;
        this.phoneNumber = phoneNumber;
        System.out.println("Person Created. Name: "+name+", Age: "+age+"Phone no.: "+phoneNumber);
    }
}
