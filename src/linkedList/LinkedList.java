package linkedList;

public class LinkedList {

    public Node head;
    public Node tail;
    public int size;

    public void createLL(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void insertNode(int nodeValue) {
        if (size == 0) {
            createLL(nodeValue);
            return;
        } else {
            Node newNode = new Node();
            newNode.value = nodeValue;
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
            size++;
        }

    }

    public void traversalLL() {
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if (i != size - 1) {
                System.out.print("->");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }

    public void deleteNodeLL(int location) {
        if (head != null) {
            if (size == 1) {
                head = null;
                tail = null;
                size = 0;
                return;
            } else if (location == 0) {
                head = head.next;
            } else if (location >= size - 1) {
                Node tempNode = new Node();
                tempNode = head;
                for (int i = 0; i < location - 1; i++) {
                    tempNode = tempNode.next;
                }
                tempNode.next = null;
                tail = tempNode;
            } else {
                Node tempNode = new Node();
                tempNode = head;
                for (int i = 0; i < location - 1; i++) {
                    tempNode = tempNode.next;
                }
                tempNode.next = tempNode.next.next;
            }
            size--;
            return;

        }

    }

    public void removeDuplicates() {

        if (size == 1) {
            return;
        } else {
            Node tempNode1 = new Node();
            Node tempNode2 = new Node();
            tempNode1 = head;
            tempNode2 = tempNode1.next;
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (tempNode1.value == tempNode2.value) {
                        if (j != size - 1) {
                            tempNode2 = tempNode2.next;
                        }
                        this.deleteNodeLL(j);
                    }
                    if (j != size - 1) {
                        tempNode2 = tempNode2.next;
                    }
                }
                tempNode1 = tempNode1.next;
                tempNode2 = tempNode1.next;
            }
        }

    }

}
