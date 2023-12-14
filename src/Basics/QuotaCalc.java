package Basics;

import java.util.Scanner;

public class QuotaCalc {
    public static void main(String[] args) {
        int quota = 10;
        System.out.println("Enter the no. of sales made");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        scanner.close();
        if(sales>=quota){
            System.out.println("Congrats! You've met your quota");
        }else {
            int salesShort = quota - sales;
            System.out.println("You did not made your quota.");
            System.out.println("You were "+salesShort+" sales short.");
        }
    }
}
