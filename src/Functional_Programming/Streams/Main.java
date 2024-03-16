package Functional_Programming.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] scores = new Integer[]{88,66,73,92,43};

        Stream<Integer> scoresStream = Arrays.stream(scores);


        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");

        Stream<String> shoppingListStream = shoppingList.stream();
        shoppingListStream
                .sorted()
                .map(item -> item.toUpperCase())
                .filter(item -> item.startsWith("B"))
                .forEach(System.out::println);

        Stream<String> lettersStream = Stream.of("a","b","c");

        System.out.println(shoppingList);

        System.out.println("Starts with P:");

        List<String> sortedShoppingList = shoppingList
                .stream()
                .map(item -> item.toUpperCase())
                .filter(item -> item.startsWith("P"))
                .collect(Collectors.toList());

        System.out.println(sortedShoppingList);
    }
}
