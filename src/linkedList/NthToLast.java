package linkedList;

public class NthToLast {

    public static void main(String[] args) {
        NthToLast obj = new NthToLast();
        LinkedList ll = new LinkedList();
        ll.insertNode(1);
        ll.insertNode(4);
        ll.insertNode(3);
        ll.insertNode(5);
        obj.nthToLast(ll, 1);
        
    }
    
    public void nthToLast(LinkedList ll, int n){
        if(n > ll.size){
            System.out.println("Element does not exist");
            return;
        } else if( ll.size - n == 0){
            System.out.println(ll.head.value);
            return;
        } 

        Node tempNode = new Node();
        tempNode = ll.head;
        for(int i = 0; i < ll.size - n; i++){
            tempNode = tempNode.next;
        }
        System.out.println(tempNode.value);

    }

}
