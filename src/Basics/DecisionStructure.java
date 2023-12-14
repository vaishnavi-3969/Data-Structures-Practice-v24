package Basics;

import java.util.Scanner;

public class DecisionStructure {
    public static void main(String[] args) {
        double salary = 1000;
        double bonus = 200;
        int quota = 10;
        System.out.println("How many sales did teh employee get this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        if(sales > quota){
            salary = salary + bonus;
        }
        System.out.println("Salary: "+salary);
    }
}
