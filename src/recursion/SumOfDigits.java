
// Sum of positive integers

package recursion;

public class SumOfDigits {
    
    public static void main(String[] args) {
        System.out.println(new SumOfDigits().sumOfDigits(324));
    }

    public int sumOfDigits(int n){

        // if(n%10 == n){
        //     return n;
        // }

        if(n == 0){
            return 0;
        }

        if(n < 0){
            return -1;
        }

        return n%10 + sumOfDigits(n/10);

    }

}
