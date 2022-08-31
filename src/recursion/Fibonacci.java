package recursion;

public class Fibonacci {
    
    public static void main(String[] args) {
        System.out.println(new Fibonacci().fibonacci(5));
    }

    public int fibonacci(int n){

        if(n == 1){
            return 0;
        } 
        
        if(n == 2){
            return 1;
        }

        if(n < 1){
            return -1;
        }

        return fibonacci(n-1) + fibonacci(n-2);

    }

}
