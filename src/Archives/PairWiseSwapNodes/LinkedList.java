package Archives.PairWiseSwapNodes;

public class LinkedList {
    static Node head = null;

    static void addNode(Node node){
        if(head==null){
            head = node;
            return;
        }
        Node ptr = head;
        while(node.next!=null){
            ptr = ptr.next;
        }
        ptr.next = node;
    }

    static void createLinkedList(int[] arr){
        Node ptr = head;
        for (int j : arr) {
            if (ptr == null) {
                head = new Node(j);
                ptr = head;
            } else {
                ptr.next = new Node(j);
                ptr = ptr.next;
            }
        }
    }
    public static void swapNodeInPairs(){
        Node ptr1 = head;
        Node ptr2 = head.next;
        if(ptr2 == null){
            return;
        }
        do{
            int temp = ptr1.data;
            ptr1.data = ptr2.data;
            ptr2.data = temp;

            ptr1 = ptr1.next.next;
            ptr2 = ptr1.next;
        }while(ptr1.next!=null);
    }
    public static void print(){
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
        swapNodeInPairs();
        print();
    }
}
