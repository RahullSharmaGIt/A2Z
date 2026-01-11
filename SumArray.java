import java.util.*;


public class SumArray {
    public static int maxSubArray(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        int n = arr.length;
        int sum = 0;
        int start = 0;
        int ansStart = -1, ansEnd = -1;
        for (int i = 0; i < n; i++) {
            if (sum <= 0) {
                sum = arr[i];
                start = i;
            } else {
                sum += arr[i];
            }

            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }
        }

        if (ansStart == -1) {
            System.out.print("The Subarray []");
        } else {
            System.out.print("The Subarray [");
            for (int i = ansStart; i <= ansEnd; i++) {
                System.out.print(arr[i]  +"," + (i < ansEnd ? " " : ""));
            }
            System.out.print("]");
        }

        return maxi;

    }
     public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArray(arr);
        System.out.println(" has the largest sum: " + maxSum);

    }
}
