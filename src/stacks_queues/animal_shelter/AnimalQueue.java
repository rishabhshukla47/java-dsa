package stacks_queues.animal_shelter;

import java.util.LinkedList;

public class AnimalQueue {
    
    LinkedList<Dog> dogs = new LinkedList<Dog>();
    LinkedList<Cat> cats = new LinkedList<Cat>();
    private int order = 0;


    //enqueue
    public void enqueue(Animal a){
        a.setOrder(order);
        order++;
        if(a instanceof Dog){
            dogs.addLast((Dog) a);
        } else if(a instanceof Cat){
            cats.addLast((Cat) a);
        }
    }

    public int size() {
        return dogs.size() + cats.size();
    }


    //Dequeue dogs
    public Dog dequeueDogs(){
        return dogs.pop();
    }


}
