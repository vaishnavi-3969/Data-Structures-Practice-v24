package Collection_Framework;

import java.util.HashSet;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args) {
        setDemo();
    }
    public static void setDemo(){
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Lemon");
        System.out.println(fruits);
        System.out.println(fruits.contains("Lemon"));
        fruits.remove("Lemon");
        System.out.println(fruits.contains("Lemon"));
        System.out.println(fruits.size());
        Set<String> moreFruits = Set.of("Pear", "Raisin", "Cherry");
        System.out.println(moreFruits);
    }
}
