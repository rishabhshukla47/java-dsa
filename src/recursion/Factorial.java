package recursion;

public class Factorial {
    
    public static void main(String[] args){

        System.out.println(new Factorial().factorial(10));

    }

    public int factorial(int n){

        if(n == 0 || n == 1){
            return 1;
        }    

        if(n < 0){
            return -1;
        }

        return n * factorial(n-1);    

    }

}
