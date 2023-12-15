package Streams;

import java.util.Arrays;

public class Streams {
    public static void main(String[] args) {
        int[] numbers = {1,3,4,5,6,7,7,8};
        Arrays.stream(numbers).forEach(n -> System.out.println(n + 1 + " "));
    }
}
