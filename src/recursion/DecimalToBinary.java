package recursion;

public class DecimalToBinary {
    
    public static void main(String[] args) {
        System.out.println(new DecimalToBinary().decimalToBinary(101));
    }

    public int decimalToBinary(int n){

        if(n == -1){
            return -1;
        }

        if(n == 0){
            return 0;
        }

        return n % 2 + 10 * decimalToBinary(n/2);

    }

}
