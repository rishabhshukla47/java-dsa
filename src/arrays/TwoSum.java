// Write a program to find all pairs of integers whose sum is equal to a given number.
// Assume only 1 sol exists

package arrays;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        TwoSum obj = new TwoSum();
        obj.twoSums(new int[]{1, 2, 7, 11, 15}, 9);

    }

    public void twoSums(int num[], int target) {

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    System.out.print(Arrays.toString(new int[]{i,j}));
                    return;
                }
            }
        }
        return;

    }

}
