package stacks_queues.animal_shelter;

public class Dog extends Animal{

    public Dog(String n){
        super(n);
    }

    public String name(){
        return "Dog:" + name;
    }
    
}
