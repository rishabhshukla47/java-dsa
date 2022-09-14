// Given 2D array calculate the sum of diagonal elements.

package arrays;

public class DiagonalSum {

    public static void main(String[] args) {
        DiagonalSum obj = new DiagonalSum();
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(obj.sumDiagonal(arr));
    }

    public int sumDiagonal(int[][] a) {

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][i];
        }
        return sum;
    }

}
