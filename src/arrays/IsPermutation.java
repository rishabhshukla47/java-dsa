// Your are given two integer arrays. Write a program to check if they are permutation of each other.

package arrays;

public class IsPermutation {

    public static void main(String[] args) {
        IsPermutation obj = new IsPermutation();
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {5, 3, 2, 4, 1};
        System.out.print(obj.permutation(arr1, arr2));
    }

    public boolean permutation(int[] array1, int[] array2) {

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            boolean output = ifInArr(array1[i], array2);
            if (output == false) {
                return false;
            }
        }
        return true;
    }

    public boolean ifInArr(int value, int[] array2) {
        for (int j = 0; j < array2.length; j++) {
            if (value == array2[j]) {
                return true;
            }
        }
        return false;
    }

}
