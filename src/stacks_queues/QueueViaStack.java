package stacks_queues;

import java.util.Stack;

public class QueueViaStack {

    Stack<Integer> stackNewest;
    Stack<Integer> stackOldest;

    public static void main(String[] args) {
        QueueViaStack newQueue = new QueueViaStack();
        newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.deQueue());
    }

    public QueueViaStack() {
        stackNewest = new Stack<Integer>();
        stackOldest = new Stack<Integer>();
    }

    public int size() {
        return stackNewest.size() + stackOldest.size();
    }

    public void enQueue(int value) {
        stackNewest.push(value);
    }

    private void shiftStacks() {
        if (stackOldest.isEmpty()) {
            while (!stackNewest.isEmpty()) {
                int poppedOut = stackNewest.pop();
                stackOldest.push(poppedOut);
            }
        }
    }

    public int deQueue() {
        shiftStacks();
        return stackOldest.pop();
    }

    public int peek(){
        shiftStacks();
        return stackOldest.peek();

    }

}
