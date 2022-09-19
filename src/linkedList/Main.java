package linkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertNode(1);
        ll.insertNode(2);
        ll.insertNode(1);
        ll.insertNode(4);
        ll.insertNode(5);
        ll.insertNode(1);
        ll.insertNode(7);
        ll.insertNode(1);
        ll.traversalLL();
        ll.removeDuplicates();
        ll.traversalLL();
        
    }

}
