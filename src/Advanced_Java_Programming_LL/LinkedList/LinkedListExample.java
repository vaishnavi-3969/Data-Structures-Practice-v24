package Advanced_Java_Programming_LL.LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String > myList = new LinkedList<>();
        myList.add("A");
        myList.add("B");
        myList.add(1,"C");
        System.out.println(myList);
        myList.remove();
        System.out.println(myList);
    }
}
