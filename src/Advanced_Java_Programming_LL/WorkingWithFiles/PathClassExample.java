package Advanced_Java_Programming_LL.WorkingWithFiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClassExample {
    public static void main(String[] args) {
        Path path = Paths.get("src/Advanced_Java_Programming_LL/WorkingWithFiles/Hello World.txt");
        try{
            Files.deleteIfExists(path);
        }catch (Exception e){
            System.out.println(e);
        }
        Path path2 = Paths.get("src/Advanced_Java_Programming_LL/WorkingWithFiles/example.txt");
        System.out.println(path2.getParent());
        System.out.println(path2.getRoot());
        System.out.println(path2.getFileName());
    }
}
