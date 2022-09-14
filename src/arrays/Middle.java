// Write a function called middle that takes a list and returns a new list that contains all but the first and last elements.

package arrays;

import java.util.Arrays;

public class Middle {
    
    public static void main(String[] args) {
        Middle obj = new Middle();
        int arr[] = {1, 2, 3, 4};
        System.out.print(Arrays.toString(obj.middle(arr)));
    }

    public int[] middle(int[] arr) {
        int newArray[];
        newArray = new int[arr.length-2];
        for(int i=1; i< arr.length-1 ; i++){
            newArray[i-1] = arr[i];
        }
        return newArray;
    }
    
}
