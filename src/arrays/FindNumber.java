// Write a program to to check if an array contains a number in Java.

package arrays;

public class FindNumber {
    
    public static void main(String[] args) {
        FindNumber index = new FindNumber();
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.print(index.searchInArray(arr, 5));
    }

    public int searchInArray(int[] intArray, int valueToSearch) {
        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] == valueToSearch){
                return i;
            }
        }
        return -1;
    }

}
