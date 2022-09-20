package linkedList;

public class Partition {

    public static void main(String[] args) {
        Partition obj = new Partition();
        LinkedList ll = new LinkedList();
        ll.insertNode(3);
        ll.insertNode(8);
        ll.insertNode(5);
        ll.insertNode(10);
        ll.insertNode(2);
        ll.insertNode(1);

        obj.partition(ll, 5);
    }

    public void partition(LinkedList ll, int x) {

        Node tempNode = new Node();
        tempNode = ll.head;

        for (int i = 0; i < ll.size - 1; i++) {
            if (tempNode.value == x) {
                ll.insertNode(tempNode.value);
                ll.deleteNodeLL(i);
                break;
            }
            tempNode = tempNode.next;
        }
        tempNode = ll.head;
        int i = 0;
        while (tempNode.next != ll.tail) {
            if (tempNode.value > x) {
                ll.insertNode(tempNode.value);
                tempNode = tempNode.next;
                ll.deleteNodeLL(i);
            } else {
                i++;
                tempNode = tempNode.next;
            }

        }

        ll.traversalLL();

    }

}
