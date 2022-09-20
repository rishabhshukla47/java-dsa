//You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order, such that the 1's digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list.

package linkedList;

public class SumLists {

    public static void main(String[] args) {

        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();
        ll1.insertNode(7);
        ll1.insertNode(1);
        ll1.insertNode(6);

        ll2.insertNode(5);
        ll2.insertNode(9);
        ll2.insertNode(2);

        SumLists obj = new SumLists();
        obj.sumLists(ll1, ll2);
    }
    
    public void sumLists(LinkedList ll1, LinkedList ll2){

        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        LinkedList ll = new LinkedList();
        Node tempNode = new Node();
        tempNode = ll1.head;
        for(int i = 0; i<ll1.size; i++){
            num1 += tempNode.value * exp(10, i);
            if(i == ll1.size-1){
                break;
            }
            tempNode = tempNode.next;
        }
        tempNode = ll2.head;
        for(int i = 0; i<ll2.size; i++){
            num2 += tempNode.value * exp(10, i);
            if(i == ll2.size-1){
                break;
            }
            tempNode = tempNode.next;
        }
        sum = num1 + num2;
        while(sum != 0){
            ll.insertNode(sum%10);
            sum/=10;
        }
        ll.traversalLL();

    }

    public int exp(int num, int power){
        if(power == 0){
            return 1;
        }
        int value = num;
        for(int i = 1; i < power; i++){

            value *= num;
        }
        return value;

    }

}
