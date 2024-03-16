package Advanced_Java_Programming_LL.HashMap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Kevin", 123);
        phoneBook.put("Jill", 2434);
        phoneBook.put("Brenda", 34332);
        phoneBook.put(null, 3333);
        System.out.println(phoneBook);
        if(phoneBook.containsKey("Brenda")){
            phoneBook.remove("Brenda");
        }
        System.out.println(phoneBook);
        phoneBook.clear();
        System.out.println(phoneBook);
    }
}
