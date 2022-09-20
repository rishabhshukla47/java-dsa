package linkedList;

public class Intersection {

    public static void main(String[] args) {
        Intersection obj = new Intersection();
        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();
        ll1.insertNode(3);
        ll1.insertNode(1);
        ll1.insertNode(5);
        ll1.insertNode(9);
        ll2.insertNode(2);
        ll2.insertNode(4);
        ll2.insertNode(6);
        obj.addSameNode(ll1, ll2, 7);
        obj.addSameNode(ll1, ll2, 2);
        obj.addSameNode(ll1, ll2, 1);


        System.out.println(obj.intersection(ll1, ll2).value);
    }
    
    void addSameNode(LinkedList llA, LinkedList llB, int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        llA.tail.next = newNode;
        llA.tail = newNode;
        llB.tail.next = newNode;
        llB.tail = newNode;
        llA.size++;
        llB.size++;
      }

    public Node intersection(LinkedList ll1, LinkedList ll2){

        Node tempNode1 = new Node();
        Node tempNode2 = new Node();

        tempNode1 = ll1.head;
        tempNode2 = ll2.head;

        for(int i = 0; i < ll1.size; i ++){
            for(int j = 0; j < ll2.size; j++){
                if(tempNode1 == tempNode2){
                    return tempNode1;
                }
                System.out.println(j);
                System.out.println(ll2.size);
                if(j != ll2.size -1){
                    tempNode2 = tempNode2.next;
                }
                
           }
           if(i != ll1.size -1)
                tempNode1 = tempNode1.next;
        }
        return null;

    }  

}
