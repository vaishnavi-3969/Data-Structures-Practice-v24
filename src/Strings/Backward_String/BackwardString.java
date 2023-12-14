package Strings.Backward_String;
/*
WRite a method that prints a given string
backward
eg. 'pots', it prints 'stops'
* */

import java.util.Scanner;

public class BackwardString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = sc.nextLine();
        System.out.printf("Backward string of %s is: ",word);
        for(int i=word.length()-1; i>=0; i--){
            System.out.print(word.charAt(i));
        }
        sc.close();
    }
}
