package Collection_Framework;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        setDemo();
//        listDemo();
//        queueDemo();
        mapDemo();
    }
    public static void mapDemo(){
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.putIfAbsent("orange", 45);
        System.out.println(fruitCalories);
        fruitCalories.remove("lemon");
        System.out.println(fruitCalories);
        fruitCalories.get("lemon");
        System.out.println(fruitCalories.containsKey("orange"));
        System.out.println(fruitCalories.containsValue(34));

        Map<String, Integer> otherFruits = Map.of(
                "apple", 95,
                "banana", 30,
                "pineapple", 50
        );
        System.out.println(otherFruits);
    }
    public static void queueDemo(){
        Queue<String> queue = new LinkedList<>();
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");
        queue.add("lemon");
        System.out.println(queue);
        var removed = queue.remove();
        System.out.println(queue);
        System.out.printf("Fruit removed: %s. ",removed);
        System.out.println(removed.getClass().getSimpleName());
        System.out.println(removed.getClass());
        System.out.println(queue.peek());
    }

    public static void listDemo(){
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        System.out.println(fruits);
        fruits.set(3,"pear");
        System.out.println(fruits);
        fruits.remove(2);
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.get(1));
        System.out.println(fruits.indexOf("apple"));
        List<String> moreFruits = List.of("Pear", "pineapple", "fig");
        System.out.println(moreFruits);
    }
    public static void setDemo(){
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Lemon");

        System.out.println("Looping using forEach: ");
        fruits.forEach((fruit) -> {
            System.out.println(fruit);
            }
        );

        System.out.println("Looping using iterator: ");
        var i = fruits.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("-----------");

        System.out.println(fruits);
        System.out.println(fruits.contains("Lemon"));
        fruits.remove("Lemon");
        System.out.println(fruits.contains("Lemon"));
        System.out.println(fruits.size());
        Set<String> moreFruits = Set.of("Pear", "Raisin", "Cherry");
        System.out.println(moreFruits);
    }
}
