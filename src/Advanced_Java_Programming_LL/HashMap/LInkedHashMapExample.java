package Advanced_Java_Programming_LL.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LInkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> phoneBook = new LinkedHashMap<>(4, 0.75f, true);
        //true => entry that was modified the longest time ago is at the top
        phoneBook.put("Kevin", 123);
        phoneBook.put("Jill", 2434);
        phoneBook.put("Brenda", 34332);
        phoneBook.put(null, 3333);
        System.out.println(phoneBook);
        if(phoneBook.containsKey("Brenda")){
            phoneBook.remove("Brenda");
        }
        System.out.println(phoneBook);
//        phoneBook.clear();
//        System.out.println(phoneBook);
        System.out.println("List of contacts in phonebook");

        for(Map.Entry<String, Integer> entry: phoneBook.entrySet()){
            System.out.println(entry.getKey() + ": "+entry.getValue());
        }
    }
}
