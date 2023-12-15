package Basics.Exception_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        File inputFile = new File("D:/DSA-JAVA/Data Structures x.0 Practice/src/files/numbers.txt");
        File outputFile = new File("D:/DSA-JAVA/Data Structures x.0 Practice/src/files/output.txt");
        try(Scanner fileReader= new Scanner(inputFile);
            PrintWriter fileWriter = new PrintWriter(outputFile)
        ){
            while (fileReader.hasNext()){
                fileWriter.print(fileReader.nextDouble());
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
