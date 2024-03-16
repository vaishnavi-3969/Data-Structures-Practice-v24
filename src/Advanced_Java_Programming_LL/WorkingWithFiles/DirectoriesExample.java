package Advanced_Java_Programming_LL.WorkingWithFiles;

import java.io.File;
import java.io.FilenameFilter;

public class DirectoriesExample {
    public static void main(String[] args) {
//        FilenameFilter filter =(file, fileName) ->{
//            return fileName.contains("src/Advanced_Java_Programming_LL/WorkingWithFiles");
//        };
        String[] contents = new File("./src").list();
        for(String file: contents){
            System.out.println(file);
        }
        //make a new directory
        new File("src/Advanced_Java_Programming_LL/WorkingWithFiles/myDirectory").mkdir();

    }
}
