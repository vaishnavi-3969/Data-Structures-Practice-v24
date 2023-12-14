package Strings.Word_Count;

/*
* Write a method that counts the
* no. of words in a string and prints
* them individually on new lines
* */

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        sentence = sentence.strip();
        String[] words = sentence.split(" ");
        String message = String.format("Your string %d contains",words.length);
        System.out.println(message);
        for(String w: words){
            System.out.println(w);
        }
        scanner.close();
    }
}
