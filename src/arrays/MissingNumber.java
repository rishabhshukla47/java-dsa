// Find the missing number in an integer array of 1 to 10.

package arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };

        MissingNumber num = new MissingNumber();
        System.out.println(num.missingNumber(arr));

    }

    public int missingNumber(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }

        }
        return -1;

    }

}
