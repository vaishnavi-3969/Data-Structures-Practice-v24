package Basics.Exception_Handling;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        File file = new File("resources/nonexistent.txt");
        try{
            file.createNewFile();
        }catch (IOException e){
//            e.printStackTrace();
            System.out.println("IOException occured"+e.getMessage());
        }
    }
}
