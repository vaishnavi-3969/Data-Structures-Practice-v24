package Advanced_Java_Programming_LL.IOStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        File file = new File("src/Advanced_Java_Programming_LL/IOStream/example.txt");
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException e){
                System.out.println("Something went wrong"+e);
            }
        }else{
            try{
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line = "";
                while((line=br.readLine()) != null){
                    System.out.println(line);
                }
            }catch (IOException e){
                System.out.println("Something went wrong.."+e);
            }
        }

    }
}
