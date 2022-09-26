package stacks_queues.animal_shelter;

public class Main {
    
    public static void main(String[] args) {
        AnimalQueue animals = new AnimalQueue();
        animals.enqueue(new Cat("Kiki"));
        animals.enqueue(new Cat("Maya"));
        animals.enqueue(new Dog("Buller"));
        animals.enqueue(new Cat("Kitty"));
        animals.enqueue(new Dog("Baxtor"));

        System.out.println(animals.dequeueAny().name());
        System.out.println(animals.dequeueDogs().name());
        System.out.println(animals.dequeueCats().name());

    }

}
