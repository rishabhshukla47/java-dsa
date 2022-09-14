// Write a function to find all pairs of an integer array whose sum is equal to a given number.

package arrays;

public class Pairs {
    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
        System.out.println(Pairs.pairSum(arr, 7));

    }

    public static String pairSum(int[] myArray, int sum) {
        String output = "";
        for(int i =0; i<myArray.length; i++){
            for(int j = i+1; j< myArray.length; j++){
                if(myArray[i]+myArray[j] == sum){
                    output += myArray[i] + ":" + myArray[j] + " ";
                }    
            }
        }
        return output;
  }

}
