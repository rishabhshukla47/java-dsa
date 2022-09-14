// Write a function to find the duplicate number on given integer array.

package arrays;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        RemoveDuplicates obj = new RemoveDuplicates();
        int arr[] = { 2, 2, 2, 4, 5, 5, 1, 1, 1, 2, 2, 3, 4, 4, 4, 4, 5 };
        System.out.println(Arrays.toString(obj.removeDuplicates(arr)));
    }

    private static int removeDuplicates(int a[], int n) {
        Arrays.sort(a);
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[n - 1];
        return j;
    }

    public int[] removeDuplicates(int[] arr) {
        int result = removeDuplicates(arr, arr.length);
        int[] newArray = new int[result];
        for (int i = 0; i < result; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    // --------- Solution using Sets -------------- //

    // public int[] removeDuplicates(int[] arr)

    // {
    //     Set<Integer> set = new HashSet<>();
    //     Arrays.stream(arr).forEach(element -> set.add(element)); // Add to Set because it will filter by default.
    //     return set.stream().mapToInt(s -> s).toArray(); // Return int[]
    // }

}
