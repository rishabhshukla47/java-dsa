// How to find maximum product of two integers in the array where all elements are positive.

package arrays;

public class MaxProd {

    public static void main(String[] args) {

        MaxProd obj = new MaxProd();
        int arr[] = {10, 20 ,30, 40 ,50};
        System.out.print(obj.maxProduct(arr));

    }

    public String maxProduct(int[] intArray) {
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < intArray.length - j - 1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = temp;
                }
            }
        }

        return Integer.toString(intArray[intArray.length - 1]) + "," + Integer.toString(intArray[intArray.length - 2]);
    }

}
