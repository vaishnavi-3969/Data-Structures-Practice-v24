package Basics.Exception_Handling;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowAnException {
    public static void main(String[] args) {

    }
    public static void reThrowException() throws IOException {
        File file = new File("D:/DSA-JAVA/Data Structures x.0 Practice/src/files/nonexistent.txt");
        file.createNewFile();
    }
    public static void reThrowMultipleException()
            throws IOException, InputMismatchException {
        File file = new File("D:/DSA-JAVA/Data Structures x.0 Practice/src/files/nonexistent.txt");
        file.createNewFile();
    }
    //polymorphic throw statement
    public static void reThrowExceptions() throws Exception {
        File file = new File("D:/DSA-JAVA/Data Structures x.0 Practice/src/files/nonexistent.txt");
        file.createNewFile();
        Scanner fileReader = new Scanner(file);

    }

    public static double calculatePay(double hours, double payRate)
            throws NegativeInputException{
        if(hours > 40){
            throw new IllegalArgumentException("Hours must be <=40");
        }else if(hours<0 || payRate <0){
            throw new NegativeInputException();
        }
        return hours*payRate;
    }
}

