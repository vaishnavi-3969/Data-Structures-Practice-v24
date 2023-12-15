package Basics.Exception_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionHandling {
    public static void main(String[] args) {
        File file = new File("D:/DSA-JAVA/Data Structures x.0 Practice/src/files/numbers.txt");
        Scanner fileReader = null;
        try{
             fileReader = new Scanner(file);
            while (fileReader.hasNext()){
                System.out.println(fileReader.nextDouble());
            }
        } catch (InputMismatchException| FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            fileReader.close();
        }

    }
}
