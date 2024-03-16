package Information_Security_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class HillCipher {
    public static char[] encrypt(char[] row, int[][] key){
        char[] encryptedRow = new char[3];
        for(int i=0; i<3; i++){
            int sumOfMultiplication=0;
            for(int j=0; j<3; j++){
                sumOfMultiplication += ((row[j]-'A')*key[j][i]) % 26;
            }
            encryptedRow[i] = (char) ((sumOfMultiplication % 26) + 'A'); // Add 'A' to convert back to character range
        }
        return encryptedRow;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to encrypt using Hill Cipher: ");
//        String input = "PAY MORE MONEY";
        String input = scanner.nextLine().toUpperCase();
        int[][] key = {
                {17,17,5},
                {21,18,21},
                {2,2,19}
        };
        String newInput = input.replace(" ","");
//        System.out.println(newInput);
        ArrayList<String> al = new ArrayList<>();
        for(int i=0; i<newInput.length()-2; i+=3){
            al.add(newInput.substring(i,i+3));
        }
//        System.out.println(al);
        ArrayList<String> output = new ArrayList<>();
        for (String s : al) {
            char[] inp = s.toCharArray();
            output.add(String.valueOf(encrypt(inp, key)));
        }
        System.out.println(String.join("", output));
    }
}
