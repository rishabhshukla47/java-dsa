
package linkedList;

import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        RemoveDuplicates obj = new RemoveDuplicates();
        LinkedList ll = new LinkedList();
        ll.insertNode(1);
        ll.insertNode(2);
        ll.insertNode(4);
        ll.insertNode(3);
        ll.insertNode(4);
        ll.insertNode(4);
        ll.insertNode(3);
        ll.insertNode(3);
        ll.insertNode(5);
        ll.insertNode(3);
        obj.deleteDups(ll);
    }

    public void deleteDups(LinkedList ll) {
        LinkedList newLL = new LinkedList();
        HashSet<Integer> hs = new HashSet<Integer>();

        Node tempNode = new Node();
        tempNode = ll.head;
        ll.traversalLL();
        for (int i = 0; i < ll.size; i++) {
            if (hs.contains(tempNode.value)) {
            } else {
                hs.add(tempNode.value);
                newLL.insertNode(tempNode.value);
            }
            tempNode = tempNode.next;
        }
        ll = newLL;
        ll.traversalLL();

    }

}
