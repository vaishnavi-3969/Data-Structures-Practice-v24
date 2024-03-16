package Advanced_Java_Programming_LL.GenericExample;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Kelly");
        String name = names.get(0);
        System.out.println("First name: "+name);
    }
}
