package Strings.Jumbled_String;

import java.util.Scanner;
/*
WRite a method that adds spaces to
a jumbled string where all words
were written together with no
spaces. Each new word begins with
a capital letter
* */
public class JumbledString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<string.length(); i++){
            if(string.charAt(i)-'A'<26){
                sb.append(" ");
            }
            sb.append(string.charAt(i));
        }
        System.out.println("String is: "+sb.toString().strip());
    }
}
