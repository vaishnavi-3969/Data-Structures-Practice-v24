package Archives.MiddleElementOfLinkedList;

public class LinkedList {
    static Node head = null;
    static void createLinkedList(int[] arr){
        if(arr.length==0){
            return;
        }
        head = new Node(arr[0]);
        Node ptr = head;
        for(int i=1; i<arr.length; i++){
            ptr.next = new Node(arr[i]);
            ptr = ptr.next;
        }
    }

    public static Node middleElement(){
        Node ptr1 = head;
        Node ptr2 = head;
        while(ptr2.next!=null){
            ptr1 = ptr1.next;
            ptr2 = ptr1.next.next;
        }
        return ptr1;
    }
    static void print(){
        Node ptr = head;
        while(ptr!=null){
            System.out.print(ptr.data+"->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        createLinkedList(arr);
        print();
        Node middleElement = middleElement();
        System.out.println("Middle element: "+middleElement.data);
    }
}
