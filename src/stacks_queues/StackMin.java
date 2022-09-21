// Design a stack which, in addition to push and pop, has a function min which returns the minimum element? Push, pop and min should all operate in O(1).

package stacks_queues;

public class StackMin {

    public static void main(String[] args) {
        StackMin newStack  = new StackMin();
        newStack.push(5);
        newStack.push(4);
        newStack.push(8);
        newStack.pop();
        newStack.pop();
        System.out.println(newStack.min());
    }

    Node top;
    Node min;

    public StackMin() {
        top = null;
        min = null;
    }

    public int min() {
        return min.value;
    }

    public void push(int value) {
        if (min == null) {
            min = new Node(min, value);
        } else if (min.value < value) {
            min = new Node(min, min.value);
        } else {
            min = new Node(min, value);
        }
        top = new Node(top, value);

    }

    public int pop() {
        min = min.next;
        int result = top.value;
        top = top.next;
        return result;

    }

}
