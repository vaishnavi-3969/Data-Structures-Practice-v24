package Advanced_Java_Programming_LL.WorkingWithFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FileCopyExample {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("src/Advanced_Java_Programming_LL/WorkingWithFiles/text.txt");
        Path dest = Paths.get("src/Advanced_Java_Programming_LL/WorkingWithFiles/new.txt");
        Files.copy(source, dest, REPLACE_EXISTING);

    }
}
